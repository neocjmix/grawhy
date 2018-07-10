import './index.css';
import React from 'react';
import {renderToString} from 'react-dom/server';
import {Provider} from 'react-redux'
import {applyMiddleware, compose, createStore} from 'redux'
import ReduxLogger from 'redux-logger'
import App from "./components/app/App";
import root from './reducers'
import localStorageSynchronizer from "./enhancers/localStorageSynchronizer";

const store = createStore(
    root,
    compose(
        applyMiddleware(ReduxLogger),
        localStorageSynchronizer('state')
    )
);


window.render = template => template.replace('SERVER_RENDERED_HTML', renderToString(
<Provider store={store}>
    <App />
</Provider>));

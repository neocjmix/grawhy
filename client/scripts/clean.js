'use strict';

const fs = require('fs-extra');
const paths = require('../config/paths');

fs.removeSync(paths.appBuild);
console.log("cleaned npm build successfully.");




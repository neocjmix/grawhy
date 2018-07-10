package com.grawhy.www.config;

import jdk.nashorn.api.scripting.NashornScriptEngineFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;

import javax.script.ScriptEngine;

/**
 * Created by Frank.Park on 2018. 7. 10..
 */
@Configuration
public class WebTemplateConfiguration {
    @Bean
    public ViewResolver viewResolver(){
        return new ScriptTemplateViewResolver("/static/", ".html");
    }

    @Bean
    public ScriptTemplateConfigurer scriptTemplateConfigurer(ScriptEngine scriptEngine){
        ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
        configurer.setEngine(scriptEngine);
        configurer.setScripts("polyfill.js", "static/static/js/server.js");
        configurer.setRenderFunction("render");
        configurer.setSharedEngine(true);
        return configurer;
    }

    @Bean
    public ScriptEngine scriptEngine(){
        return new NashornScriptEngineFactory().getScriptEngine();
    }
}

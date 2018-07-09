package com.grawhy.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frank.Park on 2018. 7. 10..
 */
@Controller
@RequestMapping("/")
public class ResourcesController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}

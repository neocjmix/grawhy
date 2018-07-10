package com.grawhy.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frank.Park on 2018. 7. 10..
 */
@Controller
public class ResourcesController {
    @GetMapping("/{path:(?!.*.js|.*.css|.*.jpg).*$}")
    public String index(){
        return "index";
    }
}

package com.FluffyLiu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lsr on 6/29/15.
 */
@Controller
@RequestMapping("/")
public class Index {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}

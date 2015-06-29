package com.FluffyLiu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Lsr on 6/29/15.
 */
@Controller
@RequestMapping("/comcom")
public class comcom {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        return "comcomweb";
    }
}

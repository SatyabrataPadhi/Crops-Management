package com.mycomp.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by spadhi on 03/03/16.
 */
@RestController
public class SearchController extends BaseController{

    @RequestMapping("/search")
    public @ResponseBody String defaultMethod(){
        return "Welcome to PMS Search";
    }
}

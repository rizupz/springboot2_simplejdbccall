package com.rizupz.simplejdbccall.controllers;

import com.rizupz.simplejdbccall.ClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1")
public class APIv1 {

    @Autowired
    ClientBean clientBean;

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name){
        clientBean.findSum();
        return "hello";
    }
}

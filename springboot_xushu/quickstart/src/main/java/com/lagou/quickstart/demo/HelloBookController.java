package com.lagou.quickstart.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBookController {

    @RequestMapping(value = "/book/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello ,springboot!";
    }
}

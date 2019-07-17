package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(@RequestParam(name = "a")int a,
                       @RequestParam(name = "b")int b){
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        return "相加后结果为:" + (a+b);
    }

}

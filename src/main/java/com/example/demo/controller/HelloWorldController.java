package com.example.demo.controller;

import com.demo.random.randomservice.RandomAlgo;
import com.example.demo.logic.DateService;
import com.example.demo.vo.HelloWorldVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${demo.name}")
    private String name;

    @Autowired
    private DateService dateService;

    @Autowired
    private RandomAlgo randomAlgo;

    @RequestMapping("/hello/{text}")
    @Cacheable("helloWorldVo")
    public HelloWorldVo helloWorldVo(@PathVariable String text){
        HelloWorldVo helloWorldVo = new HelloWorldVo();

        helloWorldVo.setName(name);
        helloWorldVo.setText(text);
        helloWorldVo.setDate(dateService.getDate());
        helloWorldVo.setRandomNumber( randomAlgo.getRandom() );

        return helloWorldVo;
    }

}

//@RestController
//public class HelloWorldController {
//
//
//    @RequestMapping("/hello/{text}")
//    public HelloWorldVo helloWorldVo(@PathVariable String text){
//
//        HelloWorldVo helloWorldVo = new HelloWorldVo();
//        helloWorldVo.setText(text);
//        return helloWorldVo;
//
//    }
//
//}
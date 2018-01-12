package com.michael.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @EnableAutoConfiguration
 * 自动检测pom文件，判断应用类型
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/home")
    @ResponseBody
    public String bootTest(){
        return "HELLO WORLD!";
    }


}

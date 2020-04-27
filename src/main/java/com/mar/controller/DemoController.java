package com.mar.controller;

import com.mar.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 12:00
 */
@RestController
public class DemoController {

    @Autowired
    private Person person;

    /**
     * produces 解决中文乱码问题
     * @return
     */
    @RequestMapping(value = "/demo", produces = ("application/json; charset=utf-8"))
    public String demo(){
        return "你好aaaaaaa！ spring Boot";
    }

    /**
     * produces 解决中文乱码问题
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/person", produces = ("application/json; charset=utf-8"))
    public Person person(){
        return person;
    }
}

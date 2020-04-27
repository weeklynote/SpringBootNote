package com.mar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 12:00
 */
@Controller
public class LoginController {

    @RequestMapping("loginPage")
    public String getLoginPage(Model model){
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }

}

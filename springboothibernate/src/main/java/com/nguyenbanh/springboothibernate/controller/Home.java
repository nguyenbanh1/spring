package com.nguyenbanh.springboothibernate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class Home {

    @RequestMapping(value = {"/", "/customer-list"})
    public String listCustomer() {
        return "tang khanh nguyen";
    }

}

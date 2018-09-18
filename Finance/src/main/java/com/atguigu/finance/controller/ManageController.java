package com.atguigu.finance.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
    @RequestMapping("smp")
    public String index(){

        return "smp";
    }
    @RequestMapping("放款列表")
    public String Fangkuan(){

        return "放款列表";
    }
}

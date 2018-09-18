package com.atguigu.finance.controller;

import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.service.ManageService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class ContractController {

    @Autowired
    private ManageService manageService;

    @RequestMapping("Hetongliebiao")
    //@ResponseBody
    public String hetong(HttpServletRequest request){
        List<NplmContractAttribute>nplmContractAttributelist =  manageService.getContract();
        request.setAttribute("nplmContractAttributelist",nplmContractAttributelist);

        return "Hetongliebiao";
    }


}

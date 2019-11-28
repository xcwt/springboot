package com.xc.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * on 2019/11/28 9:41
 *
 * @author zhuweitao
 */
@Controller
public class HelloController {


    @RequestMapping("/zeroException")
    @ResponseBody
    public Integer zeroException(){

        return 100/100;
    }
}

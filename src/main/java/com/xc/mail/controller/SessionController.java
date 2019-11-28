package com.xc.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * on 2019/11/28 15:52
 *
 * @author zhuweitao
 */
@Controller
public class SessionController {


    @RequestMapping("session")
    @ResponseBody
    public Object session(HttpSession session,String name){
        session.setAttribute("aaa",name);
        return "OK";
    }
}

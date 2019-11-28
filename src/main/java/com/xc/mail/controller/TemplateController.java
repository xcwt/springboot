package com.xc.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * on 2019/11/28 10:59
 *
 * @author zhuweitao
 */
@Controller
public class TemplateController {

    /**
     * 返回html模板.
     */

    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }


    /**
     * 返回html模板.
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","from TemplateController.helloFtl");
        return"/helloFtl";
    }
}

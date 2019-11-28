package com.xc.mail.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * on 2019/11/28 9:35
 * 统一异常处理
 * @author zhuweitao
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    /**
     * 在该类中，可以定义多个方法，不同的方法处理不同的异常，例如专门处理空指针的方法、专门处理数组越界的方法...，也可以直接向上面代码一样，在一个方法中处理所有的异常信息
     * @param req
     * @param e
     */
    @ExceptionHandler(value = Exception.class) //@ExceptionHandler 注解用来指明异常的处理类型
    public void defaultErrorHandler(HttpServletRequest req, Exception e)  {

        //打印异常信息：

        e.printStackTrace();

        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");



        /*

         * 返回json数据或者String数据：

         * 那么需要在方法上加上注解：@ResponseBody

         * 添加return即可。

         */

        /*

         * 返回视图：

         * 定义一个ModelAndView即可，

         * 然后return;

         * 定义视图文件(比如：error.html,error.ftl,error.jsp);

         */
//        @ExceptionHandler(Exception.class)
//        public ModelAndView customException(Exception e) {
//            ModelAndView mv = new ModelAndView();
//            mv.addObject("message", e.getMessage());
//            mv.setViewName("myerror");
//            return mv;

    }
}

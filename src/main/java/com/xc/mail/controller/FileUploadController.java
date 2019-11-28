package com.xc.mail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * on 2019/11/28 11:34
 * 文件上传
 * @author zhuweitao
 */
@Controller
public class FileUploadController {

    /**
     * 访问路径为：http://127.0.0.1:8080/file
     * @return
     */
    @RequestMapping("/file")
    public String file(){
        return"/file";
    }

    /**
     * 文件上传具体实现方法;
     * @param file
     * @return
     */

    @RequestMapping("/upload")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile file){
        if(!file.isEmpty()){
            try {
                /*
                 * 这段代码执行完毕之后，图片上传到了工程的跟路径；
                 *
                 * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如：
                 * 1、文件路径；
                 * 2、文件名；
                 * 3、文件格式;
                 * 4、文件大小的限制;
                 */
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return"上传失败,"+e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return"上传失败,"+e.getMessage();
            }
            return"上传成功";
        }else{
            return"上传失败，因为文件是空的.";
        }
    }
}

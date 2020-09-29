package com.sforits.springbootedu.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/28-20:34 Created by IntelliJ IDEA.
 */
@Controller
@RequestMapping("file")
public class FileController {


    @RequestMapping("upload")
    public String upload(MultipartFile fileup, HttpServletRequest request) throws IOException {
        System.out.println("文件上传");
        //文件上传
        System.out.println("文件名称: " + fileup.getOriginalFilename());
        System.out.println("文件类型: " + fileup.getContentType());
        System.out.println("文件大小: " + fileup.getSize());

        // 处理文件上传
        String realPath = request.getServletContext().getRealPath("/static/files");
        System.out.println(realPath);
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        fileup.transferTo(new File(file, fileup.getOriginalFilename()));

        // 重定向必须加 '/' 否者会照成表单重复提交, 控制针异常
        return "redirect:/upload";
    }

    @RequestMapping("uploadplus")
    public String uploadPlus(MultipartFile fileup) throws IOException {
        System.out.println("文件上传..改进..");
        //文件上传
        System.out.println("文件名称: " + fileup.getOriginalFilename());
        System.out.println("文件类型: " + fileup.getContentType());
        System.out.println("文件大小: " + fileup.getSize());
        // 获取当前项目的位置
        String classpath = ResourceUtils.getURL("classpath:").getPath() + "/static/files/";
        System.out.println(classpath);

        File file = new File(classpath);
        if (!file.exists()) {
            file.mkdirs();
        }

        fileup.transferTo(new File(file, fileup.getOriginalFilename()));

        return "redirect:/upload";
    }

    /**
     * 文件下载
     */
    @RequestMapping("download")
    public void download(String fileName, HttpServletResponse response) throws IOException {
        // 根据文件名去指定目录中查找文件
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "static/files/";
        // 读取文件
        File file = new File(realPath, fileName);
        // 获取文件输入流
        FileInputStream is = new FileInputStream(file);
        // 获取响应输出流
        ServletOutputStream os = response.getOutputStream();

        //文件拷贝
        int len = 0;
        byte[] bytes = new byte[1024];
        while (true) {
            len = is.read(bytes);
            if (len == -1) {
                break;
            }
            os.write(bytes, 0, len);
        }

        // 关流
        is.close();
        os.close();
    }

    /**
     * 文件下载plus
     */
    @RequestMapping("downloadplus")
    public void downloadplus(String fileName, HttpServletResponse response) throws IOException {
        // 根据文件名去指定目录中查找文件
        String realPath = ResourceUtils.getURL("classpath:").getPath() + "static/files/";
        // 读取文件
        File file = new File(realPath, fileName);
        // 获取文件输入流
        FileInputStream is = new FileInputStream(file);

        // attachment: 附件下载     inline: 在线打开
        response.setHeader("content-disposition", "attachment;fileName=" + fileName);

        // 获取响应输出流
        ServletOutputStream os = response.getOutputStream();

        //文件拷贝  commons-fileupload提供的方式
        IOUtils.copy(is, os);

        // 关流 据说比较优雅
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
    }
}
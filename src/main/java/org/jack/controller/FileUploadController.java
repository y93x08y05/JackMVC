package org.jack.controller;

import org.jack.domain.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Author: Jack
 * @Date: 2018/9/18 14:36
 */
public class FileUploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam("description") String description, @RequestParam("file")MultipartFile file) throws Exception {
        System.out.println(description);
        if (!file.isEmpty()) {
            //上传文件路径
            String path=request.getServletContext().getRealPath("/images");
            //上传文件名
            String filename=file.getOriginalFilename();
            File filepath=new File(path,filename);
            //判断路径是否存在，不存在的话创建一个路径
            if(!filepath.getParentFile().exists())
                filepath.getParentFile().mkdir();
            //将上传文件保存到一个目录文件中
            file.transferTo(new File(path+File.separator+filename));
            return "success";
        } else {
            return "error";
        }
    }
    public String register(HttpServletRequest request, @ModelAttribute User user,Model model) throws Exception {
        System.out.println(user.getUsername());
        //如果文件不为空，写入上传路径
        if (!user.getImage().isEmpty()) {
            String path=request.getServletContext().getRealPath("/images");
            //上传文件名
            String filename=user.getImage().getOriginalFilename();
            File filepath=new File(path,filename);
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdir();
            }
            user.getImage().transferTo(new File(path+File.separator+filename));
            model.addAttribute("user",user);
            return "userInfo";
        } else {
            return "error";
        }
    }
}
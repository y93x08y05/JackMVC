package org.jack.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @Author: Jack
 * @Date: 2018/9/18 14:57
 */
public class User  implements Serializable {

    private String loginname;
    private String username;
    private MultipartFile image;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
}
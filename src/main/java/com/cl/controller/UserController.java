package com.cl.controller;


import com.cl.pojo.User;
import com.cl.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;


@RestController
@RequestMapping("/user")
public class UserController {
    //http://localhost:8080/XiaoMiShop_SSM_Vue/kaptcha.jpg 验证码

    //http://localhost:8080/XiaoMiShop_SSM_Vue/user/register
    @RequestMapping("/register")
    public ResultVO<Object> register(HttpSession session, @RequestBody User user){
        System.out.println("user = " + user);

        String token = (String) session.getAttribute(KAPTCHA_SESSION_KEY);
        session.removeAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("token = " + token);
        return null;
    }
}

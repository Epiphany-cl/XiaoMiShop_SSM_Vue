package com.cl.controller;

import com.cl.pojo.User;
import com.cl.service.UserService;
import com.cl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //http://localhost:8080/XiaoMiShop_SSM_Vue/kaptcha.jpg 验证码
    //http://localhost:8080/XiaoMiShop_SSM_Vue/register.html
    //http://localhost:8080/XiaoMiShop_SSM_Vue/user/register
    @RequestMapping("/register")
    public ResultVO<Object> register(HttpSession session,
                                     User user,
                                     String verificationCode) {

        String token = (String) session.getAttribute(KAPTCHA_SESSION_KEY);
        session.removeAttribute(KAPTCHA_SESSION_KEY);
        //判断验证码
        if (!verificationCode.equals(token)) {
            return new ResultVO<>(400, "验证码错误");
        }

        //线判断是否用户名是否否已经存在
        if (userService.isUserExist(user.getUserName())) {
            return new ResultVO<>(400, "用户名已经存在");
        }

        //如果不存在就注册
        if (userService.register(user)) {
            //将用户信息放入session中
            session.setAttribute("user", user);
            return new ResultVO<>(200, "注册成功");
        }

        return new ResultVO<>(444, "注册失败");
    }

    //http://localhost:8080/XiaoMiShop_SSM_Vue/login.html
    @RequestMapping("/getUserInfo")
    public ResultVO<User> getUserInfo(HttpSession session) {
        User user = (User) session.getAttribute("user");
        return new ResultVO<>(user);
    }

    @RequestMapping("/login")
    public ResultVO<User> login(HttpSession session,
                                @RequestBody User user) {
        //验证密码
        if (userService.login(user)) {
            session.setAttribute("user", user);
            return new ResultVO<>(200, "登录成功");
        }
        return new ResultVO<>(444, "登录失败");
    }
}

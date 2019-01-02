package cn.ltx.springmvc.controller;

import cn.ltx.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(User user) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getSex());
        System.out.println(user.getId());
        System.out.println("login");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
        System.out.println("logout");
        return "logout";
    }

    @RequestMapping("/register")
    public String register() {
        System.out.println("register");
        return "register";
    }
}

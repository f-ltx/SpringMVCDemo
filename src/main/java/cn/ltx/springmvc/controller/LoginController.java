package cn.ltx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
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

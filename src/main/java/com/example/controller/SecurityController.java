package com.example.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    @RequestMapping("/security/login/form")
    public String loginForm(Model model){
        model.addAttribute("message", "Vui long dang nhap");
        return "security/login";
    }

    @RequestMapping("/security/login/success")
    public String loginSuccess(Model model){
        model.addAttribute("message", "Dang nhap thanh cong");
        return "security/login";
    }

    @RequestMapping("/security/unauthoried")
    public String unauthoried(Model model){
        model.addAttribute("message", "khong co quyen");
        return "security/login";
    }

    @RequestMapping("/security/logoff/success")
    public String logoffSuccess(Model model){
        model.addAttribute("message", "Ban da dang xuat");
        return "security/login";
    }

    @RequestMapping("/security/login/error")
    public String loginError(Model model){
        model.addAttribute("message", "Sai Thong Tin Dang Nhap");
        return "security/login";
    }




}

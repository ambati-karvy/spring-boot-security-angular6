package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

	@RequestMapping("/login")
    public String login() {
        return "login.html";
    }


	/*@RequestMapping("/")
    public String loginPage() {
        return "login.html";
    }*/
}

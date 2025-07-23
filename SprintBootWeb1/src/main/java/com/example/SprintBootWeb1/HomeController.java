package com.example.SprintBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("home method called...");
        return "index";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        session.setAttribute("result",num1+num2);
        return "add";
    }

//    another way to perform same task above
//    public String add(@RequestParam("num1") int a,@RequestParam("num2") int b, HttpSession session){
//        session.setAttribute("result",a+b);
//        return "add.jsp";
//    }
}

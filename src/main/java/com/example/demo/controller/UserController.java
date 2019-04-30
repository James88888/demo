package com.example.demo.controller;

import com.example.demo.databean.POStudent;
import com.example.demo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private Services services;

    @RequestMapping("/go")
    public String init(HttpSession session, Model model){
        List<POStudent> query = services.query();
        model.addAttribute("list",query);

        return "init";
    }




}

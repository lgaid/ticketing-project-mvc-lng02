package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")

public class UserController {

    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
       // model.addAttribute("roles",find all roles from db);

        return "/user/create";
    }



}

package com.wmtower.passwordcreater.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.wmtower.passwordcreater.model.entity.CustomUser;
import com.wmtower.passwordcreater.service.IUserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuyf90
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource 
    private IUserService userService;
    
    @GetMapping(value="/all")
    public String all(HttpServletRequest request){
        List<CustomUser> userList=userService.getUserList();        
        request.setAttribute("userlist", userList);       
        return "pr/user_list";
    }
}

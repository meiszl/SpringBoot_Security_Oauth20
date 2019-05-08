package com.meiszl.oauth2.Controller;


import com.meiszl.oauth2.POJO.TbUser;
import com.meiszl.oauth2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public TbUser find(String username){
        TbUser userByName = userService.findUserByName(username);
        return userByName;
    }

}

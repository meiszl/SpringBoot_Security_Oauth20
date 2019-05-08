package com.meiszl.oauth2.Controller;


import com.meiszl.oauth2.POJO.TbPermission;
import com.meiszl.oauth2.Service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/testPer")
    public List<TbPermission> findPermissionByUserId(Long Id){
        return permissionService.findPermissionByUserId(Id);
    }
}

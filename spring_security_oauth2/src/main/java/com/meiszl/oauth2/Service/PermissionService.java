package com.meiszl.oauth2.Service;

import com.meiszl.oauth2.Mapper.PermissionMapper;
import com.meiszl.oauth2.POJO.TbPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    public List<TbPermission> findPermissionByUserId(Long id){
        List<TbPermission> tbPermissions = permissionMapper.selectPermissionByUserId(id);
        return tbPermissions;
    }
}

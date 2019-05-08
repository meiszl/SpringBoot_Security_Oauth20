package com.meiszl.oauth2.Service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.meiszl.oauth2.Mapper.UserMapper;
import com.meiszl.oauth2.POJO.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public TbUser findUserByName(String username){
        LambdaQueryWrapper<TbUser> findByName = new QueryWrapper<TbUser>().lambda().eq(TbUser::getUsername,username);
        TbUser tbUser = userMapper.selectOne(findByName);
        System.out.println(tbUser);
        return tbUser;
    }
}

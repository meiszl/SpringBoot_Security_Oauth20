package com.meiszl.oauth2.Service;

import com.meiszl.oauth2.POJO.TbPermission;
import com.meiszl.oauth2.POJO.TbUser;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailservice implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser userByName = userService.findUserByName(username);
        ArrayList<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (userByName != null){
            List<TbPermission> permissionByUserId = permissionService.findPermissionByUserId(userByName.getId());
            permissionByUserId.forEach(tbPermission -> {
                SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(simpleGrantedAuthority);
            });
        }
        return new User(userByName.getUsername(),userByName.getPassword(),grantedAuthorities);
    }
}

package com.meiszl.oauth2.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.meiszl.oauth2.POJO.TbPermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper extends BaseMapper<TbPermission> {
    @Select("SELECT p.* FROM tb_user AS u\n" +
            "LEFT JOIN tb_user_role as ur ON u.id = ur.user_id\n" +
            "LEFT JOIN tb_role as r ON r.id = ur.role_id\n" +
            "LEFT JOIN tb_role_permission AS rp ON r.id = rp.role_id\n" +
            "LEFT JOIN tb_permission AS p ON p.id = rp.permission_id\n" +
            "WHERE u.id = #{UserId}")
    List<TbPermission> selectPermissionByUserId(@Param("UserId") Long UserId);

}

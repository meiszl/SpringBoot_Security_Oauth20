package com.meiszl.oauth2.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.meiszl.oauth2.POJO.TbPermission;
import com.meiszl.oauth2.POJO.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface UserMapper extends BaseMapper<TbUser>{

}

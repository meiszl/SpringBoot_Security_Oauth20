package com.meiszl.Oauth2resources.Service;

import com.meiszl.Oauth2resources.Mapper.TbContentMapper;
import com.meiszl.Oauth2resources.pojo.tb_content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbContentService {
    @Autowired
    private TbContentMapper tbContentMapper;

    public List<tb_content> findAll(){
        return tbContentMapper.selectList(null);
    }
}

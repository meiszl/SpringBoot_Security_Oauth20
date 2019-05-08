package com.meiszl.Oauth2resources.Controller;


import com.meiszl.Oauth2resources.Mapper.TbContentMapper;
import com.meiszl.Oauth2resources.Service.TbContentService;
import com.meiszl.Oauth2resources.dto.ResponseResult;
import com.meiszl.Oauth2resources.pojo.tb_content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {
    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<tb_content>> List(){
        return new ResponseResult<List<tb_content>>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.findAll());
    }
}

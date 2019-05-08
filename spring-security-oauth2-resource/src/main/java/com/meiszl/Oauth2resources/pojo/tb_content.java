package com.meiszl.Oauth2resources.pojo;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class tb_content {
    private Long id;
    private Long category_id;
    private String title;
    private String sub_title;
    private String title_desc;
    private String url;
    private String pic;
    private String pic2;
    private String content;
    private Timestamp created;
    private Timestamp updated;
}

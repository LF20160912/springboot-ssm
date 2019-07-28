package com.mike.boot.boot.bootssmtkmybatis.mapper;

import com.mike.boot.boot.bootssmtkmybatis.commonmapper.BaseMapper;
import com.mike.boot.boot.bootssmtkmybatis.domain.BookInfo;


//@Mapper//将该接口的实体类对象交给springboot容器管理--每一个接口都配置不好维护，放在入口统一配置
public interface BookMapper extends BaseMapper<BookInfo> {
}

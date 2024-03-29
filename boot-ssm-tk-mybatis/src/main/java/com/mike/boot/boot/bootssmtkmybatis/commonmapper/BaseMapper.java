package com.mike.boot.boot.bootssmtkmybatis.commonmapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 项目中所有Mapper类的父类
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

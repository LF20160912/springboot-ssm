package com.mike.boot.boot.bootssmtkmybatis;

import com.mike.boot.boot.bootssmtkmybatis.domain.BookInfo;
import com.mike.boot.boot.bootssmtkmybatis.mapper.BookMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mike.boot.boot.bootssmtkmybatis.mapper")//指定Mapper扫描的包，支持扫描多个包
public class BootSsmTkMybatisApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootSsmTkMybatisApplication.class, args);
        BookMapper bookMapper = context.getBean(BookMapper.class);
        BookInfo bookInfo = bookMapper.selectByPrimaryKey(2);
        System.out.println(bookInfo);

        context.close();
    }

}

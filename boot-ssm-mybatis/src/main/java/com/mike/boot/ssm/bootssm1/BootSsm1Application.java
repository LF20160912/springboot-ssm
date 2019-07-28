package com.mike.boot.ssm.bootssm1;

import com.mike.boot.ssm.bootssm1.impl.BookDaompl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootSsm1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootSsm1Application.class, args);

//        BookDaompl book = context.getBean(BookDaompl.class);
//        System.out.println(book.selectOne(1));
        context.close();
    }

}

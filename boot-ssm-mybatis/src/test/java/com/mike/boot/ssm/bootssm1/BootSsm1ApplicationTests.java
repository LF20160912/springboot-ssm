package com.mike.boot.ssm.bootssm1;

import com.mike.boot.ssm.bootssm1.domain.BookInfo;
import com.mike.boot.ssm.bootssm1.mapper.BookMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BootSsm1ApplicationTests {

    @Resource
    private BookMapper bookMapper;

    @Test
    public void selectOne() {
        BookInfo bookInfo = bookMapper.getBookById(2);
        System.out.println(bookInfo);
    }

    @Test
    public void save() {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("魔童降世");
        bookInfo.setBookAuthor("佚名");
        bookInfo.setBookPrice(new BigDecimal(40));
        bookInfo.setBookDate(new Date(2019, 07, 26 ));

        bookMapper.saveBook(bookInfo);
    }

    @Test
    public void saveBatch() throws ParseException {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("魔童降世3");
        bookInfo.setBookAuthor("佚名3");
        bookInfo.setBookPrice(new BigDecimal(40));
        bookInfo.setBookDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-07-28"));
        List<BookInfo> books= new ArrayList<>();
        books.add(bookInfo);
        books.add(bookInfo);
        int rows=bookMapper.saveBookBatch(books);
        Assert.assertEquals(2,rows);
    }

}

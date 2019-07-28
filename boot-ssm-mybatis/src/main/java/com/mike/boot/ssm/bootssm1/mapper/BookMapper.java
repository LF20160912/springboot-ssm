package com.mike.boot.ssm.bootssm1.mapper;

import com.mike.boot.ssm.bootssm1.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//将该接口的实体类对象交给springboot容器管理
public interface BookMapper {
    /**
     * 根据ID获取书
     * @param id
     * @return
     */
    BookInfo getBookById(Integer id);

    /**
     * 保存
     * @param bookInfo
     * @return
     */
    int saveBook(BookInfo bookInfo);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int saveBookBatch(List<BookInfo> books);

}

package com.mike.boot.ssm.bootssm1.impl;


import com.mike.boot.ssm.bootssm1.domain.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class BookDaompl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class BookRowMapper implements RowMapper<BookInfo> {
        @Override
        public BookInfo mapRow(ResultSet resultSet, int i) throws SQLException {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookId(resultSet.getInt("book_id"));
            bookInfo.setBookName(resultSet.getString("book_name"));
            bookInfo.setBookAuthor(resultSet.getString("book_author"));
            bookInfo.setBookPrice(resultSet.getBigDecimal("book_price"));
            bookInfo.setBookDate(resultSet.getDate("book_date"));
            return bookInfo;
        }
    }

    public BookInfo selectOne(Integer bookId) {
        String sql = "select  book_id,book_name,book_author,book_price,book_date\n" +
                "        from  book\n" +
                "        where book_id= ?;" ;
        BookInfo bookInfo = jdbcTemplate.queryForObject(sql, new BookRowMapper(),bookId);
        return bookInfo;
    }
}

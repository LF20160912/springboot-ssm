package com.mike.boot.boot.bootssmtkmybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class BookInfo {
    @Id //标识主键，否则查不数据
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
}

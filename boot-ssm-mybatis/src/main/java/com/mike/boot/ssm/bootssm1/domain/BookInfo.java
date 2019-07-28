package com.mike.boot.ssm.bootssm1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;

//    public Integer getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Integer bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public String getBookAuthor() {
//        return bookAuthor;
//    }
//
//    public void setBookAuthor(String bookAuthor) {
//        this.bookAuthor = bookAuthor;
//    }
//
//    public BigDecimal getBookPrice() {
//        return bookPrice;
//    }
//
//    public void setBookPrice(BigDecimal bookPrice) {
//        this.bookPrice = bookPrice;
//    }
//
//    public Date getBookDate() {
//        return bookDate;
//    }
//
//    public void setBookDate(Date bookDate) {
//        this.bookDate = bookDate;
//    }
//
//    @Override
//    public String toString() {
//        return "BookInfo{" +
//                "bookId=" + bookId +
//                ", bookName='" + bookName + '\'' +
//                ", bookAuthor='" + bookAuthor + '\'' +
//                ", bookPrice=" + bookPrice +
//                ", bookDate=" + bookDate +
//                '}';
//    }
}

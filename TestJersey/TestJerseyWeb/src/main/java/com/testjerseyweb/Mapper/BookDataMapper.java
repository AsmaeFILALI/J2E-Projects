package com.testjerseyweb.Mapper;

import com.testjerseyweb.common.models.Book;
import com.testjerseyweb.data.BookData;

public class BookDataMapper {
    public  static BookData map(Book book){
        BookData bookData=new BookData();
        bookData.setId(book.getId());
        return bookData;
    }
}

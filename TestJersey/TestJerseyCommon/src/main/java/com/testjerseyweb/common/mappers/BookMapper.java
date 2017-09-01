package com.testjerseyweb.common.mappers;

import com.testjerseyweb.common.models.Book;
import com.testjerseyweb.dao.Entity.BookEntity;

public class BookMapper {

    public  static  Book map(BookEntity entity){
        Book res=new Book();
        res.setId(entity.getId());
        return res;
    }

}

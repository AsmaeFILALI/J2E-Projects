
package com.testjerseyweb.core.imp;


import com.testjerseyweb.common.mappers.BookMapper;
import com.testjerseyweb.common.models.Book;
import com.testjerseyweb.core.InfoCore;
import com.testjerseyweb.dao.Entity.BookEntity;
import com.testjerseyweb.dao.InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public  class InfoCoreImpl implements InfoCore {


    @Autowired
    @Qualifier("infoDao")
    InfoDao infoDao;

    public String getInfo() {
        return infoDao.gethello();
    }

    @Override
    public Book getBook() {
        BookEntity bookEntity= infoDao.findOne(Long.valueOf(1));
        return BookMapper.map(bookEntity);
    }
}

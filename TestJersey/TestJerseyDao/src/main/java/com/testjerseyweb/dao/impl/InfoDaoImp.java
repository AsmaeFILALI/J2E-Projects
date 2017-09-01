
package com.testjerseyweb.dao.impl;

import com.testjerseyweb.dao.Entity.BookEntity;
import com.testjerseyweb.dao.InfoDao;
import org.springframework.stereotype.Repository;


@Repository("infoDao")
public class InfoDaoImp implements InfoDao {

    public String gethello() {
        return "hello :)";
    }


    public <S extends BookEntity> S save(S s) {
        return null;
    }

    public <S extends BookEntity> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    public BookEntity findOne(Long aLong) {
        BookEntity bookEntity1 = new BookEntity();
        bookEntity1.setId(Long.valueOf(1));
        return bookEntity1;
    }

    public boolean exists(Long aLong) {
        return false;
    }

    public Iterable<BookEntity> findAll() {
        return null;
    }

    public Iterable<BookEntity> findAll(Iterable<Long> iterable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(Long aLong) {

    }

    public void delete(BookEntity bookEntity) {

    }

    public void delete(Iterable<? extends BookEntity> iterable) {

    }

    public void deleteAll() {

    }
}

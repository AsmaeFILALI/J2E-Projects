package com.testjerseyweb.dao;

import org.springframework.data.repository.CrudRepository;
import com.testjerseyweb.dao.Entity.BookEntity;

public interface InfoDao extends CrudRepository<BookEntity,Long>{
    public String gethello();
}

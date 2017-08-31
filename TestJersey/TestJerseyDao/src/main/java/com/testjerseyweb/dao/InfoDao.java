
package com.testjerseyweb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository("infoDao")
public class InfoDao  {

    public String gethello(){
        return "hello :)";
    }
}

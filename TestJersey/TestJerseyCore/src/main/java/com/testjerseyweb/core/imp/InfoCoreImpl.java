
package com.testjerseyweb.core.imp;


import com.testjerseyweb.core.InfoCore;
import com.testjerseyweb.dao.InfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public  class InfoCoreImpl implements InfoCore {


    //@Autowired
    //@Qualifier("infoDao")
    //InfoDao infoDao;

    public String getInfo() {
        return "Test info Spring";
    }
}

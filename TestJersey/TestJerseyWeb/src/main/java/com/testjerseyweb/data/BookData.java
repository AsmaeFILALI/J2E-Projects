package com.testjerseyweb.data;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class BookData {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

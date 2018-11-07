package com.dimonandpumba.diary.javafx.dao;


import com.dimonandpumba.diary.javafx.dto.Record;

public interface Dao {
    void add(Record record);
    void update(Record record);
    void delete(Record record);
}

package com.dimonandpumba.diary.dao;


import com.dimonandpumba.diary.dto.Record;

public interface Dao {
    void add(Record record);
    void update(Record record);
    void delete(Record record);
}

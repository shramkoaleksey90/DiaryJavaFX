package com.dimonandpumba.diary.javafx.dao;


public interface Dao {
    void add(Record record);
    void update(Record record);
    void delete(Record record);
}

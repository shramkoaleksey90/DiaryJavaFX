package com.dimonandpumba.diary.javafx.interfaces;

import com.dimonandpumba.diary.javafx.DAO.Record;

public interface Diary {
    void add(Record record);
    void update(Record record);
    void delete(Record record);
}

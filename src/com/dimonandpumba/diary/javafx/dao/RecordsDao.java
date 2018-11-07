package com.dimonandpumba.diary.javafx.dao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RecordsDao implements Dao {
    private ObservableList<Record> recordList = FXCollections.observableArrayList();
    @Override
    public void add(Record record) {
        recordList.add(record);
    }

    @Override
    public void update(Record record) {

    }

    @Override
    public void delete(Record record) {
        recordList.remove(record);
    }

    public ObservableList<Record>  getRecordArrayList(){
        return recordList;
    }
}

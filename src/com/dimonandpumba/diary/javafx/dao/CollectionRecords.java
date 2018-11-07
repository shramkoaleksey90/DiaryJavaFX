package com.dimonandpumba.diary.javafx.dao;

import com.dimonandpumba.diary.javafx.interfaces.Diary;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionRecords implements Diary {
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

    public void print(){
        int number = 0;
        for (Record record: recordList){
            number++;
            System.out.printf(" %s) subject = %s  exposition = %s%n"
                    ,number,record.getSubject(),record.getExposition());
        }
    }
    public void fillTestData(){
        recordList.add(new Record("task1","323232"));
        recordList.add(new Record("task2","326530"));
        recordList.add(new Record("task3","333333"));
        recordList.add(new Record("task4","444444"));
        recordList.add(new Record("task5","555555"));
    }
}

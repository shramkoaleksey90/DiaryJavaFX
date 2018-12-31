package com.dimonandpumba.diary.dao;

import com.dimonandpumba.diary.dto.Record;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.annotation.Nonnull;

public class RecordsIDao implements IDao<Record> {

    private final ObservableList<Record> recordList = FXCollections.observableArrayList();

    @Override
    public void add(@Nonnull Record record) {
        recordList.add(record);
    }

    @Override
    public void update(@Nonnull Record record) {

    }

    @Override
    public void delete(@Nonnull Record record) {
        recordList.remove(record);
    }

    @Nonnull
    public ObservableList<Record> getRecordArrayList() {
        return recordList;
    }
}

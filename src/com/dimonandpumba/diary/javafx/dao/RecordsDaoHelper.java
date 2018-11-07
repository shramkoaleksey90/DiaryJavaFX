package com.dimonandpumba.diary.javafx.dao;

import com.dimonandpumba.diary.javafx.dto.Record;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;

public class RecordsDaoHelper {

    public static void print(@Nonnull List<Record> records) {
        for (int i = 0; i < records.size(); ++i) {
            System.out.println(records.get(i));
        }
    }

    public static List<Record> fillTestData() {
        return Arrays.asList(new Record("task1", "323232"),
                new Record("task2", "326530"),
                new Record("task3", "333333"),
                new Record("task4", "444444"),
                new Record("task5", "555555"));
    }
}

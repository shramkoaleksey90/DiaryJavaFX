package com.dimonandpumba.diary.javafx.logic.sample;

import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

class AnchorPaneCalendar extends AnchorPane {

    private ArrayList<AnchorPaneCalendar> anchorPaneCalendars = new ArrayList<>(35);

    void addElementToList(AnchorPane anchorPane){
        anchorPaneCalendars.add((AnchorPaneCalendar) anchorPane);
    }
    ArrayList<AnchorPaneCalendar> getAllCalendarDays() {
        return anchorPaneCalendars;
    }
}

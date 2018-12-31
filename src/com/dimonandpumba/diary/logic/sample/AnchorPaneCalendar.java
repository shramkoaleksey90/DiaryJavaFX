package com.dimonandpumba.diary.logic.sample;

import javafx.scene.layout.AnchorPane;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

class AnchorPaneCalendar extends AnchorPane {

    private final List<AnchorPaneCalendar> anchorPaneCalendars = new ArrayList<>(35);

    void addElementToList(@Nonnull AnchorPane anchorPane) {
        anchorPaneCalendars.add((AnchorPaneCalendar) anchorPane); // wtf
    }
    @Nonnull
    List<AnchorPaneCalendar> getAllCalendarDays() {
        return anchorPaneCalendars;
    }
}

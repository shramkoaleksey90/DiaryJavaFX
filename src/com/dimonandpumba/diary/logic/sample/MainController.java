package com.dimonandpumba.diary.logic.sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MainController {
    @FXML
    private GridPane GrdPane;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button changeButton;
    @FXML
    public ComboBox<Month> monthComboBox;

    private AnchorPaneCalendar anchorPaneCalendar = new AnchorPaneCalendar();

    @FXML
    private void initialize() {
        LocalDate dateToday = LocalDate.now();
        getGrinPane();
        initComboBox(dateToday);
    }

    private void getGrinPane() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                AnchorPaneCalendar ap = new AnchorPaneCalendar();
                ap.setPrefSize(200, 200);
                GrdPane.add(ap, j, i);
                anchorPaneCalendar.addElementToList(ap);
            }
        }
    }

    private void initComboBox(LocalDate dateToday) {
        monthComboBox.getItems().addAll(
                MainHelper.MONTHS
        );
        monthComboBox.getSelectionModel().select(dateToday.getMonthValue() - 1);
        monthComboBox.setVisibleRowCount(5);
        initCalendar(monthComboBox.getValue().toString(), dateToday);
        monthComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initCalendar(monthComboBox.getValue().toString(), dateToday);
            }
        });
    }

    private void initCalendar(String month, LocalDate date) {
        date = LocalDate.of(date.getYear(), Month.valueOf(month.toUpperCase()), 1);
        while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
            date = date.minusDays(1);
        }
        for (AnchorPaneCalendar ap : anchorPaneCalendar.getAllCalendarDays()) {
            if (!ap.getChildren().isEmpty()) {
                ap.getChildren().remove(0);
            }
            Text txt = new Text(String.valueOf(date.getDayOfMonth()));
            ap.setTopAnchor(txt, 5.0);
            ap.setLeftAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            date = date.plusDays(1);
        }
    }

    public void showAddDialog(ActionEvent actionEvent) {

        try {

            addButton.setText("showing");

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../../ui/fxml/edit.fxml"));
            stage.setTitle("Add Event");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

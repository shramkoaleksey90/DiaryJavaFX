package com.dimonandpumba.diary.logic.sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

public class MainController {
    @FXML
    private GridPane gridPane;
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
        getGrinPane();
        initComboBox(LocalDate.now());
    }

    private void getGrinPane() {
        for (int i = 0; i < 6; i++) { //  6 wtf
            for (int j = 0; j < 7; j++) {
                final AnchorPaneCalendar ap = new AnchorPaneCalendar();
                ap.setPrefSize(200, 200);
                gridPane.add(ap, j, i);
                anchorPaneCalendar.addElementToList(ap);
            }
        }
    }

    private void initComboBox(LocalDate dateToday) {
        monthComboBox.setItems(
                FXCollections.observableArrayList(Month.values())
        );
        Month month = dateToday.getMonth();
        monthComboBox.getSelectionModel().select(month);
        monthComboBox.setVisibleRowCount(5); //wtf
        initCalendar(month, dateToday);
        monthComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initCalendar(monthComboBox.getValue(), dateToday);
            }
        });
    }

    private void initCalendar(final Month month, final LocalDate date) {
//        date = LocalDate.of(date.getYear(), month, 1); this is bad idea think about why
        LocalDate initDate = LocalDate.of(date.getYear(), month, 1);
        while (initDate.getDayOfWeek() != DayOfWeek.MONDAY) {
            initDate = initDate.minusDays(1);
        }

        // what the fuck this code do
        for (AnchorPaneCalendar ap : anchorPaneCalendar.getAllCalendarDays()) {
            if (!ap.getChildren().isEmpty()) {
                ap.getChildren().remove(0);
            }
            final String text = Objects.toString(initDate.getDayOfMonth());
            final Text txt = new Text(text);
            AnchorPane.setTopAnchor(txt, 5.0);
            AnchorPane.setLeftAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            initDate = initDate.plusDays(1);
        }
    }

    public void showAddDialog(ActionEvent actionEvent) {

        try {

            addButton.setText("showing");

            final Stage stage = new Stage();
            final Parent root = FXMLLoader.load(getClass().getResource("../../ui/fxml/edit.fxml"));
            stage.setTitle("Add Event");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();// LOGGER would be better
        }
    }
}

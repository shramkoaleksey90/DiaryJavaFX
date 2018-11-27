package com.dimonandpumba.diary.javafx.logic.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

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
    public ComboBox monthComboBox;

    @FXML
    private void initialize (){
        initComboBox();
    }

    public void initComboBox() {
        monthComboBox.getItems().addAll(
                MainHelper.ALL_MONTHS_NAMES
        );
        monthComboBox.setValue("January");
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
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

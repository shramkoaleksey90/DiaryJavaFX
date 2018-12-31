package com.dimonandpumba.diary.logic.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditDialogController {
    @FXML
    private ChoiceBox<String> priorityChoiceBox; // avoid raw types...
    @FXML
    private ChoiceBox timeStartChoiceBox;
    @FXML
    private ChoiceBox timeFinishChoiceBox;
    @FXML
    private TextField subjectTextField;
    @FXML
    private TextArea expositionTextArea;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    @FXML
    private void initialize() {
        final ObservableList<String> value = FXCollections.observableArrayList("LOW", "NORMAL", "HIGH");
        priorityChoiceBox.setItems(value);
        priorityChoiceBox.setValue("NORMAL");
    }

}

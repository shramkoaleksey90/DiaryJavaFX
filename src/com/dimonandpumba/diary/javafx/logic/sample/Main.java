package com.dimonandpumba.diary.javafx.logic.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../ui/fxml/main.fxml"));
        primaryStage.setTitle("DiaryJavaFX");
        Scene  scene = new Scene(root, 628, 501);
        scene.getStylesheets().add(0, "com/dimonandpumba/diary/javafx/ui/styles/main.css");
        primaryStage.setScene(scene);
        //primaryStage.setMinWidth(400);
        //primaryStage.setMinHeight(400);
        primaryStage.setResizable(false);
        primaryStage.show();
       // testData();
    }
/*
    private void testData() {
        CollectionRecords recordBook = new CollectionRecords();
        recordBook.fillTestData();
        recordBook.print();
    }
*/

    public static void main(String[] args) {
        launch(args);
    }
}

package com.dimonandpumba.diary.logic.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.annotation.Nonnull;


public class Main extends Application {

    private static final int WIDTH = 628;
    private static final int HEIGHT = 501;
    private static final String PATH = "../../ui/fxml/main.fxml";
    private static final String APP_NAME = "DiaryJavaFX";

    @Override
    public void start(@Nonnull Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource(PATH));
        primaryStage.setTitle(APP_NAME);
        final Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.getStylesheets().add(0, "com/dimonandpumba/diary/ui/styles/main.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

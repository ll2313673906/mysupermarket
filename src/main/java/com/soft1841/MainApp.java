package com.soft1841;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/xtsy.fxml"));

        primaryStage.setTitle("超市");
        primaryStage.setScene(new Scene(root, 800, 600));


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
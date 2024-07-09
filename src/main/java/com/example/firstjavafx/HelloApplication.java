package com.example.firstjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300  );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void testMethod(){
        System.out.println("I'm now in the test method,and going to launch the");
        launch();
        System.out.println("Window closed and going to leave the test method");
    }

    public static void main(String[] args) {
        launch();
    }
}
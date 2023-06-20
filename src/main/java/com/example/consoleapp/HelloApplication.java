package com.example.consoleapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
//  @Override
//  public void start(Stage stage) throws IOException {
//    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//    stage.setTitle("Hello!");
//    stage.setScene(scene);
//    stage.show();
//  }

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws Exception {
    Group group = new Group();
    Image icon = new Image(System.getenv("IMAGE"));
    Scene scene = new Scene(group, Color.YELLOW);

    stage.setWidth(420);
    stage.setHeight(420);
    stage.setResizable(false);

    stage.setTitle("Cool title");
    stage.getIcons().add(icon);
    stage.setScene(scene);
    stage.show();
  }
}
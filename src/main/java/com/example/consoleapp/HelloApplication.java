package com.example.consoleapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
  public void start(Stage stage) {
    Group root = new Group();
    Image icon = new Image(System.getenv("IMAGE"));
    Scene scene = new Scene(root,500, 500, Color.YELLOW);
    stage.setResizable(false);

    Text text = new Text(50, 50,"Chiiick!");
    text.setFont(Font.font("Nathan", 30));
    text.setFill(Color.BLUEVIOLET);

    Line line = new Line(250, 100, 450, 100);
    line.setStroke(Color.GREEN);
    line.setStrokeWidth(20);
    line.setRotate(30);

    root.getChildren().add(text);
    root.getChildren().add(line);
    stage.setTitle("Cool title");
    stage.getIcons().add(icon);
    stage.setScene(scene);
    stage.show();
  }
}
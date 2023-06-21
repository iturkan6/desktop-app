package com.example.consoleapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
    Scene scene = new Scene(root, 500, 500, Color.YELLOW);
    stage.setResizable(false);

    Text text = new Text(50, 50, "Chiiick!");
    text.setFont(Font.font("Nathan", 30));
    text.setFill(Color.BLUEVIOLET);

    Line line = new Line(250, 100, 450, 100);
    line.setStroke(Color.GREEN);
    line.setStrokeWidth(20);
    line.setRotate(30);

    Rectangle rectangle = new Rectangle();
    rectangle.setX(100);
    rectangle.setY(300);
    rectangle.setWidth(100);
    rectangle.setHeight(100);
    rectangle.setFill(Color.BLACK);
    rectangle.setStroke(Color.WHITE);
    rectangle.setStrokeWidth(10);

    Polygon triangle = new Polygon();
    triangle.getPoints().addAll(
        350.0, 250.0,
        300.0, 300.0,
        400.0, 300.0
    );
    triangle.setFill(Color.DEEPPINK);
    triangle.setStroke(Color.BLUEVIOLET);
    triangle.setStrokeWidth(5);

    Circle circle = new Circle();
    circle.setCenterX(400);
    circle.setCenterY(400);
    circle.setFill(Color.MAROON);
    circle.setRadius(20);

    Image image = new Image(System.getenv("IMAGE_2"));
    ImageView imageView = new ImageView(image);
    imageView.setX(50);
    imageView.setY(90);
    imageView.setFitHeight(200);
    imageView.setFitWidth(230);

    root.getChildren().add(text);
    root.getChildren().add(line);
    root.getChildren().add(rectangle);
    root.getChildren().add(triangle);
    root.getChildren().add(circle);
    root.getChildren().add(imageView);
    stage.setTitle("Cool title");
    stage.getIcons().add(icon);
    stage.setScene(scene);
    stage.show();
  }
}
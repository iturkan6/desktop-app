module com.example.consoleapp {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.consoleapp to javafx.fxml;
  exports com.example.consoleapp;
}
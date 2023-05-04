package dev.cosmingherghe.firstapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Application");
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);

        Label text = new Label("");
        Button button = new Button("Click me!");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application!"));

        root.getChildren().addAll(text, button);
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package dev.cosmingherghe.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
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
//        Platform.setImplicitExit(false);
        stage.setTitle("JavaFX Application");
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(20);

        Label text = new Label("");
        Button button = new Button("Click me!");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application!"));

        Button button1 = new Button("Exit");
        button1.setOnAction(e -> Platform.exit());

        root.getChildren().addAll(text, button, button1);
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println(Thread.currentThread().getName()
        + "\nApp exits.");
    }

    public static void main(String[] args) {
        launch();
    }
}
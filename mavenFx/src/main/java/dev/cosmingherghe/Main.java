package dev.cosmingherghe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        Label label = new Label("Hello");
        root.getChildren().addAll(label);
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("MavenFX");
        stage.setScene(scene);
        stage.show();
    }
}
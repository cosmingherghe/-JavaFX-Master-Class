package dev.cosmingherghe.layouts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane pane = new AnchorPane();
        Button bottomRight = new Button("Bottom Right");
        Button topLeft = new Button("Top Left");

        AnchorPane.setBottomAnchor(bottomRight, 10.0);
        AnchorPane.setRightAnchor(bottomRight, 10.0);

        AnchorPane.setTopAnchor(topLeft, 10.0);
        AnchorPane.setLeftAnchor(topLeft, 10.0);

        pane.getChildren().addAll(topLeft, bottomRight);

        Scene scene = new Scene(pane, 800, 800);
        stage.setTitle("AnchorPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
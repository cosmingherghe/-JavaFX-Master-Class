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
        GridPane pane = new GridPane();
//        pane.setGridLinesVisible(true);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.requestFocus();
        pane.setAlignment(Pos.CENTER);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");

        Label label = new Label("A rectagnle");

//        1ST Way to add elements to the panel
//        GridPane.setConstraints(b1, 0, 0);
//        GridPane.setConstraints(b2, 1, 0);
//        GridPane.setConstraints(b3, 1, 1);
//        GridPane.setConstraints(label, 0, 1);
//        pane.getChildren().addAll(b1, b2, b3, label);

//        2ND Way of adding elements together
//        pane.add(b1, 0, 0);
//        pane.add(b2, 1, 0);
//        pane.add(b3, 1, 1);
//        pane.add(label, 0, 1);

//        3RD Way
          pane.addRow(0, b1, b2, b3);
          pane.add(label, 0,1, GridPane.REMAINING, 1);

        Scene scene = new Scene(pane, 800, 800);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
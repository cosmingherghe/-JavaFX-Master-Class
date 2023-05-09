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
        pane.setGridLinesVisible(true);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.requestFocus();
        pane.setAlignment(Pos.CENTER);

        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                Button btn = new Button(col + "|" + row);
                pane.add(btn, col, row);
            }
        }

        ColumnConstraints cc1 = new ColumnConstraints(100);
        cc1.setHalignment(HPos.LEFT);
        ColumnConstraints cc2 = new ColumnConstraints(200);
        cc2.setHalignment(HPos.CENTER);
        ColumnConstraints cc3 = new ColumnConstraints(200);
        cc3.setHalignment(HPos.RIGHT);

        RowConstraints rc1 = new RowConstraints(50);
        rc1.setValignment(VPos.TOP);
        RowConstraints rc2 = new RowConstraints(70);
        rc2.setValignment(VPos.CENTER);
        RowConstraints rc3 = new RowConstraints(60);
        rc3.setValignment(VPos.CENTER);

        pane.getColumnConstraints().addAll(cc1,cc2,cc3);
        pane.getRowConstraints().addAll(rc1,rc2,rc3);

        Scene scene = new Scene(pane, 800, 800);
        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package dev.cosmingherghe;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Field;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        //Demonstrating Proprieties
        Employee employee = new Employee("John", 80000);
        Label label = new Label("Name " + employee.getName() + " | Salary: " + employee.getSalary());
        Scene scene = new Scene(root, 400, 400);
        Button button = new Button("Double salary");

        button.setOnAction(e -> {
            int salary = employee.getSalary();
            employee.setSalary(salary * 2);
        });

        employee.salaryProperty().addListener(o -> {
            label.setText("Name " + employee.getName() + " | Salary: " + employee.getSalary());
        });

        //Demonstrating Bindings
        Label label1 = new Label("Enter Something");
        TextField field = new TextField();
        TextField field1 = new TextField();
        field.setMaxWidth(200);

        //Binding API
        // label1.textProperty().bind(field.textProperty());
        field1.textProperty().bindBidirectional(field.textProperty());

        //Observable List
        ObservableList<String> list = FXCollections.observableArrayList("1", "2", "3");
        ListView<String> items = new ListView<>();
        Button button1 = new Button("Add");
        TextField field2 = new TextField();

        items.setItems(list);
        field2.setMaxWidth(100);
        items.setMaxWidth(100);
        button1.setOnAction(e -> {
            if(!field2.textProperty().get().isEmpty()) {
                list.add(field2.getText());
            }
        });

        // Wrapping all together
        root.getChildren().addAll(label, button, label1, field, field1, items, field2, button1);
        stage.setTitle("Properties Example");
        stage.setScene(scene);
        stage.show();
    }
}
package dev.cosmingherghe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

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

        root.getChildren().addAll(label, button);
        stage.setTitle("Properties Example");
        stage.setScene(scene);
        stage.show();
    }
}
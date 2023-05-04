module dev.cosmingherghe.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.cosmingherghe.firstapp to javafx.fxml;
    exports dev.cosmingherghe.firstapp;
}
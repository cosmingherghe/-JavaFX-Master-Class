module dev.cosmingherghe.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.cosmingherghe.layouts to javafx.fxml;
    exports dev.cosmingherghe.layouts;
}
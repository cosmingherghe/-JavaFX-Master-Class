// Modules are packages system in Java
// allowing you to group more related packages into one unit
// and then describing or encapsulating what packages are available
module mavenFx {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.cosmingherghe to javafx.fxml;
    exports dev.cosmingherghe;
}
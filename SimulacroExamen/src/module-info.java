module SimulacroExamen {
    requires javafx.media;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens adri.vista to javafx.fxml;

    exports adri;
    exports adri.vista;
    exports adri.model;
}

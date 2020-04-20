module SimulacroExamen {
    requires javafx.media;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens adri.vistas to javafx.fxml;

    exports adri;
    exports adri.vistas;
    exports adri.model;
}

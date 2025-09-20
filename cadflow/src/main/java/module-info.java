module com.mycompany.cadflow {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.mycompany.cadflow to javafx.fxml;
    exports com.mycompany.cadflow;
}

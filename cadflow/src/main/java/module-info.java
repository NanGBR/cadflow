module com.mycompany.cadflow {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cadflow to javafx.fxml;
    exports com.mycompany.cadflow;
}

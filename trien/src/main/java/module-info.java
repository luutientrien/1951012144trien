module com.mycompany.trien {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.trien to javafx.fxml;
    exports com.mycompany.trien;
}

module com.example.jeffreydanquah {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens com.example.danquah0246 to javafx.fxml;
    exports com.example.danquah0246.controller;
    opens com.example.danquah0246.controller to javafx.fxml;
    exports com.example.danquah0246.Repository;
    opens com.example.danquah0246.Repository to javafx.fxml;
}
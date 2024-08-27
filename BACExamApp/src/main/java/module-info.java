module com.example.btsexamapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.btsexamapp to javafx.fxml;
    exports com.example.btsexamapp;
}
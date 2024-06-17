module com.example.javaalgorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaalgorithm to javafx.fxml;
    exports com.example.javaalgorithm;
}
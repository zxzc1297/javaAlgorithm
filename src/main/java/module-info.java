module com.example.javaalgorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaAlgorithm to javafx.fxml;
    exports com.example.javaAlgorithm;
}
module com.ictec.javafx_bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ictec.javafx_bmicalculator to javafx.fxml;
    exports com.ictec.javafx_bmicalculator;
}
module org.example.test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens org.example.test2 to javafx.fxml;
    exports org.example.test2;
}
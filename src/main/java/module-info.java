module com.example.projemizinilkguitasarimi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires junit;
    requires org.junit.jupiter.api;


    opens com.example.projemizinilkguitasarimi to javafx.fxml;
    exports com.example.projemizinilkguitasarimi;
}
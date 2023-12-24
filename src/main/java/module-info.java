module com.example.projemizinilkguitasarimi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.desktop;


    opens com.example.projemizinilkguitasarimi to javafx.fxml;
    exports com.example.projemizinilkguitasarimi;
}
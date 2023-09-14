module com.jgbinegar.arithmeticlibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jgbinegar.arithmeticlibrary to javafx.fxml;
    exports com.jgbinegar.arithmeticlibrary;
}
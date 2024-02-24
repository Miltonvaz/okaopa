module com.milton.concesionaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;



    opens com.milton.concesionaria to javafx.fxml;
    exports com.milton.concesionaria;
    exports com.milton.concesionaria.controllers;
    opens com.milton.concesionaria.controllers to javafx.fxml;
    exports com.milton.concesionaria.Consesionario;
    opens com.milton.concesionaria.Consesionario to javafx.fxml;
}
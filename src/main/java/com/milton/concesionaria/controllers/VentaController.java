package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VentaController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField settextmodel;

        @FXML
        private TextField setTextAÑO;

        @FXML
        private TextField setTextcolor;

        @FXML
        private TextField setTextSerie;

        @FXML
        private TextField setTextPrecio;

        @FXML
        private Button bttonaceptar;

        @FXML
        private Button btonCancelar;

        @FXML
       public void bttaceptarClick(ActionEvent event) {
            String modelo = settextmodel.getText();
            String año = setTextAÑO.getText();
            String color = setTextcolor.getText();
            String serie = setTextSerie.getText();
            String precio = setTextPrecio.getText();

            System.out.println("Modelo : [" + modelo +"]");
            System.out.println("Año : [" + año +"]");
            System.out.println("Color : [" + color +"]");
            System.out.println("Serie : [" + serie +"]");
            System.out.println("Precio : [" + precio +"]");
            Alert alert;
            if (modelo.isEmpty() || año.isEmpty() || color.isEmpty() || serie.isEmpty() || precio.isEmpty()) {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Faltan datos...");
                alert.setHeaderText("Faltan datos por introducir en el formulario.");
                alert.setContentText("Debe introducir el modelo, año, color , serie,precio ");
                setTextAÑO.requestFocus();
                settextmodel.requestFocus();
                setTextcolor.requestFocus();
                setTextPrecio.requestFocus();
                setTextSerie.requestFocus();
            } else {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Datos introducidos en el formulario...");
                alert.setHeaderText("Ha introducido correctamente los " +
                        "datos en el formulario. Se muestran a continuación.");
                alert.setContentText("Modelo: " + modelo +
                        System.lineSeparator() + "Año: " + año + System.lineSeparator() + "Color :" + color +
                        System.lineSeparator() + "Serie :"+ serie + System.lineSeparator() + "Precio" + precio);
            }
            alert.showAndWait();
        }


        @FXML
        void initialize() {
            assert settextmodel != null : "fx:id=\"settextmodel\" was not injected: check your FXML file 'Venta.fxml'.";
            assert setTextAÑO != null : "fx:id=\"setTextAÑO\" was not injected: check your FXML file 'Venta.fxml'.";
            assert setTextcolor != null : "fx:id=\"setTextcolor\" was not injected: check your FXML file 'Venta.fxml'.";
            assert setTextSerie != null : "fx:id=\"setTextSerie\" was not injected: check your FXML file 'Venta.fxml'.";
            assert setTextPrecio != null : "fx:id=\"setTextPrecio\" was not injected: check your FXML file 'Venta.fxml'.";
            assert bttonaceptar != null : "fx:id=\"bttonaceptar\" was not injected: check your FXML file 'Venta.fxml'.";
            assert btonCancelar != null : "fx:id=\"btonCancelar\" was not injected: check your FXML file 'Venta.fxml'.";

        }
}



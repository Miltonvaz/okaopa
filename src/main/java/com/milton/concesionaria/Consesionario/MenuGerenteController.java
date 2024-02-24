package com.milton.concesionaria.Consesionario;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuGerenteController {

    public void bttonOnVender(ActionEvent actionEvent) {
    }

    public void OnbttonVender(MouseEvent mouseEvent) {
    }

    public void bttonOnagendar(ActionEvent actionEvent) {
    }

    public void OnbttonAngendar(MouseEvent mouseEvent) {
    }

    public void OnsSeBtto(ActionEvent actionEvent) {
    }

    public void OnbttonSee(MouseEvent mouseEvent) {
    }

    public class MenuGerenteView {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button bttonVender;

        @FXML
        private Button bttonAgendar;

        @FXML
        private Button bttonSee;

        @FXML
        void OnbttonAngendar(MouseEvent event) {

        }

        @FXML
        void OnbttonSee(MouseEvent event) {

        }

        @FXML
        void OnbttonVender(MouseEvent event) {

        }

        @FXML
        void OnsSeBtto(ActionEvent event) {

        }

        @FXML
        void bttonOnVender(ActionEvent event) {

        }

        @FXML
        void bttonOnagendar(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert bttonVender != null : "fx:id=\"bttonVender\" was not injected: check your FXML file 'menuGerente-view.fxml'.";
            assert bttonAgendar != null : "fx:id=\"bttonAgendar\" was not injected: check your FXML file 'menuGerente-view.fxml'.";
            assert bttonSee != null : "fx:id=\"bttonSee\" was not injected: check your FXML file 'menuGerente-view.fxml'.";

        }
    }
}


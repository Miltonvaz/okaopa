package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class AutoController {



        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField tex1;

        @FXML
        private TextField text2;

        @FXML
        private TextField text3;

        @FXML
        private TextField text4;

        @FXML
        private TextField text5;

        @FXML
        private TextField text6;

        @FXML
        private TextField text7;

        @FXML
        private TextField text8;

        @FXML
        private Button bttonaceptar;

        @FXML
        private Button Bttonsalir;

        @FXML
        void Bttonsalir(ActionEvent event) {

        }

        @FXML
        void bttonaceptar(ActionEvent event) {

        }

        @FXML
        void onBttonsalir(MouseEvent event) {

        }

        @FXML
        void onbttonaceptar(MouseEvent event) {

        }

        @FXML
        void initialize() {
            assert tex1 != null : "fx:id=\"tex1\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text4 != null : "fx:id=\"text4\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text5 != null : "fx:id=\"text5\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text6 != null : "fx:id=\"text6\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text7 != null : "fx:id=\"text7\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert text8 != null : "fx:id=\"text8\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert bttonaceptar != null : "fx:id=\"bttonaceptar\" was not injected: check your FXML file 'datoauto-view.fxml'.";
            assert Bttonsalir != null : "fx:id=\"Bttonsalir\" was not injected: check your FXML file 'datoauto-view.fxml'.";

        }
    }



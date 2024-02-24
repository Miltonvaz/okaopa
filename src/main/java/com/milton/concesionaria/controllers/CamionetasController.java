package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class CamionetasController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField text1;

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
        private RadioButton bttonsi;

        @FXML
        private TextField text7;

        @FXML
        private Button bttonaceptar;

        @FXML
        private Button Bttoncancelar;

        @FXML
        void Bttoncancelar(ActionEvent event) {

        }

        @FXML
        void Onbttonsi(MouseEvent event) {

        }

        @FXML
        void bttonaceptar(ActionEvent event) {

        }

        @FXML
        void bttonsi(ActionEvent event) {

        }

        @FXML
        void onBttoncancelar(MouseEvent event) {

        }

        @FXML
        void onbttonaceptar(MouseEvent event) {

        }

        @FXML
        void initialize() {
            assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text4 != null : "fx:id=\"text4\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text5 != null : "fx:id=\"text5\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text6 != null : "fx:id=\"text6\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert bttonsi != null : "fx:id=\"bttonsi\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert text7 != null : "fx:id=\"text7\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert bttonaceptar != null : "fx:id=\"bttonaceptar\" was not injected: check your FXML file 'camioneta-view.fxml'.";
            assert Bttoncancelar != null : "fx:id=\"Bttoncancelar\" was not injected: check your FXML file 'camioneta-view.fxml'.";

        }
    }



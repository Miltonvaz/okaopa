package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CitasController {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField texrname;

        @FXML
        private TextField textapell;

        @FXML
        private TextField textnumber;

        @FXML
        private TextField textcorreo;

        @FXML
        private TextField textcarro;

        @FXML
        private DatePicker textfecha;

        @FXML
        private MenuButton text3;

        @FXML
        private Button bttonaceptar;

        @FXML
        private Button bttonsalir;

        @FXML
        void bttonaceptar(ActionEvent event) {

        }

        @FXML
        void bttonsalir(ActionEvent event) {

        }

        @FXML
        void onbttonaceptar(MouseEvent event) {

        }

        @FXML
        void onbttonsalir(MouseEvent event) {

        }

        @FXML
        void initialize() {
            assert texrname != null : "fx:id=\"texrname\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert textapell != null : "fx:id=\"textapell\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert textnumber != null : "fx:id=\"textnumber\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert textcorreo != null : "fx:id=\"textcorreo\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert textcarro != null : "fx:id=\"textcarro\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert textfecha != null : "fx:id=\"textfecha\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert bttonaceptar != null : "fx:id=\"bttonaceptar\" was not injected: check your FXML file 'cita-view.fxml'.";
            assert bttonsalir != null : "fx:id=\"bttonsalir\" was not injected: check your FXML file 'cita-view.fxml'.";

        }
    }



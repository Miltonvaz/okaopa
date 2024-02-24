package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.models.Automovil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.ContextMenuEvent;

public class SeeCars {
        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TableView<Automovil> table1;

        @FXML
        private TableColumn<Automovil,String> textmodel;

        @FXML
        private TableColumn<Automovil, String> textcolor;

        @FXML
        private TableColumn<Automovil, Integer> texmotor;

        @FXML
        private TableColumn<Automovil, Integer> texbuy;

        @FXML
        private TableColumn<Automovil,Integer> textage;

        @FXML
        private TableColumn<Automovil,String > texserieMotor;

        @FXML
        private TableColumn<Automovil, String> trxtcat;

        @FXML
        private Button bttonsalir;

        @FXML
        void Onbttonalir(ContextMenuEvent event) {

        }

        @FXML
        void bttonsalir(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert table1 != null : "fx:id=\"table1\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert textmodel != null : "fx:id=\"textmodel\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert textcolor != null : "fx:id=\"textcolor\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert texmotor != null : "fx:id=\"texmotor\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert texbuy != null : "fx:id=\"texbuy\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert textage != null : "fx:id=\"textage\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert texserieMotor != null : "fx:id=\"texserieMotor\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert trxtcat != null : "fx:id=\"trxtcat\" was not injected: check your FXML file 'seeCars-view.fxml'.";
            assert bttonsalir != null : "fx:id=\"bttonsalir\" was not injected: check your FXML file 'seeCars-view.fxml'.";

        }
    }




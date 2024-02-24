package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class SedanController {


    public class SedanView {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private AnchorPane bttonguardar;

        @FXML
        private VBox textfield3;

        @FXML
        private TextField texfiled1;

        @FXML
        private TextField textfield2;

        @FXML
        private TextField texfield8;

        @FXML
        private TextField texfield4;

        @FXML
        private TextField textfield5;

        @FXML
        private TextField texfield6;

        @FXML
        private Button bttoncanceled;

        @FXML
        void bttoncanceled(ActionEvent event) {

        }

        @FXML
        void bttonguardar(MouseEvent event) {

        }

        @FXML
        void onbttoncanceled(MouseEvent event) {

        }

        @FXML
        void onbttonguardar(MouseEvent event) {

        }

        @FXML
        void initialize() {
            assert bttonguardar != null : "fx:id=\"bttonguardar\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert textfield3 != null : "fx:id=\"textfield3\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert texfiled1 != null : "fx:id=\"texfiled1\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert textfield2 != null : "fx:id=\"textfield2\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert texfield8 != null : "fx:id=\"texfield8\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert texfield4 != null : "fx:id=\"texfield4\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert textfield5 != null : "fx:id=\"textfield5\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert texfield6 != null : "fx:id=\"texfield6\" was not injected: check your FXML file 'sedan-view.fxml'.";
            assert bttoncanceled != null : "fx:id=\"bttoncanceled\" was not injected: check your FXML file 'sedan-view.fxml'.";

        }
    }

}

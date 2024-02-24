package com.milton.concesionaria.controllers;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuGerenteController extends Parent {
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

        private Stage mainStage;

        public void setMainStage(Stage stage) {
                this.mainStage = stage;
        }

        @FXML
        void OnbttonVender(MouseEvent event) {
                HelloApplication.cargarInterfaz("venta-view");
                mainStage.close();
        }

        @FXML
        void OnbttonAngendar(MouseEvent event) {mainStage.close();
                HelloApplication.cargarInterfaz("cita-view");
        }

        @FXML
        void OnbttonSee(MouseEvent event) {
                HelloApplication.cargarInterfaz("");
                mainStage.close();
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



package com.milton.concesionaria.controllers;

import com.milton.concesionaria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class DatosAutoController {


        @FXML
        private Button bttondep;

        @FXML
        private Button bttoncam;

        @FXML
        private Button bttonsed;

        @FXML
        void onBttonSed(MouseEvent event) {
            HelloApplication.newStage("sedan-view","App - sedan");
        }

        @FXML
        void onBttoncam(ActionEvent event) {
            HelloApplication.newStage("sedan-view","App - sedan");}

        @FXML
        void onButtoncam(MouseEvent event) {
            HelloApplication.newStage("camioneta-view","App - sedan");}

        @FXML
        void onButtondep(MouseEvent event) {
            HelloApplication.newStage("datoauto-view","App - sedan");}

         @FXML
        void onbttondep(ActionEvent event) {
        HelloApplication.newStage("datoauto-view","App - sedan");}
        }







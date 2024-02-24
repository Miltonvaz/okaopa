package com.milton.concesionaria.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ElegirController {

        @FXML
        private AnchorPane anchorPane;

        @FXML
        private Button deportivoButton;

        @FXML
        private Button camionetaButton;

        @FXML
        private Button sedanButton;

        @FXML
        private ImageView deportivoImageView;

        @FXML
        private ImageView camionetaImageView;

        @FXML
        private ImageView sedanImageView;

        @FXML
        private void initialize() {

        }

        @FXML
        private void handleDeportivoButtonClick() {

            System.out.println("Clic en Deportivo");

        }

        @FXML
        private void handleCamionetaButtonClick() {

            System.out.println("Clic en Camioneta");

        }

        @FXML
        private void handleSedanButtonClick() {

            System.out.println("Clic en Sedán");

        }


    }



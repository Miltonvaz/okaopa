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
            // Puedes agregar lógica de inicialización aquí
        }

        @FXML
        private void handleDeportivoButtonClick() {
            // Lógica cuando se hace clic en el botón deportivoButton
            System.out.println("Clic en Deportivo");
            // Puedes agregar más lógica según sea necesario
        }

        @FXML
        private void handleCamionetaButtonClick() {
            // Lógica cuando se hace clic en el botón camionetaButton
            System.out.println("Clic en Camioneta");
            // Puedes agregar más lógica según sea necesario
        }

        @FXML
        private void handleSedanButtonClick() {
            // Lógica cuando se hace clic en el botón sedanButton
            System.out.println("Clic en Sedán");
            // Puedes agregar más lógica según sea necesario
        }

        // Otros métodos y lógica según sea necesario
    }



package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuVendedorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bottonAdd;

    @FXML
    private Button bottonAddVend;

    @FXML
    private Button BottonseeCars;

    @FXML
    private Button bottonModi;
    private Stage mainStage;

    @FXML
    void BottonOnseeCars(MouseEvent event) {

    }

    @FXML
    void BottonseeOnCars(ActionEvent event) {

    }

    @FXML
    void bottonAddOnVend(MouseEvent event) {

    }

    @FXML
    void bottonModiCars(MouseEvent event) {

    }

    @FXML
    void bottonOnAdd(MouseEvent event) {

    }

    @FXML
    void bottonOnAddVend(ActionEvent event) {

    }

    @FXML
    void bottonOnModi(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert bottonAdd != null : "fx:id=\"bottonAdd\" was not injected: check your FXML file 'menuVendedor-view.fxml'.";
        assert bottonAddVend != null : "fx:id=\"bottonAddVend\" was not injected: check your FXML file 'menuVendedor-view.fxml'.";
        assert BottonseeCars != null : "fx:id=\"BottonseeCars\" was not injected: check your FXML file 'menuVendedor-view.fxml'.";
        assert bottonModi != null : "fx:id=\"bottonModi\" was not injected: check your FXML file 'menuVendedor-view.fxml'.";

    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }

    public Stage getMainStage() {
        return mainStage;
    }
}




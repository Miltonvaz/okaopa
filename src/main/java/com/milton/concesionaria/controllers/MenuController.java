package com.milton.concesionaria.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
 public class MenuController {

        @FXML
        private Button bttonOnclient;

        @FXML
        private Button bttonOnGerent;
         private HelloApplication mainApplication;
         private HelloApplication mainApplication1;

        @FXML
        void btonOnClient(MouseEvent event) {
            mainApplication.openEmployeeWindow();

        }

        @FXML
        void bttonOnGerent(MouseEvent event1) {
            mainApplication1.openManagerMenu();
        }

        @FXML
        void bttonOnclinet(ActionEvent event) {

        }
     public void setMainApplication(HelloApplication mainApplication) {
         this.mainApplication = mainApplication;
     }
     public void setMainApplication1(HelloApplication mainApplication1) {
         this.mainApplication1 = mainApplication1;
     }
     public void BottonseeOnCars(ActionEvent actionEvent) {
     }

     public void bottonOnModi(ActionEvent actionEvent) {
     }

     public void BottonOnseeCars(MouseEvent mouseEvent) {
     }

     public void bottonModiCars(MouseEvent mouseEvent) {
     }

     public void bottonOnAdd(MouseEvent mouseEvent) {
     }

     public void bottonOnAddVend(ActionEvent actionEvent) {
     }

     public void bottonAddOnVend(MouseEvent mouseEvent) {
     }


     public void bttonOnVender(ActionEvent actionEvent) {
     }

     public void bttonOnagendar(ActionEvent actionEvent) {
     }

     public void OnsSeBtto(ActionEvent actionEvent) {
     }

     public void OnbttonVender(MouseEvent mouseEvent) {
     }

     public void OnbttonAngendar(MouseEvent mouseEvent) {
     }

     public void OnbttonSee(MouseEvent mouseEvent) {
     }
 }



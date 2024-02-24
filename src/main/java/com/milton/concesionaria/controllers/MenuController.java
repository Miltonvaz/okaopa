
package com.milton.concesionaria.controllers;

import com.gluonhq.charm.glisten.control.BottomNavigationButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.milton.concesionaria.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController {

         @FXML
         private ResourceBundle resources;

         @FXML
         private URL location;

         @FXML
         private BottomNavigationButton gerentButton;

         @FXML
         private BottomNavigationButton empleadoButton;
    @FXML
         void onClickButton(MouseEvent event) {
            HelloApplication.newStage("menuGerente-view","App - view Client");
         }

         @FXML
         void onClickGerenteButton(MouseEvent event) throws IOException {
             FXMLLoader gerenteLoader = new FXMLLoader(getClass().getResource("menu-gerente-view.fxml"));
                Parent gerenteRoot = gerenteLoader.load();
              Stage gerenteStage = new Stage();
             gerenteStage.setScene(new Scene(gerenteRoot));
              gerenteStage.show();
         }

         @FXML
         void initialize() {
             assert gerentButton != null : "fx:id=\"gerentButton\" was not injected: check your FXML file 'menu-view.fxml'.";
             assert empleadoButton != null : "fx:id=\"empleadoButton\" was not injected: check your FXML file 'menu-view.fxml'.";

         }

    public void init(Stage stageRoot) {
    }
}



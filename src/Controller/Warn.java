package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class Warn implements Initializable {

    @FXML
    private AnchorPane errorScene;

    @FXML
    private Button exit;

    private Stage stage;

    
    @FXML
    private void exit (ActionEvent event){
        stage = (Stage) errorScene.getScene().getWindow();
        stage.close();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        exit.setOnMouseEntered(e -> {
            exit.setStyle("-fx-background-color:  rgba(44,44,44,0.25)");
        });

        exit.setOnMouseExited(e -> {
            exit.setStyle("-fx-background-color: transparant");
        });
    }  
    
}

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
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class LogInPage implements Initializable {
    
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private void keHomePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/HomePage.fxml");
    }

    @FXML
    private void LogIn(ActionEvent event) {
        switch(username.getText()){
            case "Haryadi":
                if(password.getText().equals("stafdlh01")){
                    OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
                    open.openScene("/UI/HomePageAdmin.fxml");
                } else{
                    OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
                    open.newScene("/UI/Warn.fxml", "Warn");
                }
            break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}

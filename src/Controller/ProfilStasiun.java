package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;

import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author
 */
public class ProfilStasiun implements Initializable {

    @FXML
    private Label ks;

    @FXML
    private Label kl;

    @FXML
    private Label segmen;

    @FXML
    private JFXTextArea alamat;

    @FXML
    private ImageView foto;

    
    @FXML
    private void exit (ActionEvent event){
        
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LoadData load = new LoadData();
        ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(DatabaseSungai.get(i).isDipilih()==true){
                ks.setText(DatabaseSungai.get(i).getDataProfil().getKS());
                kl.setText(DatabaseSungai.get(i).getDataProfil().getKL());
                segmen.setText(DatabaseSungai.get(i).getDataProfil().getSegmen());
                alamat.setText(DatabaseSungai.get(i).getDataProfil().getAlamat());

                try {
                    Image image = new Image(DatabaseSungai.get(i).getDataProfil().getUrlImage());
                    foto.setImage(image);
                } catch (NullPointerException e) {
                    Image image = new Image("Photo/noImage.jpg");
                    foto.setImage(image);
                }
            }
        }
        alamat.setEditable(false);
    }  
    
}

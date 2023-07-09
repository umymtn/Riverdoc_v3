package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;

import Model.ArticleSharedData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class ArticleAdmin implements Initializable {

    @FXML
    private JFXTextArea Judul;

    @FXML
    private ImageView Gambar;

    @FXML
    private JFXTextArea Isi;

    @FXML
    private void keHomePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/HomePageAdmin.fxml");
    }

    @FXML
    private void keCekStatusMutu (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/StatusMutuAir.fxml");
    }

    @FXML
    private void keArticlePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticlePageAdmin.fxml");
    }

    @FXML
    private void keInputData (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/InputData.fxml");
    }

    @FXML
    private void LogOut (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/LogInPage.fxml");
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        LoadData load = new LoadData();
        ArrayList<ArticleSharedData> article = load.loadData2("Article");

        for(int i = 0; i<article.size(); i++){
            if(article.get(i).isDipilih()==true){
                Judul.setText(article.get(i).getJudul());
                
                Image image = new Image(article.get(i).getURL());
                Gambar.setImage(image);

                Isi.setText(article.get(i).getIsi());
            }
        }
        Judul.setEditable(false);
        Isi.setEditable(false);
    }  
    
}

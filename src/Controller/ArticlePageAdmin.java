package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Model.ArticleSharedData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class ArticlePageAdmin implements Initializable {
    LoadData load = new LoadData();
    ArrayList<ArticleSharedData> article = load.loadData2("Article");

    SaveData save = new SaveData();

    @FXML
    private JFXButton Article1;

    @FXML
    private JFXButton Article2;

    @FXML
    private JFXButton Article3;

    @FXML
    private JFXButton Article4;

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
    private void keArticle (ActionEvent event){
        for (int i = 0; i<article.size(); i++){
           if(i==0){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticleAdmin.fxml");
    }

    @FXML
    private void keArticle2 (ActionEvent event){
        for (int i = 0; i<article.size(); i++){
           if(i==1){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticleAdmin.fxml");
    }

    @FXML
    private void keArticle3 (ActionEvent event) {
        for (int i = 0; i<article.size(); i++){
           if(i==2){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticleAdmin.fxml");
    
    }

    @FXML
    private void keArticle4 (ActionEvent event) {
        for (int i = 0; i<article.size(); i++){
           if(i==3){
                article.get(i).setDipilih(true);
           } else {
                article.get(i).setDipilih(false);
           }
        }
        save.saveData2(article,"Article");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticleAdmin.fxml");
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
        
    }    
    
}

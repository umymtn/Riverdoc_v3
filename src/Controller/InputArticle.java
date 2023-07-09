package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.ArticleSharedData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 *
 * @author
 */
public class InputArticle implements Initializable {

    @FXML
    private TextArea inputIsi;

    @FXML
    private TextField inputJudul;

    @FXML
    private BorderPane mainPane;

    @FXML
    private TextField upFoto;
    
    LoadData load = new LoadData();
    ArrayList<ArticleSharedData> article = load.loadData2("Article");

    SaveData save = new SaveData();

    @FXML
    private void LogOut(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/LogInPage.fxml");
    }

    @FXML
    private void keArtikel(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticlePageAdmin.fxml");
    }

    @FXML
    private void keCekStatusMutu(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/StatusMutuAir.fxml");
    }

    @FXML
    private void keDatabaseArtikel(ActionEvent event) {
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/DatabaseArticle");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void keHomePage(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/HomePageAdmin.fxml");
    }
    
    @FXML
    private void keInputData(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/InputData.fxml");
    }

    @FXML
    private void keInputArtikel(ActionEvent event) {
        OpenScene open = new OpenScene((Stage) ((Node) event.getSource()).getScene().getWindow());
        open.openScene("/UI/InputArticle.fxml");
    }

    @FXML
    private void browse(ActionEvent event) {
        FileChooser file = new FileChooser();
        file.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("images file", "*jpg"));
        Stage primaryStage = new Stage();
        File fc = file.showOpenDialog(primaryStage);
        if (file != null) {
            try {
                URI uri = fc.toURI();
                String fullPath = uri.getPath();

                String srcPath = "/src/";
                int srcIndex = fullPath.indexOf(srcPath);
                if (srcIndex != -1) {
                    String relativePath = fullPath.substring(srcIndex + srcPath.length());
                    System.out.println("Selected file: " + relativePath);
                    upFoto.setText(relativePath);
                } else {
                    System.out.println("File is not located under /src/ directory.");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void save (ActionEvent event){
        if(inputJudul.getText().isEmpty()| upFoto.getText().isEmpty() | inputIsi.getText().isEmpty()){
            OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
            open.newScene("/UI/Warn.fxml", "WARNING");
        } else {
            ArticleSharedData articlebaru = new ArticleSharedData(inputJudul.getText(), upFoto.getText(), inputIsi.getText());
            article.add(articlebaru);
            save.saveData2(article,"Article");
        }
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
}

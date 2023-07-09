package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.ArticleSharedData;
import javafx.collections.ObservableList;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author
 */
public class DatabaseArticle implements Initializable {

    LoadData load = new LoadData();
    ArrayList<ArticleSharedData> article = load.loadData2("Article");

    ObservableList<ArticleSharedData> article1 = observableArrayList();
    SaveData save = new SaveData();

    @FXML
    private TableView<ArticleSharedData> Table;

    @FXML
    private TableColumn<ArticleSharedData,String> Judul;

    @FXML
    private TableColumn<ArticleSharedData,String> gambar;

    @FXML
    private TableColumn<ArticleSharedData,String> Isi;
    
    @FXML
    private void Delete (ActionEvent event){
        ArticleSharedData arr = Table.getSelectionModel().getSelectedItem();
        
        if (arr!=null){
            article.remove(arr);
        }
        save.saveData2(article,"Article");
        Table.refresh();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(int i = 0; i<article.size(); i++){
            String a = article.get(i).getJudul();
            String b = article.get(i).getURL();
            String c = article.get(i).getIsi();
            article1.add(new ArticleSharedData(a, b, c));
        }
        
        Judul.setCellValueFactory(new PropertyValueFactory<ArticleSharedData,String>("Judul"));
        gambar.setCellValueFactory(new PropertyValueFactory<ArticleSharedData,String>("URL"));
        Isi.setCellValueFactory(new PropertyValueFactory<ArticleSharedData,String>("Isi"));
        Table.setItems(article1);

    }  

    
}

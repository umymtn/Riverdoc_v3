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
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author
 */
public class HomePageAdmin implements Initializable {

    LoadData load = new LoadData();
    ArrayList<ArticleSharedData> article = load.loadData2("Article");
    SaveData save = new SaveData();

    @FXML
    private ImageView HomeBackground;

    @FXML
    private JFXTextArea Judul;

    @FXML
    private JFXTextArea Isi;

    @FXML
    private Button button;

    @FXML
    private Pagination pagination;
    private Timeline slideTimeline;

    @FXML
    private void LogOut (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/LogInPage.fxml");
    }

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
    private void keInputArticle (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/InputArticle.fxml");
    }

    private void setupSlideTimeline() {
        slideTimeline = new Timeline();
        slideTimeline.setCycleCount(Timeline.INDEFINITE);
        slideTimeline.getKeyFrames().add(
            new KeyFrame(Duration.seconds(5), event -> {
                int nextPage = (pagination.getCurrentPageIndex() + 1) % pagination.getPageCount();
                pagination.setCurrentPageIndex(nextPage);
                showImageForCurrentPage(); // Mengatur gambar saat halaman berubah
            })
        );
        slideTimeline.play();
    }

    private void showImageForCurrentPage() {
        int currentPageIndex = pagination.getCurrentPageIndex();
        String imagePath = ""; // Mengatur path gambar sesuai dengan halaman
        switch (currentPageIndex) {
        case 0:
            imagePath = "Photo/HomePage1.jpg";
            Judul.setText("Jelajah Sungai Cijulang-\r\n" + //
                    "Green Canyon, Ada Air Terjun \r\n" + //
                    "Abadi!");
            Isi.setText("Pangandaran - Jika pillihan liburan kamu ke Pangandaran, jangan sampai lewatkan berlibur ke \r\n" + //
                    "objek wisata Green Canyon atau Cukang Taneuh di Desa Kertayasa, Kecamatan Cijulang, \r\n" + //
                    "Kabupaten Pangandaran. ...");
            button.setOnAction(event -> {
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
            });
            break;
        case 1:
            imagePath = "Photo/HomePage2.jpg";
            Judul.setText("Sungai Citarum, Predikat \r\n" + //
                    "Sungai Tercemar di Dunia. \r\n" + //
                    "Bagaimana Solusinya?");
            Isi.setText("Sungai Citarum yang berlokasi di Jawa Barat dan berada di DAS Citarum telah menyandang \r\n" + //
                    "predikat sebagai salah satu wilayah yang tercemar di dunia. Sungai sepanjang 269 kilometer \r\n" + //
                    "ini mempunyai tiga masalah utama. Pada bagian hulu ....");
            button.setOnAction(event -> {
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
            });
            break;
        case 2:
            imagePath = "Photo/HomePage3.jpg";
            Judul.setText("Waspada Pencemaran Sungai, \r\n" + //
                    "Kenali Penyebab dan \r\n" + //
                    "Akibatnya !");
            Isi.setText("Pencemaran sungai merupakan salah satu bentuk dari pencemaran air yang membuat sungai \r\n" + //
                    "menjadi terkontaminasi dan kehilangan fungsinya. Pencemaran bisa terjadi karena \r\n" + //
                    "kurangnya rasa tanggung jawab dari manusia...");
            button.setOnAction(event -> {
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
            });
            break;
        }
        Image image = new Image(imagePath);
        HomeBackground.setImage(image);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int numPages = 3; // Jumlah halaman
        pagination.setPageCount(numPages);
        setupSlideTimeline();

    // Mengatur gambar awal saat aplikasi dimulai
        showImageForCurrentPage();
        
    //Mengatur agar textArea tidak dapat di edit
        Judul.setEditable(false);
        Isi.setEditable(false);
    }    
    
}

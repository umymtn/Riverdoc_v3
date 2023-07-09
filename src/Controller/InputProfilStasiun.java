package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author
 */
public class InputProfilStasiun implements Initializable {

    @FXML
    private Label das;

    @FXML
    private ChoiceBox<String> KS;

    @FXML
    private ChoiceBox<String> KL;

    @FXML
    private ChoiceBox<String> Segmen;

    @FXML
    private TextArea Alamat;

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    SaveData save = new SaveData();


    @FXML
    private void Save (ActionEvent event){
       for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (das.getText().equals(DatabaseSungai.get(i).getNamaSungai())) {
                DatabaseSungai.get(i).getDataProfil().setKS(KS.getValue());
                DatabaseSungai.get(i).getDataProfil().setKL(KL.getValue());
                DatabaseSungai.get(i).getDataProfil().setSegmen(Segmen.getValue());
                DatabaseSungai.get(i).getDataProfil().setAlamat(Alamat.getText());
            }
        } save.saveData(DatabaseSungai, "DatabaseSungai");
        
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (das.getText().equals(DatabaseSungai.get(i).getNamaSungai())) {
                if(DatabaseSungai.get(i).getDataProfil().equals(null)){
                    
                } else {
                    KS.setValue(DatabaseSungai.get(i).getDataProfil().getKS());
                    KL.setValue(DatabaseSungai.get(i).getDataProfil().getKL());
                    Segmen.setValue(DatabaseSungai.get(i).getDataProfil().getSegmen());
                    Alamat.setText(DatabaseSungai.get(i).getDataProfil().getAlamat());
        
                    // foundMatch = true; // Set variabel foundMatch menjadi true
                    break; // Keluar dari perulangan karena sudah menemukan kecocokan
                }
            }
        }

        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(DatabaseSungai.get(i).isDipilih()==true){
                das.setText(DatabaseSungai.get(i).getNamaSungai());
            }
        }
        
        // boolean foundMatch = false; // Inisialisasi variabel boolean

        

        KS.getItems().addAll("--Pilih Kategori Stasiun--","INTEGRASI","KLHK");
        KS.setValue("--Pilih Kategori Stasiun--");

        KL.getItems().addAll("--Pilih Kategori Lokasi--","Sungai", "Damau");
        KL.setValue("--Pilih Kategori Lokasi--");

        Segmen.getItems().addAll("--Pilih Segmen--", "Hulu", "Tengah", "Hilir");
        Segmen.setValue("--Pilih Segmen--");
    }
}

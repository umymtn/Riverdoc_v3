package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.AllDataHasilPantau;
import Model.DataHasilPantau;
import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class InputData implements Initializable {

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    SaveData save = new SaveData();

    @FXML
    private BorderPane mainPane;

    @FXML
    private TextField NilaiIP;

    @FXML
    private ChoiceBox<String> DAS;

    @FXML
    private ChoiceBox<String> Stasiun;

    @FXML
    private ToggleGroup Parameter;

    @FXML
    private RadioButton Amonia;

    @FXML
    private RadioButton BOD;

    @FXML
    private RadioButton COD;

    @FXML
    private RadioButton DO;

    @FXML
    private RadioButton Nitrat;

    @FXML
    private RadioButton PH;

    @FXML
    private RadioButton TDS;

    @FXML
    private RadioButton TSS;

    @FXML
    private Label label;

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
    private void keInputData (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/InputData.fxml");
    }
    
    @FXML
    private void keInputStatusMutu (ActionEvent event){
        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (label.getText().equals(DatabaseSungai.get(i).getNamaSungai())) {
                DatabaseSungai.get(i).setDipilih(true); 
            }else{
                DatabaseSungai.get(i).setDipilih(false);
            }
        } save.saveData(DatabaseSungai, "DatabaseSungai");
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/InputStatusMutu");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void keInputProfilStasiun (ActionEvent event){
        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (label.getText().equals(DatabaseSungai.get(i).getNamaSungai())) {
                DatabaseSungai.get(i).setDipilih(true); 
            }else{
                DatabaseSungai.get(i).setDipilih(false);
            }
        } save.saveData(DatabaseSungai, "DatabaseSungai");
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/InputProfilStasiun");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void keInputGrafikTrend (ActionEvent event){
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/InputGrafikTrend");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void Save(ActionEvent event){
        String Status;
        if(Double.parseDouble(NilaiIP.getText())>0 && Double.parseDouble(NilaiIP.getText())<=1){
            Status = "MEMENUHI BAKUMUTU";
        } else if(Double.parseDouble(NilaiIP.getText())>1 && Double.parseDouble(NilaiIP.getText())<=5) {
            Status = "CEMAR RINGAN";
        } else if(Double.parseDouble(NilaiIP.getText())>5 && Double.parseDouble(NilaiIP.getText())<=10){
            Status = "CEMAR SEDANG";
        } else {
            Status = "CEMAR BERAT";
        }
        
        String PK;
        if (Parameter.getSelectedToggle().equals(Amonia)){
            PK = "Amonia";
        } else if (Parameter.getSelectedToggle().equals(BOD)){
            PK = "BOD";
        } else if (Parameter.getSelectedToggle().equals(COD)){
            PK = "COD";
        } else if (Parameter.getSelectedToggle().equals(DO)){
            PK = "DO";
        } else if (Parameter.getSelectedToggle().equals(Nitrat)){
            PK = "Nitrat";
        } else if (Parameter.getSelectedToggle().equals(PH)){
            PK = "PH";
        } else if (Parameter.getSelectedToggle().equals(TDS)){
            PK = "TDS";
        } else {PK = "TSS";}

        DataHasilPantau newData = new DataHasilPantau(null, null, null);
        
        boolean foundMatch = false; // Inisialisasi variabel boolean

        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (DAS.getValue().equals(DatabaseSungai.get(i).getNamaSungai())) {
                // DAS.getValue() sama dengan NamaSungai pada Database sungai
                newData.setNilaiIP(NilaiIP.getText());
                newData.setStatusMutu(Status);
                newData.setParameterKritis(PK);
                DatabaseSungai.get(i).getDatabasePantau().getDataPantau().add(newData);
                DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(i).setDataPantau(newData);
        
                foundMatch = true; // Set variabel foundMatch menjadi true
                break; // Keluar dari perulangan karena sudah menemukan kecocokan
            }
        }

        if (!foundMatch) {
            // Tidak ada kecocokan yang ditemukan, masuk ke pernyataan else if
            newData.setNilaiIP(NilaiIP.getText());
            newData.setStatusMutu(Status);
            newData.setParameterKritis(PK);
    
            AllDataHasilPantau dataPantau = new AllDataHasilPantau();
            dataPantau.getDataPantau().add(newData);
    
            Sungai sungaibaru = new Sungai(Stasiun.getValue().toString(), DAS.getValue().toString(), dataPantau, null, null, null);
            DatabaseSungai.add(sungaibaru);
        }
        save.saveData(DatabaseSungai, "DatabaseSungai");
        label.setText(DAS.getValue().toString());
        
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DAS.getItems().addAll(" -- Pilih DAS --", "Bengawan Solo", "DAM Tunjung", "Jajar", "Serayu", "Sungai Brantas",
        "Sungai Bulanan", "Sungai Cibeet", "Sungai Cikundul", "Sungai Cimahi", "Sungai Cipanas", "Sungai Dengkeng",
        "Sungai Gending", "Sungai Kedunguling", "Sungai Serayu");
        DAS.setValue(" -- Pilih DAS --");

        Stasiun.getItems().addAll("-- Pilih Stasiun --","BANGKALAN-1","KLHK68","BLORA-2","KENDAL-1","CILACAP-1","CIANJUR-1",
        "INDRAMAYU-1", "KLHK50");
        Stasiun.setValue("-- Pilih Stasiun --");

        switch(DAS.getValue()){
            case "DAM Tunjung":
                Stasiun.setValue("BANGKALAN-1");
            break;
        }
    }  
    
}

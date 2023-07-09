package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.AllDataStatusMutu;
import Model.DataStatusMutu;
import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class HasilPantau implements Initializable {
    @FXML
    private Label NamaSungai;

    @FXML
    private Label NilaiIP;

    @FXML
    private Label StatusMutu;

    @FXML
    private Label ParameterKritis;

    @FXML
    private AnchorPane headerPantau;

    @FXML
    private AnchorPane pantauScene;

    @FXML
    private Button exit;

    @FXML
    private Button petaData;

    private Stage stage;

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    AllDataStatusMutu ds1 = new AllDataStatusMutu();
    DataStatusMutu s1_data1 = new DataStatusMutu(DatabaseSungai.get(0).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s1_data2 = new DataStatusMutu(DatabaseSungai.get(0).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s1_data3 = new DataStatusMutu(DatabaseSungai.get(0).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");

    AllDataStatusMutu ds2 = new AllDataStatusMutu();
    DataStatusMutu s2_data1 = new DataStatusMutu(DatabaseSungai.get(1).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s2_data2 = new DataStatusMutu(DatabaseSungai.get(1).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s2_data3 = new DataStatusMutu(DatabaseSungai.get(1).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");

    AllDataStatusMutu ds3 = new AllDataStatusMutu();
    DataStatusMutu s3_data1 = new DataStatusMutu(DatabaseSungai.get(2).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s3_data2 = new DataStatusMutu(DatabaseSungai.get(2).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s3_data3 = new DataStatusMutu(DatabaseSungai.get(2).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");
    
    AllDataStatusMutu ds4 = new AllDataStatusMutu();
    DataStatusMutu s4_data1 = new DataStatusMutu(DatabaseSungai.get(3).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s4_data2 = new DataStatusMutu(DatabaseSungai.get(3).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s4_data3 = new DataStatusMutu(DatabaseSungai.get(3).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");
    
    AllDataStatusMutu ds5 = new AllDataStatusMutu();
    DataStatusMutu s5_data1 = new DataStatusMutu(DatabaseSungai.get(4).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s5_data2 = new DataStatusMutu(DatabaseSungai.get(4).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s5_data3 = new DataStatusMutu(DatabaseSungai.get(4).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");
    
    AllDataStatusMutu ds6 = new AllDataStatusMutu();
    DataStatusMutu s6_data1 = new DataStatusMutu(DatabaseSungai.get(5).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s6_data2 = new DataStatusMutu(DatabaseSungai.get(5).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s6_data3 = new DataStatusMutu(DatabaseSungai.get(5).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");

    AllDataStatusMutu ds7 = new AllDataStatusMutu();
    DataStatusMutu s7_data1 = new DataStatusMutu(DatabaseSungai.get(6).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s7_data2 = new DataStatusMutu(DatabaseSungai.get(6).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s7_data3 = new DataStatusMutu(DatabaseSungai.get(6).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");

    AllDataStatusMutu ds8 = new AllDataStatusMutu();
    DataStatusMutu s8_data1 = new DataStatusMutu(DatabaseSungai.get(7).getDatabasePantau().getDataPantau().get(0), null, "27-06-2023");
    DataStatusMutu s8_data2 = new DataStatusMutu(DatabaseSungai.get(7).getDatabasePantau().getDataPantau().get(1), null, "28-06-2023");
    DataStatusMutu s8_data3 = new DataStatusMutu(DatabaseSungai.get(7).getDatabasePantau().getDataPantau().get(2), null, "29-06-2023");
        
    
    
    SaveData save = new SaveData();

    @FXML
    private void kePemetaanData(ActionEvent event) {
        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (NamaSungai.getText().equals(DatabaseSungai.get(i).getNamaStasiun()+ " - " + DatabaseSungai.get(i).getNamaSungai())) {
                DatabaseSungai.get(i).setDipilih(true); 
            }else{
                DatabaseSungai.get(i).setDipilih(false);
            }
        }
        save.saveData(DatabaseSungai, "DatabaseSungai");
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Analisis.fxml");
        open.getStage().setX(0);
        open.getStage().setY(0);
        open.closeAllWindowsExceptCurrent(open.getStage());        
    }
    
    // @FXML
    // private void kePemetaanData (ActionEvent event){
    //     switch(NamaSungai.getText()){
    //         case "BANGKALAN-1 - DAM Tunjung":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==0){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "KLHK68 - Sungai Brantas":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==1){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "BLORA-2 - Bengawan Solo":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==2){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "KENDAL-1 - Sungai Bulanan/Pening":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==3){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "CILACAP-1 - Serayu":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==4){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "CIANJUR-1 - Sungai Cikundul":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==5){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "INDRAMAYU-1 - Sungai Cipanas":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==6){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //         case "KLHK50 - Sungai Cimahi":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==7){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai, "DatabaseSungai");
    //         break;
    //     }  
    //     OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
    //     open.openScene("/UI/Analisis.fxml");
    //     open.getStage().setX(0);
    //     open.getStage().setY(0);
    //     open.closeAllWindowsExceptCurrent(open.getStage());
    // }

    @FXML
    private void exit (ActionEvent event){
        stage = (Stage) pantauScene.getScene().getWindow();
        stage.close();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        for(int i = 0; i<DatabaseSungai.size(); i++){
            int last = DatabaseSungai.get(i).getDatabasePantau().getDataPantau().size()-1;
            if(DatabaseSungai.get(i).isDipilih()==true){
                NamaSungai.setText(DatabaseSungai.get(i).getNamaStasiun()+ " - " + DatabaseSungai.get(i).getNamaSungai());
                NilaiIP.setText(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP());
                StatusMutu.setText(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getStatusMutu());
                ParameterKritis.setText(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getParameterKritis());
                
                if(Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP())> 0 && Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP()) < 1 ){
                    headerPantau.getStyleClass().add("header2");
                } else if (Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP())> 1 && Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP()) < 5) {
                    headerPantau.getStyleClass().add("header3");
                } else if (Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP())> 5 && Double.parseDouble(DatabaseSungai.get(i).getDatabasePantau().getDataPantau().get(last).getNilaiIP()) < 10) {
                    headerPantau.getStyleClass().add("header");
                } else {
                    headerPantau.getStyleClass().add("header4");
                }
            }
        }

        ds1.getDataStatus().add(s1_data1);
        ds1.getDataStatus().add(s1_data2);
        ds1.getDataStatus().add(s1_data3);

        ds2.getDataStatus().add(s2_data1);
        ds2.getDataStatus().add(s2_data2);
        ds2.getDataStatus().add(s2_data3);

        ds3.getDataStatus().add(s3_data1);
        ds3.getDataStatus().add(s3_data2);
        ds3.getDataStatus().add(s3_data3);

        ds4.getDataStatus().add(s4_data1);
        ds4.getDataStatus().add(s4_data2);
        ds4.getDataStatus().add(s4_data3);

        ds5.getDataStatus().add(s5_data1);
        ds5.getDataStatus().add(s5_data2);
        ds5.getDataStatus().add(s5_data3);

        ds6.getDataStatus().add(s6_data1);
        ds6.getDataStatus().add(s6_data2);
        ds6.getDataStatus().add(s6_data3);

        ds7.getDataStatus().add(s7_data1);
        ds7.getDataStatus().add(s7_data2);
        ds7.getDataStatus().add(s7_data3);

        ds8.getDataStatus().add(s8_data1);
        ds8.getDataStatus().add(s8_data2);
        ds8.getDataStatus().add(s8_data3);
        
        DatabaseSungai.get(0).setDatabaseStatus(ds1);
        DatabaseSungai.get(1).setDatabaseStatus(ds2);
        DatabaseSungai.get(2).setDatabaseStatus(ds3);
        DatabaseSungai.get(3).setDatabaseStatus(ds4);
        DatabaseSungai.get(4).setDatabaseStatus(ds5);
        DatabaseSungai.get(5).setDatabaseStatus(ds6);
        DatabaseSungai.get(6).setDatabaseStatus(ds7);
        DatabaseSungai.get(7).setDatabaseStatus(ds8);
        save.saveData(DatabaseSungai, "DatabaseSungai");

        exit.setOnMouseEntered(e -> {
            exit.setStyle("-fx-background-color:  rgba(44,44,44,0.25)");
        });

        exit.setOnMouseExited(e -> {
            exit.setStyle("-fx-background-color: transparant");
        });

    }  
    
}

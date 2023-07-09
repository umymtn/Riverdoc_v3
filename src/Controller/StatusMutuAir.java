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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 *
 * @author
 */
public class StatusMutuAir implements Initializable {
     
     AllDataHasilPantau dp1 = new AllDataHasilPantau();
     DataHasilPantau s1_data1= new DataHasilPantau("6.65", "CEMAR SEDANG", "BOD");
     DataHasilPantau s1_data2 = new DataHasilPantau("7.35", "CEMAR SEDANG", "BOD");
     DataHasilPantau s1_data3 = new DataHasilPantau("6.33", "CEMAR SEDANG", "BOD");

     AllDataHasilPantau dp2 = new AllDataHasilPantau();
     DataHasilPantau s2_data1 = new DataHasilPantau("0.46", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s2_data2 = new DataHasilPantau("0.71", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s2_data3 = new DataHasilPantau("0.38", "MEMENUHI BAKUMUTU", "BOD");
    
     AllDataHasilPantau dp3 = new AllDataHasilPantau();
     DataHasilPantau s3_data1 = new DataHasilPantau("4.48", "CEMAR RINGAN", "BOD");
     DataHasilPantau s3_data2 = new DataHasilPantau("3.22", "CEMAR RINGAN", "BOD");
     DataHasilPantau s3_data3 = new DataHasilPantau("2.84", "CEMAR RINGAN", "BOD");

     AllDataHasilPantau dp4 = new AllDataHasilPantau();
     DataHasilPantau s4_data1 = new DataHasilPantau("2.52", "CEMAR RINGAN", "BOD");
     DataHasilPantau s4_data2 = new DataHasilPantau("2.39", "CEMAR RINGAN", "BOD");
     DataHasilPantau s4_data3 = new DataHasilPantau("2.75", "CEMAR RINGAN", "BOD");
     
     AllDataHasilPantau dp5 = new AllDataHasilPantau();
     DataHasilPantau s5_data1 = new DataHasilPantau("0.76", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s5_data2 = new DataHasilPantau("0.73", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s5_data3 = new DataHasilPantau("0.73", "MEMENUHI BAKUMUTU", "BOD");
     
     AllDataHasilPantau dp6 = new AllDataHasilPantau();
     DataHasilPantau s6_data1 = new DataHasilPantau("0.56", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s6_data2 = new DataHasilPantau("0.56", "MEMENUHI BAKUMUTU", "BOD");
     DataHasilPantau s6_data3= new DataHasilPantau("0.59", "MEMENUHI BAKUMUTU", "BOD");
     
     AllDataHasilPantau dp7 = new AllDataHasilPantau();
     DataHasilPantau s7_data1 = new DataHasilPantau("4.22", "CEMAR RINGAN", "BOD");
     DataHasilPantau s7_data2 = new DataHasilPantau("3.82", "CEMAR RINGAN", "BOD");
     DataHasilPantau s7_data3 = new DataHasilPantau("3.54", "CEMAR RINGAN", "BOD");
     
     AllDataHasilPantau dp8 = new AllDataHasilPantau();
     DataHasilPantau s8_data1 = new DataHasilPantau("4.21", "CEMAR RINGAN", "Amonia");
     DataHasilPantau s8_data2 = new DataHasilPantau("4.7", "CEMAR RINGAN", "Amonia");
     DataHasilPantau s8_data3 = new DataHasilPantau("3.79", "CEMAR RINGAN", "Amonia");
     
     //Menyimpan semua data hasil pemantauan
     ArrayList <Sungai> DatabaseSungai = new ArrayList<>();
     Sungai sungai1 = new Sungai("BANGKALAN-1", "DAM Tunjung", dp1, null, null, null);
     Sungai sungai2 = new Sungai("KLHK68", "Sungai Brantas", dp2, null, null, null);
     Sungai sungai3 = new Sungai("BLORA-2", "Bengawan Solo", dp3, null, null, null);
     Sungai sungai4 = new Sungai("KENDAL-1", "Sungai Bulanan/Pening", dp4, null, null, null);
     Sungai sungai5 = new Sungai("CILACAP-1", "Serayu", dp5, null, null, null);
     Sungai sungai6 = new Sungai("CIANJUR-1", "Sungai Cikundul", dp6, null, null, null);
     Sungai sungai7 = new Sungai("INDRAMAYU-1", "Sungai Cipanas", dp7, null, null, null);
     Sungai sungai8 = new Sungai("KLHK50", "Sungai Cimahi", dp8, null, null, null);
        
     SaveData save = new SaveData();

     //Menyimpan semua button sungai
     ArrayList<Button> dat = new ArrayList<>();
     
     @FXML
     private ChoiceBox<String> DAS;

     @FXML
     private ChoiceBox<String> Provinsi;

     @FXML
     private Button dat1, dat2, dat3, dat4, dat5, dat6, dat7,dat8, dat9, dat10, dat11, dat12, dat13, dat14;

    

     @FXML
     private void keHomePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/HomePage.fxml");
     }

     @FXML
     private void keCekStatusMutu (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/StatusMutuAir.fxml");
     }

     @FXML
     private void keArticlePage (ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/ArticlePage.fxml");
     }

     @FXML
     private void kedata1(ActionEvent event) {
     //Set data agar data yang terbuka adalah data sesuai index
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==0){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
    }

     @FXML
     private void kedata2(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==1){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata3(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==2){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata4(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==3){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata5(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==4){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata6(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==5){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata7(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==6){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata8(ActionEvent event) {
        for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==7){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
        }
        save.saveData(DatabaseSungai,"DatabaseSungai");

        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata9(ActionEvent event) {
        if (DatabaseSungai.size() > 9) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==8){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        } else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata10(ActionEvent event) {
        if (DatabaseSungai.size() > 10) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==9){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        } else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata11(ActionEvent event) {
        if (DatabaseSungai.size() > 11) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==10){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        }else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata12(ActionEvent event) {
        if (DatabaseSungai.size() > 12) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==11){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        }else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata13(ActionEvent event) {
        if (DatabaseSungai.size() > 13) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==12){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        } else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void kedata14(ActionEvent event) {
        if (DatabaseSungai.size() > 14) {
          for (int i = 0; i<DatabaseSungai.size(); i++){
           if(i==13){
                DatabaseSungai.get(i).setDipilih(true);;
           } else {
                DatabaseSungai.get(i).setDipilih(false);
           }
          }
          save.saveData(DatabaseSungai,"DatabaseSungai");
        } else {
          for (int i = 0; i<DatabaseSungai.size(); i++){
               DatabaseSungai.get(i).setDipilih(false);
          } save.saveData(DatabaseSungai,"DatabaseSungai");
        }
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.newScene("/UI/HasilPantau.fxml", "Hasil Pemantauan Sungai");
     }

     @FXML
     private void Cari(ActionEvent event){
     //pemanfaatan switch case untuk filter pencarian
     switch(Provinsi.getValue()) {
          case " -- Pilih Provinsi --":
               switch(DAS.getValue()) {
                    case "DAM Tunjung":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==0){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Brantas":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==1){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Bengawan Solo":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==2){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Bulanan":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==3){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Serayu":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==4){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cikundul":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==5){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cipanas":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==6){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cimahi":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==7){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cibeet":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==8){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Serayu":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==9){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Dengkeng":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==10){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Jajar":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==11){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Kedunguling":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==12){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Gending":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==13){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    }
          break;
          case "Jawa Timur":
               switch(DAS.getValue()){
                    case " -- Pilih DAS --":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==0 | i==1 | i==12 | i==13){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "DAM Tunjung":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==0){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Brantas":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==1){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Kedunguling":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==12){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Gending":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==13){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    default:
                         for (int i = 0; i<dat.size(); i++){
                              dat.get(i).setVisible(false);
                         }
                         OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
                         open.newScene("/UI/Warn.fxml", "WARNING");
                    break;
               }
          break;
          case "Jawa Tengah":
               switch(DAS.getValue()){
                    case " -- Pilih DAS --":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==2 | i==3 | i==4 | i==9 | i==10 | i ==11){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Bengawan Solo":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==2){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Bulanan":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==3){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Serayu":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==4){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Serayu":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==9){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Dengkeng":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==10){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Jajar":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==11){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    default:
                         for (int i = 0; i<dat.size(); i++){
                              dat.get(i).setVisible(false);
                         }
                         OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
                         open.newScene("/UI/Warn.fxml", "WARNING");
                    break;
               }
          break;
          case "Jawa Barat":
               switch(DAS.getValue()){
                    case " -- Pilih DAS --":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==5 | i==6 | i==7 | i==8){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cikundul":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==5){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cipanas":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==6){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cimahi":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==7){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    case "Sungai Cibeet":
                         for(int i = 0; i<dat.size(); i++){
                              if(i==8){
                                   dat.get(i).setVisible(true);
                              } else{
                                   dat.get(i).setVisible(false);
                              }
                         }
                    break;
                    default:
                         for (int i = 0; i<dat.size(); i++){
                              dat.get(i).setVisible(false);
                         }
                         OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
                         open.newScene("/UI/Warn.fxml", "WARNING");
                    break;
               }
          break;
     }
    }

    @FXML
    private void Reset(ActionEvent event){
     for (int i = 0; i<dat.size(); i++){
          dat.get(i).setVisible(true);
     }
     Provinsi.setValue(" -- Pilih Provinsi --");
     DAS.setValue(" -- Pilih DAS --");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     dp1.getDataPantau().add(s1_data1);
     dp1.getDataPantau().add(s1_data2);
     dp1.getDataPantau().add(s1_data3);

     dp2.getDataPantau().add(s2_data1);
     dp2.getDataPantau().add(s2_data2);
     dp2.getDataPantau().add(s2_data3);

     dp3.getDataPantau().add(s3_data1);
     dp3.getDataPantau().add(s3_data2);
     dp3.getDataPantau().add(s3_data3);

     dp4.getDataPantau().add(s4_data1);
     dp4.getDataPantau().add(s4_data2);
     dp4.getDataPantau().add(s4_data3);

     dp5.getDataPantau().add(s5_data1);
     dp5.getDataPantau().add(s5_data2);
     dp5.getDataPantau().add(s5_data3);

     dp6.getDataPantau().add(s6_data1);
     dp6.getDataPantau().add(s6_data2);
     dp6.getDataPantau().add(s6_data3);

     dp7.getDataPantau().add(s7_data1);
     dp7.getDataPantau().add(s7_data2);
     dp7.getDataPantau().add(s7_data3);

     dp8.getDataPantau().add(s8_data1);
     dp8.getDataPantau().add(s8_data2);
     dp8.getDataPantau().add(s8_data3);

     DatabaseSungai.add(sungai1);
     DatabaseSungai.add(sungai2);
     DatabaseSungai.add(sungai3);
     DatabaseSungai.add(sungai4);
     DatabaseSungai.add(sungai5);
     DatabaseSungai.add(sungai6);
     DatabaseSungai.add(sungai7);
     DatabaseSungai.add(sungai8);
     save.saveData(DatabaseSungai,"DatabaseSungai");

     //Pengisian item dalam choicebox Provinsi
     Provinsi.getItems().addAll(" -- Pilih Provinsi --","Jawa Timur","Jawa Tengah","Jawa Barat");
     Provinsi.setValue(" -- Pilih Provinsi --");

     //Pengisian item dalam choicebox DAS
     DAS.getItems().addAll(" -- Pilih DAS --", "Bengawan Solo", "DAM Tunjung", "Jajar", "Serayu", "Sungai Brantas",
        "Sungai Bulanan", "Sungai Cibeet", "Sungai Cikundul", "Sungai Cimahi", "Sungai Cipanas", "Sungai Dengkeng",
        "Sungai Gending", "Sungai Kedunguling", "Sungai Serayu");
     DAS.setValue(" -- Pilih DAS --");

     //Penginputan button dalam ArrayList button sungai
     dat.add(dat1);
     dat.add(dat2);
     dat.add(dat3);
     dat.add(dat4);
     dat.add(dat5);
     dat.add(dat6);
     dat.add(dat7);
     dat.add(dat8);
     dat.add(dat9);
     dat.add(dat10);
     dat.add(dat11);
     dat.add(dat12);
     dat.add(dat13);
     dat.add(dat14);

    }


    
}

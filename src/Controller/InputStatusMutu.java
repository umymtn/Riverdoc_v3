package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.DataBarChart;
import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author
 */
public class InputStatusMutu implements Initializable {

    @FXML
    private Label das;

    @FXML
    private DatePicker date;

    @FXML
    private ChoiceBox<String> Kategori;

    @FXML
    private TextField IP;

    @FXML
    private BarChart<String,Double> barChart;

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    SaveData save = new SaveData();
    
    XYChart.Series<String,Double> dataBar = new XYChart.Series<String,Double>();
    DataBarChart newdata = new DataBarChart(null, null, null, null, null, null, null, null);
    
    @FXML
    private void Add (ActionEvent event){
        String X = Kategori.getValue().toString();
        String Y;
        switch(Kategori.getValue()){
            case "Amonia":
                newdata.setAmonia(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getAmonia());
            break;
            case "BOD":
                newdata.setBOD(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getBOD());
            break;
            case "COD":
                newdata.setCOD(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getCOD());
            break;
            case "DO":
                newdata.setDO(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getDO());
            break;
            case "Nitrat":
                newdata.setNitrat(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getNitrat());
            break;
            case "PH":
                newdata.setPH(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getPH());
            break;
            case "TDS":
                newdata.setTDS(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getTDS());
            break;
            case "TSS":
                newdata.setTSS(Double.parseDouble(IP.getText()));
                Y = String.valueOf(newdata.getTSS());
            break;
            default:
                Y = "0";
            break;
        }
        dataBar.getData().add(new XYChart.Data<>(X,Double.parseDouble(Y)));
        save.saveData(DatabaseSungai, "DatabaseSungai");
        
    }

    @FXML
    private void Save (ActionEvent event){
        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(das.getText().equals(DatabaseSungai.get(i).getNamaSungai())){
                DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(i).setTgl(date.getValue().toString());
                DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(i).setDataBar(newdata);
            }
        }
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(DatabaseSungai.get(i).isDipilih()==true){
                das.setText(DatabaseSungai.get(i).getNamaSungai());
            }
        }

        dataBar.setName("Kandungan kategori per parameter");

        barChart.getData().add(dataBar);
        barChart.getXAxis().setLabel("Kategori");
        barChart.getYAxis().setLabel("Indeks Pencemar (IP)");

        Kategori.getItems().addAll("--Pilih Kategori--","Amonia", "BOD", "COD", "DO", "Nitrat", "PH", "TDS", "TSS");
        Kategori.setValue("--Pilih Kategori--");
    }
}

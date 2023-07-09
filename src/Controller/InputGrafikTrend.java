package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Model.NodeGrafik;
import Model.Sungai;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author
 */
public class InputGrafikTrend implements Initializable {

    @FXML
    private Label das;

    @FXML
    private DatePicker date;

    @FXML
    private ChoiceBox<String> Kategori;

    @FXML
    private TextField IP;

    @FXML
    private LineChart<String,Double> lineChart;

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    SaveData save = new SaveData();
    
    XYChart.Series<String,Double> lineData = new XYChart.Series<String,Double>();
    
    @FXML
    private void Add (ActionEvent event){
        String X = date.getValue().toString();
        String Y = IP.getText();
        lineData.getData().add(new XYChart.Data<>(X,Double.parseDouble(Y)));
        save.saveData(DatabaseSungai, "DatabaseSungai");
        
    }

    @FXML
    private void Save (ActionEvent event){
        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(das.getText().equals(DatabaseSungai.get(i).getNamaSungai())){
                DatabaseSungai.get(i).getDataGrafik().getDataGrafik().add(new NodeGrafik(date.getValue().toString(), Double.parseDouble(IP.getText())));
            }
        }
        save.saveData(DatabaseSungai, "DatabaseSungai");
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for(int i = 0; i<DatabaseSungai.size(); i++){
            if(DatabaseSungai.get(i).isDipilih()==true){
                das.setText(DatabaseSungai.get(i).getNamaSungai());
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(0).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(0).getNilaiIP()));
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(1).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(1).getNilaiIP()));
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(2).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(2).getNilaiIP()));
            }
        }
        lineData.setName("Nilai Indeks Pencemar");
        lineChart.getData().add(lineData);
        lineChart.getXAxis().setLabel("Tanggal");
        lineChart.getYAxis().setLabel("Indeks Pencemar (IP)");
        lineChart.getStyleClass().add("default-color0.chart-series-line");
    }
}

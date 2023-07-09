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
import Model.DataGrafik;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;



/**
 *
 * @author
 */
public class GrafikTrend implements Initializable {
    XYChart.Series <String,Double> lineData = new XYChart.Series<String,Double>();

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    DataGrafik dg1 = new DataGrafik();
    NodeGrafik s1_n1 = new NodeGrafik(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s1_n2 = new NodeGrafik(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s1_n3 = new NodeGrafik(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg2 = new DataGrafik();
    NodeGrafik s2_n1 = new NodeGrafik(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s2_n2 = new NodeGrafik(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s2_n3 = new NodeGrafik(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg3 = new DataGrafik();
    NodeGrafik s3_n1 = new NodeGrafik(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s3_n2 = new NodeGrafik(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s3_n3 = new NodeGrafik(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg4 = new DataGrafik();
    NodeGrafik s4_n1 = new NodeGrafik(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s4_n2 = new NodeGrafik(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s4_n3 = new NodeGrafik(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));
    
    DataGrafik dg5 = new DataGrafik();
    NodeGrafik s5_n1 = new NodeGrafik(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s5_n2 = new NodeGrafik(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s5_n3 = new NodeGrafik(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg6 = new DataGrafik();
    NodeGrafik s6_n1 = new NodeGrafik(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s6_n2 = new NodeGrafik(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s6_n3 = new NodeGrafik(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg7 = new DataGrafik();
    NodeGrafik s7_n1 = new NodeGrafik(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s7_n2 = new NodeGrafik(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s7_n3 = new NodeGrafik(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));

    DataGrafik dg8 = new DataGrafik();
    NodeGrafik s8_n1 = new NodeGrafik(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(0).getTgl(), Double.parseDouble(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(0).getDataPantau().getNilaiIP()));
    NodeGrafik s8_n2 = new NodeGrafik(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(1).getTgl(), Double.parseDouble(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(1).getDataPantau().getNilaiIP()));
    NodeGrafik s8_n3 = new NodeGrafik(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(2).getTgl(), Double.parseDouble(DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(2).getDataPantau().getNilaiIP()));
    
    SaveData save = new SaveData();

    @FXML
    private LineChart<String,Double> Line;


    @FXML
    private void exit (ActionEvent event){
        
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       dg1.getDataGrafik().add(s1_n1);
       dg1.getDataGrafik().add(s1_n2);
       dg1.getDataGrafik().add(s1_n3);

       dg2.getDataGrafik().add(s2_n1);
       dg2.getDataGrafik().add(s2_n2);
       dg2.getDataGrafik().add(s2_n3);

       dg3.getDataGrafik().add(s3_n1);
       dg3.getDataGrafik().add(s3_n2);
       dg3.getDataGrafik().add(s3_n3);

       dg4.getDataGrafik().add(s4_n1);
       dg4.getDataGrafik().add(s4_n2);
       dg4.getDataGrafik().add(s4_n3);

       dg5.getDataGrafik().add(s5_n1);
       dg5.getDataGrafik().add(s5_n2);
       dg5.getDataGrafik().add(s5_n3);

       dg6.getDataGrafik().add(s6_n1);
       dg6.getDataGrafik().add(s6_n2);
       dg6.getDataGrafik().add(s6_n3);

       dg7.getDataGrafik().add(s7_n1);
       dg7.getDataGrafik().add(s7_n2);
       dg7.getDataGrafik().add(s7_n3);

       dg8.getDataGrafik().add(s8_n1);
       dg8.getDataGrafik().add(s8_n2);
       dg8.getDataGrafik().add(s8_n3);
       
       DatabaseSungai.get(0).setDataGrafik(dg1);
       DatabaseSungai.get(1).setDataGrafik(dg2);
       DatabaseSungai.get(2).setDataGrafik(dg3);
       DatabaseSungai.get(3).setDataGrafik(dg4);
       DatabaseSungai.get(4).setDataGrafik(dg5);
       DatabaseSungai.get(5).setDataGrafik(dg6);
       DatabaseSungai.get(6).setDataGrafik(dg7);
       DatabaseSungai.get(7).setDataGrafik(dg8);
       save.saveData(DatabaseSungai, "DatabaseSungai");

       for(int i = 0; i<DatabaseSungai.size(); i++){
            if(DatabaseSungai.get(i).isDipilih()==true){
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(0).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(0).getNilaiIP()));
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(1).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(1).getNilaiIP()));
                lineData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(2).getTgl(),DatabaseSungai.get(i).getDataGrafik().getDataGrafik().get(2).getNilaiIP()));
            }
        }
        lineData.setName("Nilai Indeks Pencemar");
        Line.getData().add(lineData);
        Line.getXAxis().setLabel("Tanggal");
        Line.getYAxis().setLabel("Indeks Pencemar (IP)");
        Line.getStyleClass().add("default-color0.chart-series-line");
    }  
    
}

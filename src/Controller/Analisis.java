package Controller;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Model.DataBarChart;
import Model.DataProfilStasiun;
import Model.DataTable;
import Model.Sungai;
import javafx.collections.ObservableList;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 *
 * @author
 */
public class Analisis implements Initializable {

    @FXML
    private BorderPane mainPane;

    @FXML
    private Label NamaStasiun;

    @FXML
    private BarChart<String,Double> Bar;

    @FXML
    private JFXButton SM;

    @FXML
    private JFXButton PS;

    @FXML
    private JFXButton GT;

    @FXML
    private TableView<DataTable> Table;

    @FXML
    private TableColumn<DataTable, String> DAS;

    @FXML
    private TableColumn<DataTable, String> IP;

    @FXML
    private TableColumn<DataTable, String> SMA;

    @FXML
    private TableColumn<DataTable, String> PK;

    @FXML
    private TableColumn<DataTable, String> TD;

    SaveData save = new SaveData();

    LoadData load = new LoadData();
    ArrayList<Sungai> DatabaseSungai = load.loadData("DatabaseSungai");

    ObservableList<DataTable> data1 = observableArrayList(
        new DataTable(DatabaseSungai.get(0).getNamaSungai(), 
        DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data2 = observableArrayList(
        new DataTable(DatabaseSungai.get(1).getNamaSungai(), 
        DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data3 = observableArrayList(
        new DataTable(DatabaseSungai.get(2).getNamaSungai(), 
        DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data4 = observableArrayList(
        new DataTable(DatabaseSungai.get(3).getNamaSungai(), 
        DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data5 = observableArrayList(
        new DataTable(DatabaseSungai.get(4).getNamaSungai(), 
        DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data6 = observableArrayList(
        new DataTable(DatabaseSungai.get(5).getNamaSungai(), 
        DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data7 = observableArrayList(
        new DataTable(DatabaseSungai.get(6).getNamaSungai(), 
        DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );
    ObservableList<DataTable> data8 = observableArrayList(
        new DataTable(DatabaseSungai.get(7).getNamaSungai(), 
        DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getNilaiIP(),
        DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getStatusMutu(),
        DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().size()-1)).getDataPantau().getParameterKritis(),
        DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get((DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().size()-1)).getTgl())
    );

    XYChart.Series <String,Double> barData = new XYChart.Series<String,Double>();
    
    ArrayList<DataBarChart> barDataBase = new ArrayList<>();
    DataBarChart barData1 = new DataBarChart(0.0, 8.43, 4.57, 0.3, 3.2, 0.91, 0.25, 4.42);
    DataBarChart barData2 = new DataBarChart(0.0, 0.57, 0.32, 0.31, 0.45, 0.2, 0.26, 0.09);
    DataBarChart barData3 = new DataBarChart(5.73, 5.99, 3.36, 0.34, 0.13, 0.13, 0.0, 0.9);
    DataBarChart barData4 = new DataBarChart(0.2, 3.71, 0.56, 0.0, 0.0, 0.84, 0.11, 0.16);
    DataBarChart barData5 = new DataBarChart(0.55, 0.94, 0.18, 0.14, 0.66, 0.45, 0.0, 0.0);
    DataBarChart barData6 = new DataBarChart(0.25, 0.69, 0.12, 0.13, 0.6, 0.64, 0.2, 0.0);
    DataBarChart barData7 = new DataBarChart(0.4, 4.53, 3.32, 0.0, 3.58, 0.65, 0.26, 2.81);
    DataBarChart barData8 = new DataBarChart(5.23, 0.89, 0.45, 0.4, 0.0, 0.05, 0.21, 0.0);

    DataProfilStasiun sd1 = new DataProfilStasiun(null, null, null, null, null);
    DataProfilStasiun sd2 = new DataProfilStasiun("KLHK", "Sungai", "Tengah", "Desa Gampeng, Kecamatan Gampengrejo, Kabupaten Kediri, Jawa Timur", "Photo/KLHK68_Brantas.png");
    DataProfilStasiun sd3 = new DataProfilStasiun("INTEGRASI", "Sungai", "Tengah", "Desa Nglanjuk, Kecamatan Cepu, Kabupaten Blora, Jawa Tengah", "Photo/Blora2_Bengawan.png");
    DataProfilStasiun sd4 = new DataProfilStasiun("INTEGRASI", "Sungai", "Tengah", "Desa Bumiayu, Kecamatan Weleri, Kabupaten Kendal, Jawa Tengah", null);
    DataProfilStasiun sd5 = new DataProfilStasiun("INTEGRASI", "Sungai", "--", "Jalan Pramuka Barat, Dunupati, Maos Kidul, Kecamatan Maos, Kabupaten Cilacap, Jawa Tengah", "Photo/Cilacap1_Serayu.png");
    DataProfilStasiun sd6 = new DataProfilStasiun("INTEGRASI", "Sungai", "--", "Pintu Air Leuwibokor, Desa Cijagang, Kecamatan Cikalong Kulon, Kabupaten Cianjur, Jawa Barat", "Photo/Cikundul.png");
    DataProfilStasiun sd7 = new DataProfilStasiun("INTEGRASI", "Sungai", "Tengah", "Desa Krimun, Kecamatan Losarang, Kabupaten Indramayu, Jawa Barat", "Photo/Indramayu1_Cipanas.png");
    DataProfilStasiun sd8 = new DataProfilStasiun("KLHK", "Sungai", "Hulu", "Pemkot Cimahi, Cibabat, Cimahi Utara, Kota Cimahi, Jawa Barat", "Photo/Cimahi.png");

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
    private void keStatusMutu(ActionEvent event){
        OpenScene open = new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        open.openScene("/UI/Analisis.fxml");
    }

    @FXML
    private void keProfilStasiun (ActionEvent event){
        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (NamaStasiun.getText().equals("Stasiun " + DatabaseSungai.get(i).getNamaStasiun())) {
                DatabaseSungai.get(i).setDipilih(true); 
            }else{
                DatabaseSungai.get(i).setDipilih(false);
            }
        }
        save.saveData(DatabaseSungai, "DatabaseSungai");
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/ProfilStasiun");
        mainPane.setCenter(halaman);
    }
    
    // @FXML
    // private void keProfilStasiun (ActionEvent event){
    //     switch(NamaStasiun.getText()){
    //         case "Stasiun BANGKALAN-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==0){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KLHK68":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==1){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun BLORA-2":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==2){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KENDAL-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==3){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun CILACAP-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==4){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun CIANJUR-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==5){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun INDRAMAYU-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==6){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KLHK50":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==7){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //     }
    //     OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
    //     Pane halaman=object.getPane("/UI/ProfilStasiun");
    //     mainPane.setCenter(halaman);
    // }
    @FXML
    private void keGrafikTrend (ActionEvent event){
        for (int i = 0; i < DatabaseSungai.size(); i++) {
            if (NamaStasiun.getText().equals("Stasiun " + DatabaseSungai.get(i).getNamaStasiun())) {
                DatabaseSungai.get(i).setDipilih(true); 
            }else{
                DatabaseSungai.get(i).setDipilih(false);
            }
        }
        save.saveData(DatabaseSungai, "DatabaseSungai");
        OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
        Pane halaman=object.getPane("/UI/GrafikTrend");
        mainPane.setCenter(halaman);
    }
    // @FXML
    // private void keGrafikTrend (ActionEvent event){
    //     switch(NamaStasiun.getText()){
    //         case "Stasiun BANGKALAN-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==0){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KLHK68":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==1){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun BLORA-2":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==2){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KENDAL-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==3){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun CILACAP-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==4){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun CIANJUR-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==5){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun INDRAMAYU-1":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==6){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //         case "Stasiun KLHK50":
    //             for (int j = 0; j<DatabaseSungai.size(); j++){
    //                 if(j==7){
    //                     DatabaseSungai.get(j).setDipilih(true);
    //                 } else {
    //                     DatabaseSungai.get(j).setDipilih(false);
    //                 }
    //             }
    //             save.saveData(DatabaseSungai,"DatabaseSungai");
    //         break;
    //     }
    //     OpenScene object= new OpenScene((Stage)((Node)event.getSource()).getScene().getWindow());
    //     Pane halaman=object.getPane("/UI/GrafikTrend");
    //     mainPane.setCenter(halaman);
    // }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DAS.setCellValueFactory(new PropertyValueFactory<DataTable,String>("NamaSungai"));
        IP.setCellValueFactory(new PropertyValueFactory<DataTable,String>("NilaiIP"));
        SMA.setCellValueFactory(new PropertyValueFactory<DataTable,String>("StatusMutu"));
        PK.setCellValueFactory(new PropertyValueFactory<DataTable,String>("ParameterKritis"));
        TD.setCellValueFactory(new PropertyValueFactory<DataTable,String>("tgl"));

        DatabaseSungai.get(0).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData1);
        DatabaseSungai.get(1).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData2);
        DatabaseSungai.get(2).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData3);
        DatabaseSungai.get(3).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData4);
        DatabaseSungai.get(4).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData5);
        DatabaseSungai.get(5).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData6);
        DatabaseSungai.get(6).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData7);
        DatabaseSungai.get(7).getDatabaseStatus().getDataStatus().get(2).setDataBar(barData8);
        save.saveData(DatabaseSungai,"DatabaseSungai");

        ArrayList<ObservableList<DataTable>> dataSM = new ArrayList<>();
        dataSM.add(data1);
        dataSM.add(data2);
        dataSM.add(data3);
        dataSM.add(data4);
        dataSM.add(data5);
        dataSM.add(data6);
        dataSM.add(data7);
        dataSM.add(data8);
        save.saveData3(dataSM,"DataTabelStatusMutu");

        for(int i = 0; i<DatabaseSungai.size(); i++){
            int last = DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().size()-1;
            if(DatabaseSungai.get(i).isDipilih()==true){
                Table.setItems(dataSM.get(i));
                NamaStasiun.setText("Stasiun " + DatabaseSungai.get(i).getNamaStasiun());
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP1(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getAmonia()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP2(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getBOD()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP3(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getCOD()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP4(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getDO()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP5(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getNitrat()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP6(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getPH()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP7(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getTDS()));
                barData.getData().add(new XYChart.Data<>(DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getP8(),DatabaseSungai.get(i).getDatabaseStatus().getDataStatus().get(last).getDataBar().getTSS()));

            }
        }

        barData.setName("Indeks Pencemar Air per Kategori/Parameter");
        Bar.getData().add(barData);
        Bar.getXAxis().setLabel("Kategori");
        Bar.getYAxis().setLabel("Indeks Pencemar (IP)");
        Bar.getStyleClass().add("default-color0.chart-bar");

        DatabaseSungai.get(0).setDataProfil(sd1);
        DatabaseSungai.get(1).setDataProfil(sd2);
        DatabaseSungai.get(2).setDataProfil(sd3);
        DatabaseSungai.get(3).setDataProfil(sd4);
        DatabaseSungai.get(4).setDataProfil(sd5);
        DatabaseSungai.get(5).setDataProfil(sd6);
        DatabaseSungai.get(6).setDataProfil(sd7);
        DatabaseSungai.get(7).setDataProfil(sd8);
        save.saveData(DatabaseSungai,"DatabaseSungai");

        
        // SM.setOnMouseEntered(e->{
        //     SM.setStyle("-fx-border-color:  #3D6A36;"+"-fx-border-width: 0 0 3 0;");
        // });

        // SM.setOnMouseExited(e->{
        //     SM.setStyle("-fx-border-color:  none;"+"-fx-border-width: 0 0 0 0;");
        // });

        // PS.setOnMouseEntered(e->{
        //     PS.setStyle("-fx-border-color:  #3D6A36;"+"-fx-border-width: 0 0 3 0;");
        // });

        // PS.setOnMouseExited(e->{
        //     PS.setStyle("-fx-border-color:  none;"+"-fx-border-width: 0 0 0 0;");
        // });

        // GT.setOnMouseEntered(e->{
        //     GT.setStyle("-fx-border-color:  #3D6A36;"+"-fx-border-width: 0 0 3 0;");
        // });

        // GT.setOnMouseExited(e->{
        //     GT.setStyle("-fx-border-color:  none;"+"-fx-border-width: 0 0 0 0;");
        // });
        
    }  
    
}

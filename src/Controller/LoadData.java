package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileInputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import Model.ArticleSharedData;
import Model.DataTable;
import Model.Sungai;
import javafx.collections.ObservableList;

public class LoadData {
   public ArrayList<Sungai> loadData(String name){
    
    XStream xstream = new XStream(new StaxDriver());
    ArrayList<Sungai> arr = new ArrayList<>();

    FileInputStream cobi = null;

    try {

      // nama file yang akan dibuka (termasuk folder jika perlu
      cobi = new FileInputStream(name + ".xml");

      // harus diingat objek apa yang dahulu disimpan di file
      // program untuk membaca harus sinkron dengan program
      // yang dahulu digunakan untuk menyimpannya
      
      int isi;
      char charnya;
      String stringnya;
      
      // isi file dikembalikan menjadi string
      stringnya ="";
      while ((isi = cobi.read()) != -1) {
        charnya= (char) isi;
        stringnya = stringnya + charnya;
      }

      // string isi file dikembalikan menjadi larik double
      arr = (ArrayList<Sungai>) xstream.fromXML(stringnya);

      for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i) + " ");
      }

    } catch (Exception e) {
      System.err.println("test: " + e.getMessage());
    } finally {
      if (cobi != null) {
        try {
          cobi.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return arr;
   } 
   
   public ArrayList<ArticleSharedData> loadData2(String name){
    
    XStream xstream = new XStream(new StaxDriver());
    ArrayList<ArticleSharedData> arr = new ArrayList<>();

    FileInputStream cobi = null;

    try {

      // nama file yang akan dibuka (termasuk folder jika perlu
      cobi = new FileInputStream(name + ".xml");

      // harus diingat objek apa yang dahulu disimpan di file
      // program untuk membaca harus sinkron dengan program
      // yang dahulu digunakan untuk menyimpannya
      
      int isi;
      char charnya;
      String stringnya;
      
      // isi file dikembalikan menjadi string
      stringnya ="";
      while ((isi = cobi.read()) != -1) {
        charnya= (char) isi;
        stringnya = stringnya + charnya;
      }

      // string isi file dikembalikan menjadi larik double
      arr = (ArrayList<ArticleSharedData>) xstream.fromXML(stringnya);

      for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i) + " ");
      }

    } catch (Exception e) {
      System.err.println("test: " + e.getMessage());
    } finally {
      if (cobi != null) {
        try {
          cobi.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return arr;
   } 

   public ArrayList<ObservableList<DataTable>> loadData3(String name){
    
    XStream xstream = new XStream(new StaxDriver());
    ArrayList<ObservableList<DataTable>> arr = new ArrayList<>();

    FileInputStream cobi = null;

    try {

      // nama file yang akan dibuka (termasuk folder jika perlu
      cobi = new FileInputStream(name + ".xml");

      // harus diingat objek apa yang dahulu disimpan di file
      // program untuk membaca harus sinkron dengan program
      // yang dahulu digunakan untuk menyimpannya
      
      int isi;
      char charnya;
      String stringnya;
      
      // isi file dikembalikan menjadi string
      stringnya ="";
      while ((isi = cobi.read()) != -1) {
        charnya= (char) isi;
        stringnya = stringnya + charnya;
      }

      // string isi file dikembalikan menjadi larik double
      arr = (ArrayList<ObservableList<DataTable>>) xstream.fromXML(stringnya);

      for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i) + " ");
      }

    } catch (Exception e) {
      System.err.println("test: " + e.getMessage());
    } finally {
      if (cobi != null) {
        try {
          cobi.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return arr;
   }
}

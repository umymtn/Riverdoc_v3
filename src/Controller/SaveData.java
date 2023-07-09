package Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import Model.ArticleSharedData;
import Model.DataTable;
import Model.Sungai;
import javafx.collections.ObservableList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class SaveData {

    public void saveData(ArrayList<Sungai> arr, String name){
         XStream xstream = new XStream(new StaxDriver());

        // larik double diubah menjadi string dengan format XML
        String xml = xstream.toXML(arr);

        FileOutputStream coba = null;
        try {
            //membuat nama file & folder tempat menyimpan jika perlu
            coba = new FileOutputStream(name + ".xml");
 
            // mengubah karakter penyusun string xml sebagai 
            // bytes (berbentuk nomor2 kode ASCII
            byte[] bytes = xml.getBytes("UTF-8");
 
            // menyimpan file dari bytes
            coba.write(bytes);
        } 
        
        catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } 
        
        finally {
            if (coba != null) {
                try {
                    coba.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void saveData2(ArrayList<ArticleSharedData> arr, String name){
         XStream xstream = new XStream(new StaxDriver());

        // larik double diubah menjadi string dengan format XML
        String xml = xstream.toXML(arr);

        FileOutputStream coba = null;
        try {
            //membuat nama file & folder tempat menyimpan jika perlu
            coba = new FileOutputStream(name + ".xml");
 
            // mengubah karakter penyusun string xml sebagai 
            // bytes (berbentuk nomor2 kode ASCII
            byte[] bytes = xml.getBytes("UTF-8");
 
            // menyimpan file dari bytes
            coba.write(bytes);
        } 
        
        catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } 
        
        finally {
            if (coba != null) {
                try {
                    coba.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void saveData3(ArrayList<ObservableList<DataTable>> arr, String name){
         XStream xstream = new XStream(new StaxDriver());

        // larik double diubah menjadi string dengan format XML
        String xml = xstream.toXML(arr);

        FileOutputStream coba = null;
        try {
            //membuat nama file & folder tempat menyimpan jika perlu
            coba = new FileOutputStream(name + ".xml");
 
            // mengubah karakter penyusun string xml sebagai 
            // bytes (berbentuk nomor2 kode ASCII
            byte[] bytes = xml.getBytes("UTF-8");
 
            // menyimpan file dari bytes
            coba.write(bytes);
        } 
        
        catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } 
        
        finally {
            if (coba != null) {
                try {
                    coba.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

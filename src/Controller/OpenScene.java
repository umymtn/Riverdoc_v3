package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class OpenScene {
    private Stage stage;
    private Pane halaman;
    private List<Stage> stageMap = new ArrayList<>();

    public OpenScene(Stage stage){
        this.stage = stage;
    }
    
    //Untuk membuka scene
    public void openScene(String fileName){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Riverdoc");

            Image image = new Image("Photo/R_Logo.png");
            stage.getIcons().add(image);
            stage.show();

            stageMap.add(stage);
        }catch (Exception e){
            e.printStackTrace();
            // System.out.println("Tidak ditemukan halaman tersebut");
        }
    }

    //Untuk membuka scene baru
    public void newScene(String fileName, String title){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage newstage = new Stage();
            newstage.setScene(scene);
            newstage.setTitle(title);

            newstage.setX(420);
            newstage.setY(230);

            Image image = new Image("Photo/R_Logo.png");
            newstage.getIcons().add(image);
            newstage.initStyle(StageStyle.TRANSPARENT);
            newstage.show();
            
        }catch (Exception e){
       
            System.out.println("Tidak ditemukan halaman tersebut");
        }
    }

    //Untuk menutup semua scene yang ada kecuali scene yang dipilih
    public void closeAllWindowsExceptCurrent(Stage currentStage) {
        for (Window window : Stage.getWindows()) {
            if (window instanceof Stage) {
                Stage stage = (Stage) window;
                if (stage != currentStage) {
                    stage.close();
                }
            }
        }
    }
    
    public Pane getPane(String fileName){
        try{
            URL fileHalaman = Controller.OpenScene.class.getResource(fileName+".fxml");
            
            if(fileHalaman == null){
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            
            FXMLLoader loader = new FXMLLoader(fileHalaman);
            halaman = loader.load();
            
        } catch (Exception e){
            e.printStackTrace();
            // System.out.println("Tidak ditemukan halaman tersebut");
        }
        
        return halaman;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public List<Stage> getStageMap() {
        return stageMap;
    }

    public void setStageMap(List<Stage> stageMap) {
        this.stageMap = stageMap;
    }
}
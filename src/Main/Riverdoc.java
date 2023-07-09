package Main;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */

 import Controller.OpenScene;
import javafx.application.Application;
//  import javafx.fxml.FXMLLoader;
//  import javafx.scene.image.Image;
//  import javafx.scene.Parent;
//  import javafx.scene.Scene;
 import javafx.stage.Stage;
 
 /**
  *
  * @author
  */
 public class Riverdoc extends Application {
     private Stage stage;
     private OpenScene openScene;

     @Override
     public void start(Stage primaryStage) throws Exception {
        //  Parent root = FXMLLoader.load(getClass().getResource("/UI/HomePage.fxml"));
         
        //  Scene scene = new Scene(root);
         
        //  stage.setTitle("Riverdoc");
        //  stage.setScene(scene);
        //  stage.show();

        //  Image image = new Image("Photo/R_Logo.png");
        //  stage.getIcons().add(image);
        stage = primaryStage;
        openScene = new OpenScene(stage);
        openScene.openScene("/UI/HomePage.fxml");
     }
     
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         launch(args);
     }
     
 }
 
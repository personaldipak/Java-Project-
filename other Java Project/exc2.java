/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author dm1103
 */
public class MiniProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(5); //space horizontal and spacing between image is 10
        //VBox = vertical image set
        pane.setPadding(new Insets(50)); //set padding to image (space between screen and image). 
        Image image = new Image("CardImages/1.png", 100, 100, true, true); //insert image 
        pane.getChildren().add(new ImageView(image)); // view image

        Image image2 = new Image("CardImages/2.png", 100, 100, true, true);
        pane.getChildren().add(new ImageView(image2));
      
        Image image3 = new Image("CardImages/3.png", 100, 100, true, true);
        pane.getChildren().add(new ImageView(image3));
       
        Image image4 = new Image("CardImages/4.png", 100, 100, true, true);
        pane.getChildren().add(new ImageView(image4));
        

      Scene scene = new Scene(pane);
      primaryStage.setTitle("ShowImage");
      primaryStage.setScene(scene);
      primaryStage.show();
        
    }
}

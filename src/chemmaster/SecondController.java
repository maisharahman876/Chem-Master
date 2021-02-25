/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemmaster;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SecondController implements Initializable {

   @FXML   
     public void back(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("Prothom.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
     @FXML
      public void student(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("third.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
      @FXML
       public void teacher(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("Login.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

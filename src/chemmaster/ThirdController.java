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
public class ThirdController implements Initializable {
    @FXML   
     public void back(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("second.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
     @FXML   
     public void orfourth(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("orfourth.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
        @FXML
    public void clickinorganic(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("Infourth.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
     

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

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
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class FirstController implements Initializable {
        @FXML
           private Button btn;
    @FXML
    void clickenter(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("second.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

    

    
   
   
    
}

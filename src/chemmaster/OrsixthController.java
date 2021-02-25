/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemmaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AKM
 */
public class OrsixthController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField ff;
    @FXML
    private TextField ini;
@FXML
public void update(ActionEvent event) throws FileNotFoundException
{
    String temp,temp2;
    temp=ff.getText();
    temp2=ini.getText();
      int i,j;
         StringBuilder msg=new StringBuilder();
          File f=new File("final.txt");
          File f2=new File("reactant.txt");
          Scanner sc=new Scanner(f);
          Scanner sc2=new Scanner(f2);
          String[] ob=new String[100];
           String[] ob2=new String[100];
           
             for(j=0;;j++)
          {
              if(sc2.hasNext())
              {
            ob2[j]=sc2.next();
         
              }
              else break;
          }
             for(i=0;;i++)
             {
                 if(sc.hasNext())
                 {
                     ob[i]=sc.next();
                     if(temp.equals(ob[i]))
                     {
                         j=2*i;
                         if(temp2.equals(ob2[j])||temp2.equals(ob2[j+1]))
                         {
                  msg.append(ob2[j]);
                  msg.append("+");
                  msg.append(ob2[j+1]);
                  msg.append("----->");
                  msg.append(ob[i]);
                  msg.append("\n");
                         }
                     }
                         
                 }
                 else break;
    
                    
             }
             label1.setText(msg.toString());
             
             
         
}
 public void back(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("orfourth.fxml"));
       Scene secondscene=new Scene(secondpage);
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

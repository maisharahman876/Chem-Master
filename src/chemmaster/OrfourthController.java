/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemmaster;

import static java.awt.JobAttributes.DestinationType.FILE;
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;



import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AKM
 */

public class OrfourthController implements Initializable {

    @FXML
    private MenuButton bb;
    @FXML
    private MenuItem ob1;
    @FXML
    private MenuItem ob2;
    @FXML
    private Label lbl;
   

     public void back(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("third.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
     public void back2(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("orfourth.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
         public void orfifth(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("orfifth.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
            @FXML
      public void orsixth(ActionEvent event) throws IOException
   {
       Parent secondpage=FXMLLoader.load(getClass().getResource("orsixth.fxml"));
       Scene secondscene=new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
       public String general(String r) throws FileNotFoundException
       {
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
            //lbl.setText(ob2[j]);
              }
              else break;
          }
        for(i=0;;i++)
          {
              if(sc.hasNext())
              {
                  ob[i]=sc.next();
                  
                 if(r.equals(ob[i]))
                 {
                     j=2*i;
                  msg.append(ob2[j]);
                  msg.append("+");
                  msg.append(ob2[j+1]);
                  msg.append("----->");
                 msg.append(ob[i]);
                  msg.append("\n");
                  }
                     
              }
              else break;
              
          }
        return msg.toString();
       }
        
   
      @FXML
       public void ob1(ActionEvent event) throws IOException
       {
         bb.setText(ob1.getText());
        lbl.setText(general("alcohol(R-OH)"));
       }  
    @FXML
       public void ob2(ActionEvent event) throws IOException
       {
           bb.setText(ob2.getText());
        lbl.setText(general("aldyhide(R-CHO)"));   
       } 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

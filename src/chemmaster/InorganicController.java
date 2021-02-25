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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class InorganicController implements Initializable {

     @FXML
    private TextField tf;
        @FXML
    private TextField tf2;
      @FXML
    private Label label2;
         @FXML
    private Label label3;
    @FXML
    private Button gg;
    
      
   @FXML    
   public void naming(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("fifthin.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
    @FXML
      
   public void periodic(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("periodic.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
    @FXML
      
   public void enterperiodic(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("Insixth.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
    @FXML
   public void back3(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("third.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
    
      @FXML
   public void back2(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("Infourth.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
    @FXML
   public void back4(ActionEvent event) throws IOException {
        
       Parent secondpage=FXMLLoader.load(getClass().getResource("periodic.fxml"));
       Scene secondscene =new Scene(secondpage);
       Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(secondscene);
       window.show();
   }
   
   
   
   @FXML
   public void update1(ActionEvent event)throws FileNotFoundException {
       String temp;
       int i=0;
       temp=tf.getText();
      
       
        StringBuilder msg=new StringBuilder();
         File f=new File("symbol.txt");
         Scanner out=new Scanner(f);
         String[] ob=new String[100];
           while(out.hasNext())
      {
     
        ob[i]=out.next();
         
        i++;
        
      }
       for(int j=0;ob[j]!=null;j++)
      {
          if(temp.equalsIgnoreCase(ob[j]))
          {
             if(j%2==0) 
             {
                 msg.append(ob[j+1]);
                 break;
             }
             else
             {
                  msg.append(ob[j-1]); 
                  break;
             }
            
              
          }
          
      }
          
     label2.setText(msg.toString());     
          
           
       
   }
   public static boolean isInteger(String s) {
    return isInteger(s,10);
}

public static boolean isInteger(String s, int radix) {
    if(s.isEmpty()) return false;
    for(int i = 0; i < s.length(); i++) {
        if(i == 0 && s.charAt(i) == '-') {
            if(s.length() == 1) return false;
            else continue;
        }
        if(Character.digit(s.charAt(i),radix) < 0) return false;
    }
    return true;
}
    
   @FXML
   public void update2(ActionEvent event)throws FileNotFoundException {
       String temp;
       int i=0,j;
       temp=tf2.getText();
      
       
        StringBuilder msg=new StringBuilder();
         File f=new File("periodic.txt");
         Scanner out=new Scanner(f);
         String[] ob=new String[1000];
           while(out.hasNext())
      {
     
        ob[i]=out.next();
          System.out.println(ob[i]);
        i++;  
      }
       for( j=0;ob[j]!=null;j++)
      {
          if(temp.equalsIgnoreCase(ob[j]))
          {
              if(isInteger(temp))
              {
                  do
                  {
                      msg.append(ob[j+2]);
                      System.out.println(ob[j+2]);
                       msg.append("\n");
                      j++;
                  }while(!isInteger(ob[j+2]));
                 
              }
               
          
          else
          {
              
                  while(!isInteger(ob[j+1]))
                  {
                      msg.append(ob[j+1]);
                       msg.append("\n");
                      j++;
                  }
          }
          }
         
          
      }
          
     label3.setText(msg.toString());     
          
   } 
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

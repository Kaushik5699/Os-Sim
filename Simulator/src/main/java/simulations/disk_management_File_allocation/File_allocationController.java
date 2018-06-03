/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulations.disk_management_File_allocation;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static java.lang.System.exit;

public class File_allocationController implements Initializable {
    public int x=0;
    @FXML
    public AnchorPane scenepane;
    @FXML
    public TextField t1;
    @FXML
    public Button res;
    @FXML
    public Button f1;
    @FXML
    public Button f2;
    @FXML
    public Button f3;
    @FXML
    public Button f4;
    @FXML
    public Button f5;
    @FXML
    public Button f6;
    @FXML
    public Button f7;
    @FXML
    public Button f8;
    @FXML
    public Button f9;
    @FXML
    public Button f10;
    @FXML
    public Button f11;
    @FXML
    public Button f12;
    @FXML
    public Button f13;
    @FXML
    public Button f14;
    @FXML
    public Button f15;
    @FXML
    public Button f16;
    @FXML
    public Button f17;
    @FXML
    public Button f18;
    @FXML
    public Button f19;
    @FXML
    public Button f20;
    @FXML
    public Button f21;
    @FXML
    public Button f22;
    @FXML
    public Button f23;
    @FXML
    public Button f24;
    @FXML
    public Button f25;
    @FXML
    public Button f26;
    @FXML
    public Button f27;
    @FXML
    public Button f28;
    @FXML
    public Button f29;
    @FXML
    public Button f30;
    @FXML
    public Button f31;
    @FXML
    public Button f32;
    @FXML
    public Button f33;
    @FXML
    public Button f34;
    @FXML
    public Button f35;
    @FXML
    public Button f36;
    @FXML
    public Button f37;
    @FXML
    public Button f38;
    @FXML
    public Button f39;
    @FXML
    public Button f40;
    @FXML
    public Button f41;
    @FXML
    public Button f42;
    @FXML
    public Button f43;
    @FXML
    public Button f44;
    @FXML
    public Button f45;
    @FXML
    public Button f46;
    @FXML
    public Button f47;
    @FXML
    public Button f48;
    @FXML
    public Button f49;
    @FXML
    public Button det;
    @FXML
    public RadioButton r1;
    @FXML
    public RadioButton r2;
    @FXML
    public TextField t2;
    public Button array[];
    @FXML
    public RadioButton r3;
    @FXML
    public Button back;
    @FXML
    public TextField t3;
    @FXML
    public TextField t4;
    public String loc=null;
    public String loc1=null;
    @FXML
    void hamburgerHandler(MouseEvent event) {
    }
    public File_allocationController()  {
    }
       @FXML
    public void actionHandler () throws IOException {
       int[][] a1 = new int[2][20];
      int i,j;
       for(i=0;i<2;i++)
      {
          for(j=0;j<20;j++)
          {
              a1[i][j]=0;
          }
      }
      //array of the blocks as buttons
        this.array = new Button[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14,
                f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32,
                f33, f34, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49};
        String name = t2.getText(); //getting the names of the files
        String name1=t3.getText();
        if(name.equals(name1))  // checking if they are the same file
        {
            JOptionPane.showMessageDialog(null,"Enter a different file name");
            Stage window = (Stage) scenepane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/simulations/disk_management_File_allocation/File_allocation.fxml"));
            window.setScene(new Scene(root));
            window.show();
            exit(0);
    }
        int total=0;
        int n=Integer.parseInt(t1.getText());  //getting the sizes of the files
        int n1=Integer.parseInt(t4.getText());
        total=n+n1;
    String text;
    int d=n;
        //sequential file allocation method
        try {
        if(r1.isSelected()) {
            i = 0;
            for (i = x; i < total; i++) {
                array[i].setStyle("fx-background-color:#ff0000;");
                ++x;
                if(i<n)
                {
                    a1[0][i]=i+1;
                }
                else
                {
                   a1[1][i-n]=i+1;
                }
            }
        }
        // Linked list file allocation method
        else if(r2.isSelected()) {
            //linked
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int k = 1; k < 50; k++) {
                list.add(new Integer(k));
            }
            Collections.shuffle(list);
            for (int k = 0; k < total; k++)
            {
                array[list.get(k)].setStyle("fx-baclground-color:#ff0000;");
                if(k<n)
                {
                    a1[0][k]=list.get(k);
                }
                else
                {
                    a1[1][k-n]=list.get(k);
                }
            }
            }
            //indexed file allocation method
        else if(r3.isSelected())
        {
            int t=a1[0][0]=30;
            int t2=a1[1][0]=24;
            Random randomNum= new Random();
           // JOptionPane.showMessageDialog(null,t);
            array[t].setStyle("fx-background-color:#00ff00;");
            array[t2].setStyle("fx-background-color:#00ff00;");
            ArrayList<Integer> list1=new ArrayList<Integer>();
            for(int k=1;k<49;k++)
            {
                list1.add(new Integer(k));
            }
            Collections.shuffle(list1);
            int k=0;
            for( k=1;k<total;k++)
            {
                if(list1.get(k)!=t && list1.get(k)!=t2)
                {
                    array[list1.get(k)].setStyle("fx-background-color:#ff0000;");
                    //Thread.sleep(2000);
                }
                if(k<n)
                {
                    a1[0][k]=list1.get(k);
                }
                else
                {
                    a1[1][k-n]=list1.get(k);
                }
            }
        }
        //show details by blocks of allocation of the specific file
         i=0;
        loc =" ";
        for(i=0;i<n;i++)
            {
                String s="->" + ""+a1[0][i]+"";
                 loc=loc + s;
            }
            loc1 =" ";
            for(i=0;i<n1;i++)
            {
                String s="->" + ""+a1[1][i]+"";
                loc1=loc1 + s;
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void exithandler() throws IOException  // exit the module
    {
            Stage window = (Stage) scenepane.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/newSimulation/newSimulation.fxml"));
            window.setScene(new Scene(root));
            window.show();

    }
    public void showdetails()   // to show the details of allocation of files
    {    String name = t2.getText();
            String name1 = t3.getText();
        JOptionPane.showMessageDialog(null,"The file "+name+" is stored in "+loc+" " +
                "and the file "+name1+" is stored in "+loc1+"");
    }
    public void clearall() throws IOException
    {
        Stage window = (Stage) scenepane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/simulations/disk_management_File_allocation/File_allocation.fxml"));
        window.setScene(new Scene(root));
        window.show();
    }
      /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //initializer
        // TODO
    }    
    
}

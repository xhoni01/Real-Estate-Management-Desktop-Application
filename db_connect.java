/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;



import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class db_connect {
public static Connection db_connection(){
    Connection con=null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/compputer_application_project?allowPublicKeyRetrieval useSSL=FALSE;","root","");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "not connnected with dtabase");
        System.out.println(e);
    }
    return con;
}  //end of method  
    
}//end of class




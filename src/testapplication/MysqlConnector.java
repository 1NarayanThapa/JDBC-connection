/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author acer
 */

public class MysqlConnector {
    public static void main(String args[]){
        Connection con=null;
        
      try{ Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("driver loaded");
     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin?useUnicode="
             + "true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode="
             + "false&serverTimezone=UTC","root","");
    
          System.out.println("connecton established");
          
      
      }catch(ClassNotFoundException e){
          System.out.println("Exception  "+e.getMessage());
      }catch(SQLException e){
          System.out.println("SQLException  "+e.getMessage());
      }
     
     try{ con.close();
             }catch(SQLException e){
                System.out.println("Exception"+e.getMessage());
             }
}
}

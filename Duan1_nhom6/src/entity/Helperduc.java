/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */ 
public class Helperduc {
    public static Connection ketnoi(String database){
          try {
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName="+database;
            Connection cn = DriverManager.getConnection(url, user, pass);
            return cn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       
    }
    
}

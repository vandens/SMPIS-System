/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_system;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vandens
 */


public class dbconnection {
    private static String url = "jdbc:mysql://localhost:3306/db_sekolah";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "smpis_system";   
    private static String password = "smpis_system";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}


/* class test
class dbconnection{  
public static void main(String args[]){ 
    
try{  
    Class.forName("com.mysql.jdbc.Driver");  

    //here sonoo is database name, root is username and password
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/db_sekolah","root","vandens")) {
        //here sonoo is database name, root is username and password
        
        Statement stmt=con.createStatement();
        
        ResultSet rs=stmt.executeQuery("select * from m_student");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
    }  

    }catch(Exception e){ System.out.println(e);}  

    } 
}  

*/
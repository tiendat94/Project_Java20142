/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

/**
 *
 * @author tiendat
 */
public class Connect {
    public static Connection getConnect(){
       try{
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien","root","muathuvang");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"kết nối cơ sở dữ liệu thất bại ","Warning",JOptionPane.WARNING_MESSAGE);        
           return null;     
       }
    }
   
    
}

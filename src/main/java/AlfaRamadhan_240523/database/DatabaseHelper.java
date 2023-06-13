/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_240523.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class DatabaseHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;            
    }  
    
    public static void main(String[] args){
        try{
            Connection con = getConnection();
            JOptionPane.showMessageDialog(null, "KONEKSI OK");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
                }
        }
    }


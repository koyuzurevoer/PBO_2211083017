/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dul.db;

import dul.model.Anggota;
import dul.dao.AnggotaDaoImpl;
import dul.dao.AnggotaDao;
import com.mysql.cj.jdbc.*;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection==null){
            MysqlDataSource dataSource = new  MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/pbo_2211083017");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args){
        try {
            connection = DbHelper.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            Anggota anggota = new Anggota("A001", "Dul", "Padang", "L");
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Entri data Ok");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}

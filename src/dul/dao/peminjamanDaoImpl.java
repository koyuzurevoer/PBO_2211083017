/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dul.dao;

import dul.model.peminjaman;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABP1KOMP
 */
public class peminjamanDaoImpl {
    public class PeminjamanDaoImpl implements  peminjamanDao{
    private Connection connection;
    
    public PeminjamanDaoImpl(Connection connection ){
        this.connection = connection;
    }
    
    
    public void insert (peminjaman anggota) throws Exception{
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.setString(2, anggota.getKodebuku());
        ps.setString(3, anggota.getTglpinjam());
        ps.setString(4, anggota.getTglkembali());
        ps.executeUpdate();
        ps.close();
                
    }
    
    public peminjaman getpeminjaman(String kodeanggota) throws Exception {
        String sql = "Select * FROM anggota WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ResultSet rs = ps.executeQuery();
        peminjaman anggota = null;
        if(rs.next()){
            anggota = new peminjaman();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setKodebuku(rs.getString(2));
            anggota.setTglpinjam(rs.getString(3));
            anggota.setTglkembali(rs.getString(4));
            
        }
        return anggota;
    }
    public List<peminjaman> getAll() throws Exception{
        String sql = "Select * FROM anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        peminjaman anggota;
        List<peminjaman> list = new ArrayList<>();
        while(rs.next()){
            anggota = new peminjaman();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setKodebuku(rs.getString(2));
            anggota.setTglpinjam(rs.getString(3));
            anggota.setTglkembali(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
    
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;

import UTS_A.model.*;

/**
 *
 * @author ASUS
 */
public class Warnet {
    private Pelanggan Pelanggan;
    private String tglpinjam;
    private String tglkembali;
    
    public Warnet(){
        
    }
    public Warnet (Pelanggan Pelanggan, String tglpinjam, String tglkembali){
        this.Pelanggan = Pelanggan;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    public Pelanggan getPelanggan(){
        return Pelanggan;
    }
    public void setPelanggan(Pelanggan Pelanggan){
        this.Pelanggan = Pelanggan;
    }
    
    
    public String getTglpinjam(){
        return tglpinjam;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public String getTglkembali(){
        return tglkembali;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
}

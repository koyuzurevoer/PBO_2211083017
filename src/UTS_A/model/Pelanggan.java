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
public class Pelanggan {
    private String KodePel;
    private String nama;
    private String JenisPel;
    
    public Pelanggan(){
        
    }
    
    public Pelanggan (String KodePel, String nama, String JenisPel){
        this.KodePel = KodePel;
        this.nama = nama;
        this.JenisPel = JenisPel;
    }
    public String getKodePel(){
        return KodePel;
    }
    
    public void setKodePel(String KodePel){
        this.KodePel = KodePel;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJenisPel(){
        return JenisPel;
    }
    
    public void setJenisPel(String JenisPel){
        this.JenisPel = JenisPel;
    }
    
}

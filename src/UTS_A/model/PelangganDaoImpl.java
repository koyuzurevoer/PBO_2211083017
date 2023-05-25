/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;
import UTS_A.model.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class PelangganDaoImpl implements PelangganDao {
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl(){
        data.add(new Pelanggan("1111", "Abdul", "VIP"));
        data.add(new Pelanggan("1112", "Latif", "GOLD"));
        data.add(new Pelanggan("1113", "Bedul", "VIP"));
    }
    
    public void save(Pelanggan Pelanggan){
        data.add(Pelanggan);
    }
    
    public void update(int index, Pelanggan Pelanggan){
        data.set(index, Pelanggan);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAll(){
        return data;
    }
}

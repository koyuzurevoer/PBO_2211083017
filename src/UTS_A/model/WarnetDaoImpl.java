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
public class WarnetDaoImpl implements WarnetDao {
    List<Warnet> data = new ArrayList<>();
    
    public WarnetDaoImpl(){
        PelangganDao daoPelanggan = new PelangganDaoImpl();
        data.add(new Warnet (daoPelanggan.getPelanggan(0), "12/03/2023", "13/03/2023"));
        data.add(new Warnet (daoPelanggan.getPelanggan(0), "12/03/2023", "13/03/2023"));
    }
    
public void save(Warnet Warnet){
        data.add(Warnet);
    }
    
    public void update(int index, Warnet Warnet){
        data.set(index, Warnet);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    public List<Warnet> getAll(){
        return data;
    }
}

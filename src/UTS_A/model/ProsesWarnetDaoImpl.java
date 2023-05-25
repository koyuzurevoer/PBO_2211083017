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
 * @author Bagas
 */
public class ProsesWarnetDaoImpl implements ProsesWarnetDao{
    List<ProsesWarnet> data = new ArrayList<>();
    public ProsesWarnetDaoImpl(){
        WarnetDaoImpl data1 = new WarnetDaoImpl();
        data.add(new ProsesWarnet(data1.getWarnet(0).getTglkembali(),"29/04/2023"));
        data.add(new ProsesWarnet("",""));
    }
    public void save(ProsesWarnet ProsesWarnet){
        data.add(ProsesWarnet);
    }
    public void update(int idx, ProsesWarnet ProsesWarnet){
        data.set(idx, ProsesWarnet);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public ProsesWarnet getProsesWarnet(int idx){
        return data.get(idx);
    }
    public List<ProsesWarnet> getAll(){
        return data;
    }
}

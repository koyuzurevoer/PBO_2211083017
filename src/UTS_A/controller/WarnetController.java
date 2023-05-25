/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.controller;
import UTS_A.controller.*;
import UTS_A.model.WarnetDaoImpl;
import UTS_A.model.Pelanggan;
import UTS_A.model.Warnet;
import UTS_A.model.WarnetDao;
import UTS_A.model.PelangganDaoImpl;
import UTS_A.model.PelangganDao;
import UTS_A.view.FormWarnet;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class WarnetController {
    private FormWarnet formWarnet;
    private WarnetDao WarnetDao;
    private Warnet Warnet;
    
    private PelangganDao PelangganDao;
    
    public WarnetController (FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        WarnetDao = new WarnetDaoImpl();
        PelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formWarnet.getTxtTglpinjam().setText("");
        formWarnet.getTxtTglkembali().setText("");
    }
    
    public void isiCombo(){
        List<Pelanggan> listPelanggan = PelangganDao.getAll();
        formWarnet.getCboPelanggan().removeAllItems();
        
        //isi Pelanggan
        for (Pelanggan Pelanggan : listPelanggan){
            formWarnet.getCboPelanggan().addItem(Pelanggan.getKodePel());
        }
        
    }
    
    public void saveWarnet(){
        Warnet = new Warnet();
        Warnet.setPelanggan(
    PelangganDao.getPelanggan(formWarnet.getCboPelanggan().getSelectedIndex()));
        Warnet.setTglpinjam(formWarnet.getTxtTglpinjam().getText());
        Warnet.setTglkembali(formWarnet.getTxtTglkembali().getText());
        WarnetDao.save(Warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet,
                "Entri OK");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        Warnet = WarnetDao.getWarnet(index);
        if(Warnet != null){
            formWarnet.getCboPelanggan()
                    .setSelectedItem(Warnet.getPelanggan().getKodePel());
            formWarnet.getTxtTglpinjam().setText(Warnet.getTglpinjam());
            formWarnet.getTxtTglkembali().setText(Warnet.getTglkembali());                
        }
    }
    
    public void updateWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
       Warnet.setPelanggan(
    PelangganDao.getPelanggan(formWarnet.getCboPelanggan().getSelectedIndex()));
        Warnet.setTglpinjam(formWarnet.getTxtTglpinjam().getText());
        Warnet.setTglkembali(formWarnet.getTxtTglkembali().getText());
        WarnetDao.update(index, Warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet,
                "Update OK");
    }
    
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        WarnetDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formWarnet,
                "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Warnet> list = WarnetDao.getAll();
        for(Warnet Warnet : list){
            Object[] data = {
                Warnet.getPelanggan().getKodePel(),
                Warnet.getPelanggan().getNama(),
                Warnet.getTglpinjam(),
                Warnet.getTglkembali()
                    
            };
            tabelModel.addRow(data);
        }
    }
}


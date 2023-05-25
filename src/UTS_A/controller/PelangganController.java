/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.controller;
import UTS_A.controller.*;
import UTS_A.model.Pelanggan;
import UTS_A.model.PelangganDaoImpl;
import UTS_A.model.PelangganDao;
import UTS_A.view.FormPelanggan;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private PelangganDao PelangganDao;
    private Pelanggan Pelanggan;
    
    public PelangganController (FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan;
        PelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formPelanggan.getTxtKodePel().setText("");
        formPelanggan.getTxtNama().setText("");
        formPelanggan.getTxtJenisPel().setText("");
    }
    
    public void savePelanggan(){
        Pelanggan = new Pelanggan();
        Pelanggan.setKodePel(formPelanggan.getTxtKodePel().getText());
        Pelanggan.setNama(formPelanggan.getTxtNama().getText());
        Pelanggan.setJenisPel(formPelanggan.getTxtJenisPel().getText());
        PelangganDao.save(Pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan,
                "Entri OK");
    }
    
    public void getPelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        Pelanggan = PelangganDao.getPelanggan(index);
        if(Pelanggan != null){
            formPelanggan.getTxtKodePel().setText(Pelanggan.getKodePel());
            formPelanggan.getTxtNama().setText(Pelanggan.getNama());
            formPelanggan.getTxtJenisPel().setText(Pelanggan.getJenisPel());
                    
        }
    }
    
    public void updatePelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        Pelanggan.setKodePel(formPelanggan.getTxtKodePel().getText());
        Pelanggan.setNama(formPelanggan.getTxtNama().getText());
        Pelanggan.setJenisPel(formPelanggan.getTxtJenisPel().getText());
        PelangganDao.update(index, Pelanggan);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan,
                "Update OK");
    }
    
    public void deletePelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        PelangganDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPelanggan,
                "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPelanggan.getTblPelanggan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pelanggan> list = PelangganDao.getAll();
        for(Pelanggan Pelanggan : list){
            Object[] data = {
                Pelanggan.getKodePel(),
                Pelanggan.getNama(),
                Pelanggan.getJenisPel() 
            };
            tabelModel.addRow(data);
        }
    }
}

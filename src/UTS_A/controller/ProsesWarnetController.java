/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.controller;
import UTS_A.controller.*;
import UTS_A.model.WarnetDaoImpl;
import UTS_A.model.Pelanggan;
import UTS_A.model.Warnet;
import UTS_A.model.PelangganDaoImpl;
import UTS_A.model.PelangganDao;
import UTS_A.model.ProsesWarnet;
import UTS_A.model.ProsesWarnetDao;
import UTS_A.model.ProsesWarnetDaoImpl;
import UTS_A.view.FormWarnet;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author Bagas
 */
public class ProsesWarnetController {
    private ProsesWarnet ProsesWarnet;
    private ProsesWarnetDao ProsesWarnetDao;
    private WarnetDaoImpl WarnetDao;
    private FormWarnet form;
    
    private Warnet Warnet;
    
    private PelangganDao PelangganDao;
    
    public ProsesWarnetController(FormWarnet form){
        this.form = form;
        ProsesWarnetDao = new ProsesWarnetDaoImpl();
        WarnetDao = new WarnetDaoImpl();
        PelangganDao = new PelangganDaoImpl();
    }
    public void bersihForm(){
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
        form.getTxtDikembalikan().setText("");
    }
    public void isiCombo(){
        List<Pelanggan> listPelanggan = PelangganDao.getAll();
        form.getCboPelanggan().removeAllItems();
        
        //isi
        for(Pelanggan Pelanggan : listPelanggan){
            form.getCboPelanggan().addItem(Pelanggan.getKodePel());
        }
    }
    public void saveWarnet(){
        Warnet = new Warnet();
        Warnet.setPelanggan(PelangganDao.getPelanggan(form.getCboPelanggan().getSelectedIndex()));
        Warnet.setTglpinjam(form.getTxtTglpinjam().getText());
        Warnet.setTglkembali(form.getTxtTglkembali().getText());
        WarnetDao.save(Warnet);
        
        ProsesWarnet = new ProsesWarnet();
        ProsesWarnet.setDikembalikan("");
        ProsesWarnet.setTerlambat("");
        ProsesWarnet.setDenda();
        ProsesWarnetDao.save(ProsesWarnet);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void saveProsesWarnet(){
        int idx = form.getTblWarnet().getSelectedRow();
        ProsesWarnet.setDikembalikan(form.getTxtDikembalikan().getText());
        ProsesWarnet.setTerlambat(form.getTxtTglkembali().getText());
        ProsesWarnet.setDenda();
        ProsesWarnetDao.update(idx,ProsesWarnet);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void getWarnet(){
        int index = form.getTblWarnet().getSelectedRow();
        Warnet = WarnetDao.getWarnet(index);
        if(Warnet != null){
            form.getCboPelanggan().setSelectedItem(Warnet.getPelanggan().getKodePel());
            form.getTxtTglpinjam().setText(Warnet.getTglpinjam());
            form.getTxtTglkembali().setText(Warnet.getTglkembali());
        }
        ProsesWarnet = ProsesWarnetDao.getProsesWarnet(index);
        if(ProsesWarnet != null){
            form.getTxtDikembalikan().setText(ProsesWarnet.getDikembalikan());
        }
    }
    
    public void updateWarnet(){
        int idx = form.getTblWarnet().getSelectedRow();
        Warnet.setPelanggan(PelangganDao.getPelanggan(form.getCboPelanggan().getSelectedIndex()));
        Warnet.setTglpinjam(form.getTxtTglpinjam().getText());
        Warnet.setTglkembali(form.getTxtTglkembali().getText());
        WarnetDao.update(idx,Warnet);
        
        ProsesWarnet.setDikembalikan(form.getTxtDikembalikan().getText());
        ProsesWarnet.setTerlambat(form.getTxtTglkembali().getText());
        ProsesWarnet.setDenda();
        ProsesWarnetDao.update(idx,ProsesWarnet);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void deleteWarnet(){
        int idx = form.getTblWarnet().getSelectedRow();
        WarnetDao.delete(idx);
        ProsesWarnetDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblWarnet().getModel();
        tabelModel.setRowCount(0);

        // Mengambil data dari dua tabel
        java.util.List<ProsesWarnet> listProsesWarnet = ProsesWarnetDao.getAll();
        java.util.List<Warnet> listWarnet = WarnetDao.getAll();

        // Menambahkan data dari kedua tabel ke dalam satu list
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listWarnet.size(); i++) {
            Warnet Warnet = listWarnet.get(i);
            ProsesWarnet ProsesWarnet = null;
            if (i < listProsesWarnet.size()) {
                ProsesWarnet = listProsesWarnet.get(i);
            }
            Object[] data = {
                Warnet.getPelanggan().getKodePel(),
                Warnet.getPelanggan().getNama(),
                Warnet.getTglpinjam(),
                Warnet.getTglkembali(),
                (ProsesWarnet == null) ? "" : ProsesWarnet.getDikembalikan(),
                (ProsesWarnet == null) ? "" : ProsesWarnet.getTerlambat(),
                (ProsesWarnet == null) ? "" : ProsesWarnet.getDenda()
            };
            dataGabungan.add(data);
        }

        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}

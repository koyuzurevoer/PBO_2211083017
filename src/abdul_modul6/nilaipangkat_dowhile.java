/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul_modul6;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class nilaipangkat_dowhile {
    public static void main(String[] args) {
        double angka = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai: "));
        int pangkat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat: "));
        
        double hasil = 1;
        int i = 0;
        do {
            hasil *= angka;
            i++;
        } while (i < pangkat);
        
        JOptionPane.showMessageDialog(null, angka + " pangkat " + pangkat + " = " + hasil);
    }
}

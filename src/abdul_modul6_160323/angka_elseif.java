/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul_modul6_160323;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class angka_elseif {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Masukkan sebuah angka antara 1-10:");
        int angka = Integer.parseInt(input);
        
        if (angka == 1) {
            JOptionPane.showMessageDialog(null, "Satu");
        } else if (angka == 2) {
            JOptionPane.showMessageDialog(null, "Dua");
        } else if (angka == 3) {
            JOptionPane.showMessageDialog(null, "Tiga");
        } else if (angka == 4) {
            JOptionPane.showMessageDialog(null, "Empat");
        } else if (angka == 5) {
            JOptionPane.showMessageDialog(null, "Lima");
        } else if (angka == 6) {
            JOptionPane.showMessageDialog(null, "Enam");
        } else if (angka == 7) {
            JOptionPane.showMessageDialog(null, "Tujuh");
        } else if (angka == 8) {
            JOptionPane.showMessageDialog(null, "Delapan");
        } else if (angka == 9) {
            JOptionPane.showMessageDialog(null, "Sembilan");
        } else if (angka == 10) {
            JOptionPane.showMessageDialog(null, "Sepuluh");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Number");
        }
    }
}

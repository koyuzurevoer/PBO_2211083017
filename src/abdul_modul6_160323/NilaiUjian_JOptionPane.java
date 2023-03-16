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

public class NilaiUjian_JOptionPane {
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
        double nilai1 = Double.parseDouble(input1);
        
        String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
        double nilai2 = Double.parseDouble(input2);
        
        String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");
        double nilai3 = Double.parseDouble(input3);
        
        double RataRata = (nilai1 + nilai2 + nilai3) / 3;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai: " + RataRata);
        
        if (RataRata >= 60) {
            JOptionPane.showMessageDialog(null, ":)");
        } else {
            JOptionPane.showMessageDialog(null, ":(");
        }
    }
}

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

public class angka_switchcase {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog(null, "Masukkan sebuah angka antara 1-10:");
        int angka = Integer.parseInt(input);
        
        switch (angka) {
            case 1:
                JOptionPane.showMessageDialog(null, "Satu");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Dua");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tiga");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Empat");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Lima");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Enam");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Tujuh");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Delapan");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Sembilan");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Sepuluh");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid number");
                break;
        }
    }
}

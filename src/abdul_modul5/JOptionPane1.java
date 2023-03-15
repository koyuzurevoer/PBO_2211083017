/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul_modul5;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class JOptionPane1 {
    public static void main(String[] args) {
        String kata1 = JOptionPane.showInputDialog("Masukan Kata Pertama:");
        String kata2 = JOptionPane.showInputDialog("Masukan Kata Kedua:");
        String kata3 = JOptionPane.showInputDialog("Masukan Kata Ketiga:");

        JOptionPane.showMessageDialog(null, kata1 + " " + kata2 + " " + kata3);
    }
}


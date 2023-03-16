/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul160323;

/**
 *
 * @author Bedul
 */
 import javax.swing.JOptionPane;

public class ContohJOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukan Nama Anda:");

        JOptionPane.showMessageDialog(null, "Hallo " + nama);
    }
}

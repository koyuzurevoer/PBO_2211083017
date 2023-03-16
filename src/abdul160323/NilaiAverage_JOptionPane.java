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

public class NilaiAverage_JOptionPane {
    public static void main(String[] args) {
        int val1, val2, val3, average;

        val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai pertama: "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai kedua: "));
        val3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai ketiga: "));

        average = (val1 + val2 + val3) / 3;

        JOptionPane.showMessageDialog(null, "Rata-rata: " + average);
    }
}

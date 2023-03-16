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

public class NilaiTerbesarJOptionPane {
    public static void main(String[] args) {
        int val1, val2, val3;
        String max1, max2, max3;

        val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai pertama: "));
        val2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai kedua: "));
        val3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai ketiga: "));

        max1 = (val1 > val2 && val1 > val3) ? "merupakan yang terbesar" : "bukan yang terbesar";
        max2 = (val2 > val1 && val2 > val3) ? "merupakan yang terbesar" : "bukan yang terbesar";
        max3 = (val3 > val1 && val3 > val2) ? "merupakan yang terbesar" : "bukan yang terbesar";

        JOptionPane.showMessageDialog(null, "number 1 = " + val1 + " " + max1 + "\n" +
                                            "number 2 = " + val2 + " " + max2 + "\n" +
                                            "number 3 = " + val3 + " " + max3);
    }
}


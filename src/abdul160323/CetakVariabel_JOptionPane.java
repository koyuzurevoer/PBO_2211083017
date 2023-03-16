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

public class CetakVariabel_JOptionPane {
    public static void main(String[] args) {
        int number;
        char letter;
        boolean result;
        String str;

        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan sebuah angka: "));
        
        String letterInput = JOptionPane.showInputDialog(null, "Masukkan sebuah huruf: ");
        letter = letterInput.charAt(0);
        
        result = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Masukkan sebuah nilai boolean (true atau false): "));
        
        str = JOptionPane.showInputDialog(null, "Masukkan sebuah string: ");

        JOptionPane.showMessageDialog(null, "Angka: " + number);
        JOptionPane.showMessageDialog(null, "Huruf: " + letter);
        JOptionPane.showMessageDialog(null, "Nilai boolean: " + result);
        JOptionPane.showMessageDialog(null, "String: " + str);
    }
}



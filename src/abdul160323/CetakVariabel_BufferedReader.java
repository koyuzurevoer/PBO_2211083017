/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul160323;

/**
 *
 * @author Bedul
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CetakVariabel_BufferedReader {
    public static void main(String[] args) throws IOException {
        int number;
        char letter;
        boolean result;
        String str;

        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan sebuah angka: ");
        number = Integer.parseInt(masukan.readLine());
        
        System.out.print("Masukkan sebuah huruf: ");
        letter = (char) masukan.read();
        masukan.readLine();
        
        System.out.print("Masukkan sebuah nilai boolean (true atau false): ");
        result = Boolean.parseBoolean(masukan.readLine());
        
        System.out.print("Masukkan sebuah string: ");
        str = masukan.readLine();

        System.out.println(number);
        System.out.println(letter);
        System.out.println(result);
        System.out.println(str);
    }
}


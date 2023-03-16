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

public class NilaiTerbesar_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan nilai pertama: ");
        int val1 = Integer.parseInt(masukan.readLine());
        System.out.print("Masukkan nilai kedua: ");
        int val2 = Integer.parseInt(masukan.readLine());
        System.out.print("Masukkan nilai ketiga: ");
        int val3 = Integer.parseInt(masukan.readLine());

        String max1,max2,max3;

        max1 = (val1>val2&&val1>val3)?"merupakan yang terbesar":"bukan yang terbesar";
        max2 = (val2>val1&&val2>val3)?"merupakan yang terbesar":"bukan yang terbesar";
        max3 = (val3>val1&&val3>val2)?"merupakan yang terbesar":"bukan yang terbesar";
        System.out.println("number 1 = "+val1+" "+max1);
        System.out.println("number 2 = "+val2+" "+max2);
        System.out.println("number 3 = "+val3+" "+max3);
    }
}

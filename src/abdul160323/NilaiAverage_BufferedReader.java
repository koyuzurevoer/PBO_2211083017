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

public class NilaiAverage_BufferedReader {
    public static void main(String[] args) throws IOException {
        int val1, val2, val3, average;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai pertama: ");
        val1 = Integer.parseInt(br.readLine());

        System.out.print("Masukkan nilai kedua: ");
        val2 = Integer.parseInt(br.readLine());

        System.out.print("Masukkan nilai ketiga: ");
        val3 = Integer.parseInt(br.readLine());

        average = (val1 + val2 + val3) / 3;
        System.out.println("Rata-rata: " + average);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul_modul6_160323;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NilaiUjian_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai ujian 1: ");
        double nilai1 = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai ujian 2: ");
        double nilai2 = Double.parseDouble(input.readLine());

        System.out.print("Masukkan nilai ujian 3: ");
        double nilai3 = Double.parseDouble(input.readLine());

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.print("Rata-rata nilai ujian adalah " + rataRata);
        if (rataRata >= 60) {
            System.out.println(" :)");
        } else {
            System.out.println(" :(");
        }
    }
}

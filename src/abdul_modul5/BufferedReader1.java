/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul_modul5;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan Kata Pertama: ");
        String kata1 = input.readLine();

        System.out.print("Masukan Kata Kedua: ");
        String kata2 = input.readLine();

        System.out.print("Masukan Kata Ketiga: ");
        String kata3 = input.readLine();

        System.out.println(kata1 + " " + kata2 + " " + kata3);
    }
}

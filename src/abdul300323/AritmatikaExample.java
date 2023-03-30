/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul300323;

/**
 *
 * @author LABP1KOMP
 */
import abdul300323.Aritmatika;

public class AritmatikaExample {
    public static void main( String[] args ){
        int jumlah1 = Aritmatika.jumlah(1, 4);
        boolean cekganjil = Aritmatika.CekGanjil(jumlah1);
        System.out.println("jumlah : " + jumlah1);
        System.out.println("Ganjil? : " + cekganjil);
        System.out.print("n bilangan ganjil pertama : ");
        int[] ambilGanjil = Aritmatika.ambilGanjil(jumlah1);
                for ( int i = 0; i < ambilGanjil.length; i ++){
                    int bilanganGanjil = ambilGanjil[i];
                     System.out.print(bilanganGanjil + " ");
                }
        
    }
}

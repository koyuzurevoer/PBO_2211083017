/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul300323;


/**
 *
 * @author LABP1KOMP
 */
class Aritmatika {
        public static int jumlah(int a, int b){
            return a+b;
        }
        
        public static boolean CekGanjil(int a){
            if (a % 2 !=0){
                return true;
            }
            else{
                return false;
            }
            
        }
        
        public static int[] ambilGanjil(int a){
            int[] ganjil = new int[a];
            int bilangan = 1;
            for (int i = 0; i < a; i++){
                ganjil[i] = bilangan;
                bilangan += 2;
            }
            return ganjil;
        }
}



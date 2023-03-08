/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul070323;

/**
 *
 * @author ASUS
 */
public class NilaiTerbesar {
    public static void main (String[] args ){
        int val1 = 10;
        int val2 = 23;
        int val3 = 5;
        String max1,max2,max3;
        
        max1 = (val1>val2&&val1>val3)?"merupakan yang terbesar":"bukan yang terbesar";
        max2 = (val2>val1&&val2>val3)?"merupakan yang terbesar":"bukan yang terbesar";
        max3 = (val3>val1&&val3>val2)?"merupakan yang terbesar":"bukan yang terbesar";
        System.out.println("number 1 = "+val1+" "+max1);
        System.out.println("number 2 = "+val2+" "+max2);
        System.out.println("number 3 = "+val3+" "+max3);
}
}


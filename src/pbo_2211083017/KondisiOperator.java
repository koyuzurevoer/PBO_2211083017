/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2211083017;

/**
 *
 * @author Bedul
 */
public class KondisiOperator {
     public static void main (String[] args ){
         String status = "";
         int grade = 80;
         
         status = (grade>=60)?"Passed":"Fail";
         System.out.println(status);
     }
}

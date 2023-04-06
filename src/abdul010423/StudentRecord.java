/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdul010423;

/**
 *
 * @author LABP1KOMP
 */
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private char letterGrade;

    private static int StudentCount;//classvariable
    
    public StudentRecord(){ 
        StudentCount++;
} 
    
    public StudentRecord(String temp){ 
        this.name = temp;
         StudentCount++;
    } 
    public StudentRecord(String name, String address){ 
        this.name = name; 
        this.address = address;
         StudentCount++;
    } 
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
        mathGrade = mGrade; 
        englishGrade = eGrade; 
        scienceGrade = sGrade; 
        StudentCount++;
    } 

    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade=scienceGrade;
    }
    
    public double getAvarage(){
        average = (mathGrade + englishGrade + scienceGrade) /3;
        return average;
    }
    
     public char getLetterGrade(){
        double average = getAvarage();
        if(average >= 80){
            letterGrade = 'A';
        } else if (average >= 65){
            letterGrade = 'B';
        } else if (average >= 55){
            letterGrade = 'C';
        } else if (average >= 40){
            letterGrade = 'D';
        } else {
            letterGrade = 'E';
        }
        return letterGrade;
    }
     
    public static int getStudentCount(){
        return StudentCount;
    }
    
    public void print( String temp ){ 
        System.out.println("Name        :" + name); 
        System.out.println("Address     :" + address); 
        System.out.println("Age         :" + age); 
    } 
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("\nName:" + name); 
        System.out.println("Math Grade:" + mGrade); 
        System.out.println("English Grade:" + eGrade); 
        System.out.println("Science Grade:" + sGrade); 
    }
    
}
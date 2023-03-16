/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_070323;

/**
 *
 * @author HP
 */
public class KondisiOperator {
    public static void main(String[] args) {
        String status = "";
        int grade = 90;
        
        //mendapatkan status pelajar
        status = (grade >= 60)? "Passed" : "Fail";
        
        System.out.println(status);
    } 
}

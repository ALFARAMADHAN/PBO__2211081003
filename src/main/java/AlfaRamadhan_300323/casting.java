/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_300323;

/**
 *
 * @author HP
 */
public class casting {
     public static void main(String[] args) {
        char valChar = 'a'; 
        int valInt = valChar; 
        double valDouble = 10.12;//men-convert valDouble ke tipe int 
         
        double x = 50; 
        int y = 2; 
        int result = (int)(x/y); //hasil typecast operasi ke int 
        
        System.out.print(result);
    }
}


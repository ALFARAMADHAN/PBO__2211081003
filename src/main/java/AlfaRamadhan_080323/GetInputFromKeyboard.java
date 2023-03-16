/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class GetInputFromKeyboard {
    public static void main(String[] args){
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    String nama = "";
    int nilai = 0;
    try {
         System.out.println("Silahkan Masukan Nama Anda : ");
         nama = dataIn.readLine();
         System.out.println("Nilai : ");
         nilai = Integer.parseInt(dataIn.readLine());
    }catch(IOException e) {
        System.out.println("Error!");
    }
    System.out.println("Hi "+nama+" !");
    System.out.println("Nilai : "+nilai);
    }
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_300323;

/**
 *
 * @author HP
 */
public class Aritmatikaa {
     public int tambah(int a, int b) {
        return a + b;
    }
    
    public boolean cekGanjil(int a) {
        return (a % 2 != 0);
    }
    
    public static int [] getGanjil(int n){
        int [] ganjil = new int[n];
        int j =0;
            
        for(int i=1;j<n;i+=2)
        {
            ganjil[j]=i;
            j++;
        }
            return ganjil;
    }
    
    public static int [] getPrima(int p){
        int [] prima = new int[p];
        int num = 2;
        int count = 0;
        
        while (count <p){
            if (isPrima(num)) {
                prima[count] = num;
                count++;
            }
            num++;
        }
        return prima;
    }
    
        public static boolean isPrima(int num){
            if (num <= 1){
                return false;
            }
            
           for (int i = 2; i <= Math.sqrt(num); i++){
               if (num % i == 0) {
                   return false;
               }
           }
           return true;
        }     
}

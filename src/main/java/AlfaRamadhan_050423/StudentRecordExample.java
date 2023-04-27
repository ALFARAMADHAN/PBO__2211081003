/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_050423;

/**
 *
 * @author HP
 */
public class StudentRecordExample {
     public static void main (String[] args) {
        StudentRecord annaRecord = new StudentRecord(); 
        StudentRecord crisRecord = new StudentRecord(); 
        StudentRecord aliRecord = new StudentRecord(); 
        
        //mengisi data anna
        annaRecord.setName("anna"); 
      annaRecord.setAddress("London");
        annaRecord.setAge(20);
        
        //mengisi data cris
        crisRecord.setName("cris"); 
        crisRecord.setAddress("NewYork");
       crisRecord.setAge(10);
        
        //mengisi data ali
        aliRecord.setName("Ali"); 
        aliRecord.setAddress("Paris");
        aliRecord.setAge(70);
        
        //menampilkan data anna
        System.out.println("Nama : " +annaRecord.getName());
        System.out.println("Alamat : " +annaRecord.getAddress());
        System.out.println("Umur : " +annaRecord.getAge());
        
        //menampilkan data cris
        System.out.println("\t");
        System.out.println("Nama : " +crisRecord.getName());
        System.out.println("Alamat : " +crisRecord.getAddress());
        System.out.println("Umur : " +crisRecord.getAge());
        
        //menampilkan data dan nilai ali
        System.out.println("\t");
        aliRecord.print("");
        aliRecord.print(60,70,80);
         
        //Menampilkan jumlah siswa 
        System.out.println("Count : "+StudentRecord.getStudentCount()); 
    
    }
}

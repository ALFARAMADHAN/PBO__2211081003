/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_130423;

/**
 *
 * @author HP
 */
public class LineExample {
    
    public static void main (String [] args ){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(4,6);
        boolean hasilDbl = myDouble.isGreater(6.4,2.2);
        System.out.println("Hasil Integer "+ hasilInt);
        System.out.println("Hasil Double "+ hasilDbl);
        
        Relation myLine = new Line();
        Line Line1 = new Line(2, 5, 2, 7);
        Line Line2 = new Line(2, 5, 2, 2);
        boolean LineA_LineB = myLine.isGreater(Line1,Line2);
        System.out.println("Line A > Line B "+LineA_LineB);
    } 
}
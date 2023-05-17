/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_ALFA.model;

/**
 *
 * @author HP
 */
public class Pesanan {
    private String kodepesanan;
    private String namapemesan;
    private String tglpesan;
    private String harga ;
    private String ongkoskirim;
    private String diskon;
    
    public Pesanan(){}
    
    public Pesanan(String kodepesanan, String namapemesan, String tglpesan, String harga, String ongkoskirim, String diskon){
        this.kodepesanan = kodepesanan;
        this.namapemesan = namapemesan;
        this.tglpesan = tglpesan;
        this.harga = harga;
        this.ongkoskirim = ongkoskirim; 
        this.diskon = diskon;
    }
    
    public void setkodepesanan(String kodepesanan){
        this.kodepesanan = kodepesanan;
    }
    public void setnamapemesan(String namapemesan){
        this.namapemesan = namapemesan;
    }
    public void settglpesan(String tglpesan){
        this.tglpesan = tglpesan;
    }
    public void setharga(String harga){
        this.harga = harga;
    }
    public void setongkoskirim(String ongkoskirim){
        this.ongkoskirim = ongkoskirim;
    }
    public void setdiskon(String diskon){
        this.diskon = diskon;
    }
    public String getkodepesanan(){
        return kodepesanan;
    }
    public String getnamapemesan(){
        return namapemesan;
    }
    public String gettglpesan(){
        return tglpesan;
    }
    public String getharga(){
        return harga;
    }
    public String getongkoskirim(){
        return ongkoskirim;
    }
    public String getdiskon(){
        return diskon;
    }
    
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_270423.model;

/**
 *
 * @author HP
 */
public class Anggota {
    private String KodeAnggota;
    private String NamaAnggota;
    private String alamat;
    private String JenisKelamin;

    public Anggota(){
    
    }
    public Anggota (String kodeAnggota, String namaAnggota, String alamat, String JenisKelamin){
        this.KodeAnggota = KodeAnggota;
        this.NamaAnggota = NamaAnggota;
        this.alamat = alamat;
        this.JenisKelamin = JenisKelamin;
    }
    
   public String KodeAnggota(){
        return this.KodeAnggota;
    }
    public String getNamaAnggota(){
        return this.NamaAnggota;
    }
    public String getalamat(){
        return this.alamat;
    }
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }
    public void setKodeAnggota(String KodeAnggota){
        this.KodeAnggota = KodeAnggota;
    }
    public void setNamaAnggota(String NamaAnggota){
        this.NamaAnggota= NamaAnggota;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }  
   
}

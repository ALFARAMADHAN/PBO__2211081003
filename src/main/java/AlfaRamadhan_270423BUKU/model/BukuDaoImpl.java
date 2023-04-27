/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlfaRamadhan_270423BUKU.model;
import java.util.*;
/**
 *
 * @author HP
 */
public class BukuDaoImpl implements BukuDao {
   
    
    List<Buku> data = new ArrayList();
    
    public void save(Buku buku){
        data.add(buku);
    }
    public void update(int index,Buku buku){
         data.set(index, buku);
    }
    public void delete(int index){
         data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAllBuku(){
        return data;
    }
} 


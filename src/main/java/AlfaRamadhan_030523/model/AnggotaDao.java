/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlfaRamadhan_030523.model;
import java.util.*;
/**
 *
 * @author HP
 */
public interface AnggotaDao {
    void save(Anggota anggota);
    void update(int index, Anggota anggota);
    void delete (int index);
    Anggota getAnggota(int index);
    public List<Anggota> getAllAnggota();
}
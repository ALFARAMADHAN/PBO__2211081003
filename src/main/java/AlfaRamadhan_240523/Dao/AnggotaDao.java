/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlfaRamadhan_240523.Dao;
import AlfaRamadhan_240523.model.Anggota;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author HP
 */
public interface AnggotaDao {
void insert(Anggota anggota) throws SQLException;
void update(int index,Anggota anggota);
void delete (int index);
Anggota getAnggota(int index);
List<Anggota> getAllAnggota();
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_ALFA.model;
import java.util.List;
/**
 *
 * @author HP
 */
public interface PesananDao {
       void save(Pesanan pesanan);
    void update(int index, Pesanan pesanan);
    void delete(int index);
    Pesanan getPesanan(int index);
    List<Pesanan> getAll();
}


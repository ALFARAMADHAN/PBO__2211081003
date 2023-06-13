/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_040523BUKU.controller;
import AlfaRamadhan_040523BUKU.view.*;
import AlfaRamadhan_040523BUKU.model.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author HP
 */
public class BukuController {
    private FormBuku formBuku ;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formBuku.gettxtKodeBuku().setText("");
        formBuku.gettxtJudul().setText("");
        formBuku.gettxtPenerbit().setText("");
        formBuku.gettxtPengarang().setText("");
        formBuku.gettxtTahun().setText("");
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.gettxtKodeBuku().getText());
        buku.setJudul(formBuku.gettxtJudul().getText());
        buku.setPenerbit(formBuku.gettxtPenerbit().getText());
        buku.setPengarang(formBuku.gettxtPengarang().getText());
        buku.setTahun(formBuku.gettxtTahun().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku,"Insert Ok"); 
    }
    public void updateBuku(){
        int index = formBuku.gettblBuku().getSelectedRow();
       buku.setKodeBuku(formBuku.gettxtKodeBuku().getText());
        buku.setJudul(formBuku.gettxtJudul().getText());
        buku.setPenerbit(formBuku.gettxtPenerbit().getText());
        buku.setPengarang(formBuku.gettxtPengarang().getText());
        buku.setTahun(formBuku.gettxtTahun().getText());
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku,"Update Ok"); 
    }
    public void delete(){
            int index = formBuku.gettblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku,"Delete Ok"); 
    }
    public void getBuku(){
        int index = formBuku.gettblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if (buku!=null){
             formBuku.gettxtKodeBuku().setText(buku.getKodeBuku());
             formBuku.gettxtJudul().setText(buku.getJudul());
             formBuku.gettxtPenerbit().setText(buku.getPenerbit());
             formBuku.gettxtPengarang().setText(buku.getPengarang());
             formBuku.gettxtTahun().setText(buku.getTahun());
        }
    }
    public void tampil(){
        DefaultTableModel tabelmodel =
                (DefaultTableModel) formBuku.gettblBuku().getModel();
        tabelmodel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku1 : list){
            Object row[] = {
                buku1.getKodeBuku(),
                buku1.getJudul(),
                buku1.getPenerbit(),
                buku1.getPengarang(),
                buku1.getTahun()
            };
            tabelmodel.addRow(row);
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlfaRamadhan_240523.controller;

/**
 *
 * @author HP
 */
public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    
    public AnggotaController(FormAnggota view){
        this.view = view;
        try{
            dao = new AnggotaDaoImpl(DatabaseHelper)
        }
    }
}

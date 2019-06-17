/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dannp
 */
public class BuahTableModel extends AbstractTableModel{
    
    //id, nama, berat, harga, jenis, kadaluarsa
    private List<Buah> listBuah = new ArrayList();
    
    private final String Header[] = {"Kode Produk", "Nama", "Berat", "Harga", "Jenis", "Kadaluarsa"};
    
    public BuahTableModel(List<Buah> listBuah) {
        this.listBuah= listBuah;
    }

    @Override
    public int getRowCount() {
        return listBuah.size();
    }

    @Override
    public int getColumnCount() {
        return Header.length;
    }
    
    @Override
    public  String getColumnName(int index){
        return Header[index];
    }
    
    //id, nama, berat, harga, jenis, kadaluarsa
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buah buah = listBuah.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return buah.getId();
            case 1:
                return buah.getNama();
            case 2:
                return buah.getBerat();
            case 3:
                return buah.getHarga();
            case 4:
                return buah.getJenis();
            case 5:
                return buah.getKadaluarsa();
            default:
                return null;
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.controller;


import static com.kelompokbuah.app.App.getBuahService;
import com.kelompokbuah.app.App;
import com.kelompokbuah.model.Buah;
import com.kelompokbuah.model.BuahTableModel;
import com.kelompokbuah.view.MainView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dannp
 */
public class BuahController {
    
    private final MainView mainView;
    private List<Buah> listBuah;
    private BuahTableModel buahTableModel;
//    private final WarungDao warungDao = HibernateUtil.getWarungDao();
    
    public BuahController (MainView mainView) {
        this.mainView = mainView;
    }
    
    public void getAllData() {
       listBuah = getBuahService().getList(); //ambil all data from db
       buahTableModel = new BuahTableModel(listBuah); // convert jadi table model
       this.mainView.getTblBuah().setModel(buahTableModel); //tampil di view
    }
    //id, nama, berat, harga, jenis, kadaluarsa
    public void saveBuah() {
        Buah buah = new Buah();
        buah.setId(this.mainView.getTxtId().getText());
        buah.setNama(this.mainView.getTxtNama().getText());
        buah.setBerat(this.mainView.getTxtBerat().getText());
        buah.setHarga(this.mainView.getTxtHarga().getText());
        buah.setJenis(this.mainView.getTxtJenis().getText());
        buah.setKadaluarsa(this.mainView.getTxtKadaluarsa().getText());
        
        try {
            getBuahService().save(buah);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Micin",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Menyimpan Data Micin",
                    "Error", JOptionPane.ERROR_MESSAGE);
            clear();
        }
    }
    
    public void updateBuah() {
        Buah buah = new Buah();
        buah.setId(this.mainView.getTxtId().getText());
        buah.setNama(this.mainView.getTxtNama().getText());
        buah.setBerat(this.mainView.getTxtBerat().getText());
        buah.setHarga(this.mainView.getTxtHarga().getText());
        buah.setJenis(this.mainView.getTxtJenis().getText());
        buah.setKadaluarsa(this.mainView.getTxtKadaluarsa().getText());
        
        try {
            getBuahService().update(buah);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data Micin",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Menyimpan Data Micin",
                    "Error", JOptionPane.ERROR_MESSAGE);
            clear();
        }
    }
    
    public void deleteBuah() {
        if (this.mainView.getTxtId().getText() == null){
            JOptionPane.showMessageDialog(null, "Data Belum Dipilih", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            Buah buah = new Buah();
            buah.setId(this.mainView.getTxtId().getText());
            
            int option = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data?",
                    "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (option == JOptionPane.YES_OPTION){
                try {
            getBuahService().delete(buah);
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data Micin", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Menyimpan Data Buku", "Error",
                    JOptionPane.ERROR_MESSAGE);
            clear();
                }
            }
        }
    }
    
    public void clear() {
        this.mainView.getTxtId().setText("");
        this.mainView.getTxtNama().setText("");
        this.mainView.getTxtJenis().setText("");
        this.mainView.getTxtBerat().setText("");
        this.mainView.getTxtHarga().setText("");
        this.mainView.getTxtKadaluarsa().setText("");
    }
    
    //id, nama, berat, harga, jenis, kadaluarsa
    
    public void getData() {
        int rowIndex = this.mainView.getTblBuah().getSelectedRow();
        this.mainView.getTxtId().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 0)));
        this.mainView.getTxtNama().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 1)));
        this.mainView.getTxtBerat().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 2)));
        this.mainView.getTxtHarga().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 3)));
        this.mainView.getTxtJenis().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 4)));
        this.mainView.getTxtKadaluarsa().setText(String.valueOf(this.mainView.getTblBuah().getValueAt(rowIndex, 5)));
    }
    
}

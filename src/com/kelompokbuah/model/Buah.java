/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dannp
 */

@Entity
@Table(name = "tabel_buah")
public class Buah {
    
    @Id
    @Column(name = "id", length = 8)
    private String id;
    
    @Column(name = "nama", length = 20)
    private String nama;
    
    @Column(name = "berat", length = 20)
    private String berat;
    
    @Column(name = "harga", length = 20)
    private String harga;
    
    @Column(name = "jenis", length = 20)
    private String jenis;
    
    @Column(name = "kadaluarsa")
    private String kadaluarsa;

    public Buah() {
    }

    
    public Buah(String id, String nama, String berat, String harga, String jenis, String kadaluarsa) {
        this.id = id;
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jenis = jenis;
        this.kadaluarsa = kadaluarsa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
    
    
    
    
}

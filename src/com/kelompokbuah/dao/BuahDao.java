/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.dao;

import com.kelompokbuah.model.Buah;
import java.util.List;

/**
 *
 * @author dannp
 */
public interface BuahDao {
    
    public void save(Buah buah);
    public void update(Buah buah);
    public void delete(Buah buah);
    public List<Buah> getList();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.service;

import com.kelompokbuah.dao.BuahDao;
import com.kelompokbuah.model.Buah;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dannp
 */

@Service("BuahService")
@Transactional(readOnly = true)
public class BuahServiceImpl implements BuahService{
    
    @Autowired
    private BuahDao buahDao;

    @Transactional
    @Override
    public void save(Buah buah) {
        buahDao.save(buah);
    }

    @Transactional
    @Override
    public void update(Buah buah) {
        buahDao.update(buah);
    }

    @Transactional
    @Override
    public void delete(Buah buah) {
        buahDao.delete(buah);
    }

    @Override
    public List<Buah> getList() {
        return buahDao.getList();
    }
    
    
}

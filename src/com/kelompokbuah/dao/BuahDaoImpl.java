/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.dao;

import com.kelompokbuah.model.Buah;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author dannp
 */

@Repository
public class BuahDaoImpl implements BuahDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
//    public WarungDaoImpl(SessionFactory sessionFactory){
//            this.sessionFactory = sessionFactory;
//    }

    @Override
    public void save(Buah buah) {
        sessionFactory.getCurrentSession().save(buah);
//        
    }

    @Override
    public void update(Buah buah) {
        sessionFactory.getCurrentSession().update(buah);
//       
    }

    @Override
    public void delete(Buah buah) {
        sessionFactory.getCurrentSession().delete(buah);
//        
    }

    @Override
    public List<Buah> getList() {
        return sessionFactory.getCurrentSession().createCriteria(Buah.class).list();
//        
    }

//   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompokbuah.app;

import com.kelompokbuah.service.BuahService;
import com.kelompokbuah.view.MainView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dannp
 */
public class App {
    
    private static ApplicationContext appcontext;
    
    public static void main(String[] args) {
        appcontext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        new MainView().setVisible(true);
    }
    
    public static BuahService getBuahService() {
        return (BuahService) appcontext.getBean("BuahService");
    }
    
}

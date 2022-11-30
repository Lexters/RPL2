package com.toko.buku.app;

import com.toko.buku.service.TokoBukuService;
import com.toko.buku.view.TokoBukuView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Yoel
 */
public class TokoBukuApp {
    public static ApplicationContext appContext;
    
    public static void main(String[] args){
        appContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        new TokoBukuView().setVisible(true);
    }
    
    public static TokoBukuService getTokoBukuService(){
        return (TokoBukuService)appContext.getBean("TokoBukuService");
    }
    
}
package com.toko.buku.config;

import com.toko.buku.dao.TokoBukuDao;
import com.toko.buku.dao.TokoBukuImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Yoel
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final TokoBukuDao TokoBuku_DAO;
    
    
    static{
        try{
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            TokoBuku_DAO = new TokoBukuImpl(SESSION_FACTORY);
        }catch(Throwable e){
            System.err.println("Initial SessionFactory Creation Failed : " + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
    
    public static TokoBukuDao getTokoBukuDao(){
        return TokoBuku_DAO;
    }
}

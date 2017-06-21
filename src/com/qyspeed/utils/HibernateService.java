package com.qyspeed.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qyspeed.domain.Admin;

public class HibernateService {

	public void  service()
	{
	  //读取配置文件  
    Configuration cfg = new Configuration().configure();  
      
    SessionFactory factory = cfg.buildSessionFactory();  
      
    Session session = null;  
    try{  
        session = factory.openSession();  
        //开启事务  
        session.beginTransaction();  
          
        Admin user = new Admin();  
        user.setUsername("dengjiajun");  
        user.setPassword("123456");  
         
          
        session.save(user);  
        //提交事务  
        session.getTransaction().commit();  
          
    }catch(Exception e){  
        e.printStackTrace();  
        //回滚事务  
        session.getTransaction().rollback();  
    }finally{  
        if(session != null){  
            if(session.isOpen()){  
                //关闭session  
                session.close();  
            }  
        }  
    }  
}  
}

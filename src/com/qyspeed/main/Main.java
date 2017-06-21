package com.qyspeed.main;
import com.qyspeed.test.TestRunnian;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qyspeed.domain.Admin;
import com.qyspeed.test.TestGrade;
public class Main {

	public static void main(String[] args)
	{/*
		TestRunnian r=new TestRunnian();
		r.runnian();
		
		TestGrade point=new TestGrade();
		point.Grade(90.6);
		*/
		  //��ȡ�����ļ�  
        Configuration cfg = new Configuration().configure();  
          
        SessionFactory factory = cfg.buildSessionFactory();  
          
        Session session = null;  
        try{  
            session = factory.openSession();  
            //��������  
            session.beginTransaction();  
              
            Admin user = new Admin();  
            user.setUsername("dengjiajun");  
            user.setPassword("123456");  
             
              
            session.save(user);  
            //�ύ����  
            session.getTransaction().commit();  
              
        }catch(Exception e){  
            e.printStackTrace();  
            //�ع�����  
            session.getTransaction().rollback();  
        }finally{  
            if(session != null){  
                if(session.isOpen()){  
                    //�ر�session  
                    session.close();  
                }  
            }  
        }  
    }  
	}


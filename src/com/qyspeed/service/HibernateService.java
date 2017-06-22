package com.qyspeed.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qyspeed.domain.Admin;

/*
 * Configguration
 * SessionFactory
 * Session
 * Transaction
 * Query
 */
public class HibernateService {

	private static String  CONFIG_FILE_LOCATION="/hibernate.cfg.xml";//配置文件路径
	private static final ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private static Configuration configuration=new Configuration();
	private static org.hibernate.SessionFactory sessionFactory;
	private static String configFile=CONFIG_FILE_LOCATION;
	
	
	public static void  base()
	{
	try{
	//读取配置文件  
    configuration.configure(configFile);
    //创建SessionFactory
    sessionFactory=configuration.buildSessionFactory();
    
	}catch(Exception e)
	{
		System.err.println("创建Session 失败");
	e.printStackTrace();
	}
	
	/**
     * Returns the ThreadLocal Session instance.  Lazy initialize
     * the <code>SessionFactory</code> if needed.
     *
     *  @return Session
     *  @throws HibernateException
     */
	public static Session getSession() throws HibernateException
	{
		Session session=(Session)threadLocal.get();
		if(session==null||!session.isOpen())
		{
			rebulidSessionFactory();
		}
		session=(SessionFactory!=null)?sessionFactory.openSession():null;
		threadLocal.set(session);
	}
     /*
      * Rebulid hibernate session factory
      */
	public static void rebuildSessionFactory()
	{
		try
		{
			configuration.configure(configFile);
			sessionFactory=configuration.buildSessionFactory();
		}catch(Exception e)
		{
			System.err.println("error sessionfactory ~!!");
			e.printStackTrace();
		}
		
		/**
	     *  Close the single hibernate session instance.
	     *
	     *  @throws HibernateException
	     */
	    public static void closeSession() throws HibernateException {
	        Session session = (Session) threadLocal.get();
	        threadLocal.set(null);

	        if (session != null) {
	            session.close();
	        }
	    }

		/**
	     *  return session factory
	     *
	     */
		public static org.hibernate.SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		/**
	     *  return session factory
	     *
	     *	session factory will be rebuilded in the next call
	     */
		public static void setConfigFile(String configFile) {
			HibernateUtil.configFile = configFile;
			sessionFactory = null;
		}

		/**
	     *  return hibernate configuration
	     *
	     */
		public static Configuration getConfiguration() {
			return configuration;
		}
		
	}
	
	}
}

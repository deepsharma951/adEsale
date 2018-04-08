package com.org.abde.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.hibernate.SessionFactory;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.org.abde.config")
@PropertySource(value = { "classpath:db.properties" })
public class HibernateConfig {
	@Autowired
	   private Environment env;
	
	 @Bean
	   public LocalSessionFactoryBean getSessionFactory() {
		 LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		 sessionFactory.setDataSource(getDataSource());
		 sessionFactory.setPackagesToScan(new String [] {"com.org.abde.listing.flipkart.model","com.org.abde.beans"});
		 sessionFactory.setHibernateProperties(hibernateProperties());
		 System.out.println("Session =================================================== "+sessionFactory.toString());
		 return sessionFactory;
		 
	     
	   }
	
	@Bean
	@Autowired
	   public HibernateTransactionManager getTransactionManager(SessionFactory s) {
	      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	      transactionManager.setSessionFactory(s);
	      return transactionManager;
	      
	   }
	 
	
	 @Bean
	   public DataSource getDataSource() {
		 DriverManagerDataSource datasource=new DriverManagerDataSource();
		 datasource.setDriverClassName(env.getProperty("mysql.driver"));
		 datasource.setUrl(env.getProperty("mysql.url"));
		 datasource.setUsername(env.getProperty("mysql.user"));
		 datasource.setPassword(env.getProperty("mysql.password"));
		 
		 System.out.println("Class name =================================================== "+env.getProperty("mysql.driver"));
		 System.out.println("URL ========================================================== "+env.getProperty("mysql.url"));
		 System.out.println("UserName ========================================================== "+env.getProperty("mysql.user"));
		 System.out.println("Password ========================================================== "+env.getProperty("mysql.password"));
		 

		 return datasource;
	     /* props.put("com.mysql.jdbc.Driver", );
	      props.put("jdbc:mysql://localhost:3306/esale", env.getProperty("mysql.url"));
	      props.put("root", );
	      props.put("root", env.getProperty("mysql.password"));*/

	 }
	 
	 @Bean
	   public Properties hibernateProperties() {
		Properties props = new Properties();
		props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		props.put("", env.getProperty("hibernate.hbm2ddl.auto"));
		props.put("hibernate.dialect", env.getProperty("mysql.dialect"));
		return props;
	 }
	 
	 
	 
}

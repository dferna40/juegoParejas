package com.daf.juego.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
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

/**
 * Clase de configuración de hibernate sustituye al archivo de configuracion hibernate.cfg.xml
 * @author David Fernandez Ramirez
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.daf.juego.config" })
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration {

	/**
	 *  Esta es la forma habitual de establecer un Hibernate SessionFactory compartida en un contexto de aplicación de Spring, 
	 *  en el SessionFactory se puede pasar objetos de acceso a datos basados en Hibernate a través de la inyección de dependencia.
	 */
	@Autowired
	private Environment environment;

	/**
	 *  Esta es la forma habitual de compartir en Hibernate el SessionFactory compartida en un contexto de aplicación de Spring, 
	 *  en el SessionFactory se pueden pasar objetos de acceso a datos basados en Hibernate a través de la inyección de dependencias.
	 *  @return sessionFactory
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.daf.juego.dto" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	/**
	 * Establece la configuracion para que Hibernate pueda acceder a la base de datos.
	 * @return dataSource
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dataSource;
	}
	
	/**
	 * Establece la configuracion para que Hibernate pueda acceder a la base de datos.
	 * @return properties
	 */
	private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        return properties;        
    }
	
	/**
	 * Metodo que configura el gestor de transacciones de Hibernate
	 * @param SessionFactory
	 * @return txManager
	 */
	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
     
}

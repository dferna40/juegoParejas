package com.daf.juego.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Clase encargada de configurar el servlet principal Dispatcherservlet
 * @author David Fernandez Ramirez
 *
 */
public class JuegoParejasInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * Indica la clase de configuracion de spring
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { JuegoParejasConfig.class };
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
 
	/**
	 * Indica el mapeo del servlet para el controlador principal (dispatcherservlet)
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}

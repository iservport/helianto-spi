package org.helianto.core.model;

import java.util.Date;
import java.util.Locale;

/**
 * Public entity model.
 * 
 * @author mauriciofernandesdecastro
 */
public interface PublicEntityModel 
	extends ContextModel {
	
	/**
	 * Entity alias.
	 */
	String getAlias();
	
	/**
	 * Locale.
	 */
	Locale getLocale();
	
	/**
	 * Install date.
	 */
	Date getInstallDate();

}

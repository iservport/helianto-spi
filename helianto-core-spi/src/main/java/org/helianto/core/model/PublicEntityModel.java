package org.helianto.core.model;

import java.util.Date;
import java.util.Locale;

/**
 * Public entity model.
 * 
 * @author mauriciofernandesdecastro
 */
public interface PublicEntityModel 
	extends EntityModel {
	
	/**
	 * Locale.
	 */
	Locale getLocale();
	
	/**
	 * Install date.
	 */
	Date getInstallDate();

}

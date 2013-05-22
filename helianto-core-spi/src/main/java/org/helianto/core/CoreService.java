package org.helianto.core;

import org.helianto.core.model.ContextModel;
import org.helianto.core.model.ProvinceModel;
import org.helianto.core.model.PublicEntityModel;

/**
 * Remote service interface to context.
 * 
 * @author mauriciofernandesdecastro
 */
public interface CoreService {

	/**
	 * Find context.
	 * 
	 * @param contextName
	 */
	ContextModel findContext(String contextName);
	
	/**
	 * Find public entity.
	 * 
	 * @param contextName
	 * @param entityAlias
	 */
	PublicEntityModel findEntity(String contextName, String entityAlias);
	
	/**
	 * Find province.
	 * 
	 * @param contextName
	 * @param provinceCode
	 */
	ProvinceModel findProvince(String contextName, String provinceCode);
	
}

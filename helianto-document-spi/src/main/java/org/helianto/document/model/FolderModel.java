package org.helianto.document.model;

import org.helianto.core.model.EntityModel;


/**
 * Folder model.
 * 
 * @author mauriciofernandesdecastro
 */
public interface FolderModel 
	extends EntityModel {
	
	/**
	 * Folder code.
	 */
    String getFolderCode();

    /**
     * Folder name.
     */
	String getFolderName();
	
	/**
	 * Current path.
	 */
	String getCurrentPath();
	
}

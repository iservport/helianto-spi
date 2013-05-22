package org.helianto.document.model;


/**
 * Folder model.
 * 
 * @author mauriciofernandesdecastro
 */
public interface FolderModel {
	
	/**
	 * Context key.
	 */
	String getContextName();
	
	/**
	 * Entity key.
	 */
	String getAlias();

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

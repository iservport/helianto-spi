package org.helianto.document.model.internal;

import java.io.Serializable;

import org.helianto.core.model.internal.EntityModelAdapter;
import org.helianto.document.model.FolderModel;

/**
 * Adaptador entre FoldeModel e DocumentFolder.
 * 
 * @author mauriciofernandesdecastro
 */
public class FolderModelAdapter 
	extends EntityModelAdapter
	implements FolderModel, Serializable {

	private static final long serialVersionUID = 1L;
	private String currentPath;
	private String folderCode;
	private String folderName;

	@Override
	public String getCurrentPath() {
		return currentPath;
	}

	@Override
	public String getFolderCode() {
		return folderCode;
	}

	@Override
	public String getFolderName() {
		return folderName;
	}

}
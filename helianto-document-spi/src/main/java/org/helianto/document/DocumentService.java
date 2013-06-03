package org.helianto.document;

import java.util.List;

import org.helianto.document.model.FolderModel;

/**
 * Interface remota para serviços relacionados a documentos.
 * 
 * @author mauriciofernandesdecastro
 */
public interface DocumentService {
	
	/**
	 * Find folder.
	 * 
	 * @param entityAlias
	 * @param folderCode
	 */
	FolderModel findFolder(String entityAlias, String folderCode);
	
	/**
	 * Find folder codes list.
	 * 
	 * @param entityAlias
	 */
	List<String> findFolder(String entityAlias);
	
	/**
	 * Create folder.
	 * 
	 * @param folder
	 * @param auth
	 */
	int createFolder(FolderModel folder, String auth);
	
}

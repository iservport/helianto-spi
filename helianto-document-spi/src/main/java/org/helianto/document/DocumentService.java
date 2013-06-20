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
	 * @param accessToken
	 * @param folderCode
	 */
	FolderModel findFolder(String accessToken, String folderCode);
	
	/**
	 * Find folder codes list.
	 * 
	 * @param accessToken
	 */
	List<String> findFolder(String accessToken);
	
	/**
	 * Create folder.
	 * 
	 * @param accessToken
	 * @param folder
	 */
	int createFolder(String accessToken, FolderModel folder);
	
}

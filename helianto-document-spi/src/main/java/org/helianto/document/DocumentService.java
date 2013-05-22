package org.helianto.document;

import org.helianto.document.model.FolderModel;
import org.helianto.document.model.ProcessDocumentModel;

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
	 * Create folder.
	 * 
	 * @param folder
	 * @param auth
	 */
	int createFolder(FolderModel folder, String auth);
	
	/**
	 * Find process document.
	 * 
	 * @param entityAlias
	 * @param docCode
	 */
	ProcessDocumentModel findProcessDocument(String entityAlias, String docCode);
	
	/**
	 * Create process document.
	 * 
	 * @param processDocument
	 * @param auth
	 */
	int createProcessDocument(ProcessDocumentModel processDocument, String auth);
	
}

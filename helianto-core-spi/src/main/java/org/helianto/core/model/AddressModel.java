package org.helianto.core.model;

/**
 * Address model.
 * 
 * @author mauriciofernandesdecastro
 */
public interface AddressModel 
	extends ContextModel {

    /**
     * Main address line.
     */
    String getAddress1();
    
    /**
     * Address classifier, as St, Av., etc.
     */
    String getAddressClassifier();

    /**
     * Address number.
     */
    String getAddressNumber();
    
    /**
     * Address detail, as home or office nr, etc.
     */
	String getAddressDetail();
	
    /**
     * Address2, or county.
     */
    String getAddress2();

    /**
     * Postal code.
     */
    String getPostalCode();

    /**
     * Optional address line.
     */
    String getAddress3();
    
    /**
     * Post office box.
     */
    String getPostOfficeBox();
    
    /**
     * Province code.
     */
    String getProvinceCode();
    
}

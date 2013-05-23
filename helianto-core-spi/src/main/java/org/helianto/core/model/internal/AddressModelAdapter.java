package org.helianto.core.model.internal;

import java.io.Serializable;

import org.helianto.core.model.AddressModel;

/**
 * Address model adapter.
 * 
 * @author mauriciofernandesdecastro
 */
public class AddressModelAdapter 
	extends ContextModelAdapter
	implements AddressModel, Serializable {

	private static final long serialVersionUID = 1L;
	private String address1;


	@Override
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Override
	public String getAddressClassifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddressNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddressDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddress2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPostalCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAddress3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPostOfficeBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProvinceCode() {
		// TODO Auto-generated method stub
		return null;
	}

}

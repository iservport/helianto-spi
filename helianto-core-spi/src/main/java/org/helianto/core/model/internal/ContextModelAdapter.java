package org.helianto.core.model.internal;

import java.io.Serializable;

import org.helianto.core.model.ContextModel;

/**
 * Context model adapter.
 * 
 * @author mauriciofernandesdecastro
 */
public class ContextModelAdapter 
	implements ContextModel, Serializable {

	private static final long serialVersionUID = 1L;
	private String contextName;

	@Override
	public String getContextName() {
		return contextName;
	}
	public void setContextName(String contextName) {
		this.contextName = contextName;
	}

}

package com.sample.common.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.common.IManager;

@Component
@Qualifier("Prod")
public class ProdManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "Prod-Manager";
	}

}

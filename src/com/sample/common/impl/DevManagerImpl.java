package com.sample.common.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.common.IManager;

@Component
@Profile("Ora")
@Qualifier("Dev")
public class DevManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "Dev-Manager";
	}

}

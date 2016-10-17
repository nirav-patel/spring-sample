package com.sample.common.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.common.IManager;

@Component
@Profile("Ora")
@Qualifier("QA")
public class QAManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "QA-Manager";
	}

}

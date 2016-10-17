package com.sample.common.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.common.IManager;
import com.sample.util.TestCondition;

@Component
@Qualifier("QA")
@Conditional(TestCondition.class)
public class PreProdManagerImpl implements IManager {

	@Override
	public String getManagerInfo() {
		return "Pre-Prod-QA-Manager";
	}

}

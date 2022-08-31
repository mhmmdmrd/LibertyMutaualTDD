package com.libertymutual.qa.test;

import com.libertymutual.qa.base.BaseClass;

public class BasicAutoTest extends BaseClass{

	
	public void getAutoBasicsQoute() {
		homePage.homepageSteps1("11208");
		basicsAutoPage.basicAutoSteps(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	}
}

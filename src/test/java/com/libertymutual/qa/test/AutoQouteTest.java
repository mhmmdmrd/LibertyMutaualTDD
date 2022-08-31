package com.libertymutual.qa.test;

import org.testng.annotations.Test;

import com.libertymutual.qa.base.BaseClass;

public class AutoQouteTest extends BaseClass {
	

	@Test(enabled = true)
	public void getAAutoQuote() {
		homePage.homepageSteps1("11208");
	}
	
}

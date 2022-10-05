package com.libertymutual.qa.test;

import org.testng.annotations.Test;

import com.libertymutual.qa.base.BaseClass;

public class BasicAutoTest extends BaseClass{


	@Test
	public void getAutoBasicsQoute() {
		homePage.homepageSteps1("11208");
		basicsAutoPage.basicAutoSteps("Hi there! Let’s start with some basics", "525 liberty ave", "2", "John","Wick","01","10", "1984","jwick@yahoo.com","2021","ACUR","TLX","TLX AWD","SEDAN 4D", "More about your vehicle");
	}
}

package sdet28;

import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test(groups = "smokeTest")
	public void createOrgTest() {
		
		System.out.println("execute createorgTest");
		
	}
	
	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTtest");
	}

}

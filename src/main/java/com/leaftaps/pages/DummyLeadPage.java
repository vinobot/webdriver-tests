package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class ViewLeadPage extends ProjectHooks {

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), data);
		reportStep(data+" is matching with first name", "pass");
		return this;
	}

}

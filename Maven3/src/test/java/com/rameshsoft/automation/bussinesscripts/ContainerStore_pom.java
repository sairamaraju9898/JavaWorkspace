package com.rameshsoft.automation.bussinesscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.basetest.Basetest;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.pageobject.ContainerHome_page;
import com.rameshsoft.automation.pageobject.ContainerOfficeSub;
import com.rameshsoft.automation.pageobject.ContainerStorageSub;
import com.rameshsoft.automation.pageobject.Containerstore_addcart;
import com.rameshsoft.automation.pageobject.containerstore_signuppage;
import com.rameshsoft.automation.utilities.pojoReader;

public class ContainerStore_pom extends Basetest{  
	@Test
	public void containerStoragetest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, Frameworksexception {
		//getdriver().get("https://www.containerstore.com/welcome.htm");
		Actionsengine.enterurl(pojoReader.getprconf().getpropertyvalue("qa_url"));
		//ContainerHome_page.Storage_carts();
		Thread.sleep(2000);
		containerstore_signuppage.homesign();
		Thread.sleep(3000);
		containerstore_signuppage.signinpage_signup();
		//ContainerStorageSub.under10webelements();
		Thread.sleep(2000);
		containerstore_signuppage.createAnAccountPage();
//		//ContainerStorageSub.under10elements();
//		Thread.sleep(3000);
//		//Containerstore_addcart.addcart();
		
		//office
		
		ContainerHome_page.Office_Desks_chairs();
		Thread.sleep(3000);
		ContainerOfficeSub.getCorrespondingItemsPrice();
	}
	
}

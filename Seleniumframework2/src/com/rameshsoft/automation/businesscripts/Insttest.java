package com.rameshsoft.automation.businesscripts;



import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.basetest.Actionsengine;
import com.rameshsoft.automation.customisedexceptions.Frameworksexception;
import com.rameshsoft.automation.utilities.pojoReader;

public class Insttest extends Actionsengine {
	 @Test
		public void insttest() throws IOException, Frameworksexception{
	 
			String url=pojoReader.getprconf().getpropertyvalue("inst_url");
			Actionsengine.enterurl(url, "passing url");
		 
			String videos= pojoReader.getpror().getpropertyvalue("inst_videos");
		WebElement element	=getdriver().findElement(By.xpath(videos));
		//element.click();
		Actionsengine.clickbyactionsEnter(element, "clicked on videos");
		}
}

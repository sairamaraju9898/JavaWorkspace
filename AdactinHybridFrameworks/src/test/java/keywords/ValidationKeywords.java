package keywords;

import org.testng.Assert;

public class ValidationKeywords extends GenericKeywords {

	//in generak here we do assertions 
	
	public void verifyTitle(String expTitle) {
		Assert.assertEquals(getTitle(), expTitle);
		//getttitle is the generic method which were using directly even without creating object due to inheritance 
	}
	
}

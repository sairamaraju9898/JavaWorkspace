package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersdemo {
@Parameters({"result"})
@Test
public void login(@Optional("job is must")String result) {
	System.out.println("login():"+result);	
}
}

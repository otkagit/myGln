package tka;

import java.io.IOException;
import java.nio.file.Paths;

import org.testng.annotations.Test;

public class Test001 extends GalenInitializer {

	private static final String ENV_URL = "http://testapp.galenframework.com/";


	@Test
	public void test() throws IOException {

		driver.get(ENV_URL);
		
//	    {new TestDevice("mobile", new Dimension(450, 800), asList("mobile"))},
		resizeWindow(450, 800);

		runGalenTests("mobile", Paths.get("/specs/welcomePage.spec"));

	}
}

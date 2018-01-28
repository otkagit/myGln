package tka;

import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test002 extends GalenInitializer {

	private static final String ENV_URL = "http://testapp.galenframework.com/";


	@Test
	public void test() throws IOException {
		driver.get(ENV_URL);

		// {new TestDevice("tablet", new Dimension(750, 800), asList("tablet"))},
		resizeWindow(750, 800);

		runGalenTests("tablet", Paths.get("/specs/welcomePage.spec"));

	}
}

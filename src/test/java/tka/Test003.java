package tka;

import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test003 extends GalenInitializer {

	private static final String ENV_URL = "http://testapp.galenframework.com/";

	@Test
	public void test() throws IOException {

		// {new TestDevice("desktop", new Dimension(1024, 800), asList("desktop"))}
		resizeWindow(1024, 800);

		driver.get(ENV_URL);

		runGalenTests("desktop", Paths.get("/specs/welcomePage.spec"));

	}
}

package tka;

import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestImage004 extends GalenInitializer {

	private static final String ENV_URL = "https://www.say7.info/";

	@Test
	public void test() throws IOException {

		// {new TestDevice("desktop", new Dimension(1024, 800), asList("desktop"))}
		resizeWindow(1024, 800);

		driver.get(ENV_URL);

		runGalenTests("desktop", Paths.get("/specs/homeSay7.spec"));

	}
}

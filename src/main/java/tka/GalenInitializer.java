package tka;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.testng.Assert;

import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

public class GalenInitializer extends TestNgInitializer {

	public void runGalenTests(String testname, Path gspec) throws IOException {

		/*
		 * 1. Ausführen und Ergebnis (report) der ausführung bekommen 2. Testinfo obj
		 * erstellen -> zum Test ergebnis hinzufügen -> Liste der Tests erstellen ->
		 * test zur Liste hinzufügen 3. HTMl Report Builder erstellen
		 */

		GalenTestInfo test = GalenTestInfo.fromString(this.getClass().getSimpleName() + "_" + testname);
		test.setStartedAt(new Date());

		LayoutReport layoutReport = Galen.checkLayout(driver, gspec.toFile().getAbsolutePath(), null);// Arrays.asList("desktop")
		// report title
		test.getReport().layout(layoutReport, gspec.getFileName().toString());

		test.setEndedAt(new Date());

		// Create a tests list
		List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();
		tests.add(test);

		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		// Create a report under /target folder based on tests list
		htmlReportBuilder.build(tests, "target/" + this.getClass().getSimpleName());

		Assert.assertFalse(test.isFailed(), "Layout test failed");
	}

	/**
	 * Changes the size of current browser for current test thread
	 *
	 * @param width
	 *            The width of browser window
	 * @param height
	 *            The height of browser window
	 */
	public void resizeWindow(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

}

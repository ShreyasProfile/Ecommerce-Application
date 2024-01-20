package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/org/featurefiles",
		glue = {"org/stepDefinitions","org/hooks"},
		monochrome= true,
		tags = ("@Regression"),
		dryRun=false,
		plugin={"pretty",
		        "html: reports/OpenCart_html/html_report.html"
		       }
		)
public class OcTestRunner {

}

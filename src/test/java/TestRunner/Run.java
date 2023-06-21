package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Features\\LoginFeature.feature", glue = "StepDefination", dryRun = false, monochrome = true, plugin = {
		"pretty", "hml:Reports/reports1.html" })

//plugin = {"pretty", "html:Reports/reports1.html" })  //html report formt
//plugin = {"pretty", "json:Reports/reports_json.json" })	//json report formt
//plugin = {"pretty", "junit:Reports/reports_xml.xml" })	//xml report formt

public class Run {
	/***
	 * This class is empty
	 */
}

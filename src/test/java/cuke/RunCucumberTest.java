package cuke;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cuke", plugin = {"pretty", "html:target/reports/htmlreports", "json:target/reports/json/report.json", "junit:target/reports/junit/junit.xml"},  
tags = "~@ignore"
)
public class RunCucumberTest {

}

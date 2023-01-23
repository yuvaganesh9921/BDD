package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//fb//com//feature",glue={"fb.com.Stepdefination","hooks"}
,tags="@Adactive_A9921",dryRun=false,plugin = {"html:target\\report\\adatic.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runner {



}

package Testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//fb//com//feature",glue={"fb.com.Stepdefination","hooks"}
,tags="@Filpcard_9614",dryRun=false,plugin = {"html:target\\report\\filkcard.html","json:traget\\report\\filkcard.json"})
public class runner_Filkacrd {

}

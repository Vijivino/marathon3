package marathon3.runnerCucumber;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import marathon3.basePom.ServiceCommon;


@CucumberOptions(features="src/main/java/marathon3/featureCucumber/createincident.feature",
                 glue="marathon3/pagesPom",
                 monochrome = true, publish=true)

public class CreateincidentPOMrunner extends ServiceCommon{
	
	 
    @DataProvider(parallel=true)
	    public Object[][] scenarios() {
       
	        return super.scenarios();
	    }

}

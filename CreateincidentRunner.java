package marathon3.runnerCucumber;

import io.cucumber.testng.CucumberOptions;
import marthon3.stepsCucumber.ServiceCommon;


@CucumberOptions(features="src/main/java/marathon3/featureCucumber/createincident.feature" ,
                 glue="marthon3/stepsCucumber" ,monochrome=true,publish=true)


public class CreateincidentRunner extends ServiceCommon {

	
}

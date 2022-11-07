package marathon3.testcasePom;

import org.testng.annotations.Test;

import marathon3.ServiceCommon;
import marathon3.pagesPom.Homepage;




public class CreateIncidentTestCase extends ServiceCommon{
	
	@Test
	public void runcreateincidenttest() {
		
		new Homepage()
		.click_all1()
		.click_incidents1()
		.click_new()
		.get_the_incident_number()
		.enter_the_short_desc("created via testng POM")
		.click_submit();
	}

}

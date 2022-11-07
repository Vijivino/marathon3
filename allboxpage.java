package marathon3.pagesPom;

import io.cucumber.java.en.And;
import marathon3.basePom.ServiceCommon;

public class allboxpage extends ServiceCommon{

	@And("click incidents")
	public incidentspage click_incidents1() {
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		return new incidentspage();
  }
}

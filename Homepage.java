package marathon3.pagesPom;

import io.cucumber.java.en.When;
import io.github.sukgu.Shadow;
import marathon3.basePom.ServiceCommon;

public class Homepage extends ServiceCommon {

//public Shadow shadow;

	@When("click all")
	public allboxpage click_all1() {
		shadow = new Shadow(getdriver());
		shadow.setImplicitWait(20);
		//Thread.sleep(3000);
		shadow.findElementByXPath("//div[@id='all']").click();
		return new allboxpage();
		}


}

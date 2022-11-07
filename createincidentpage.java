package marathon3.pagesPom;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import marathon3.basePom.ServiceCommon;

public class createincidentpage extends ServiceCommon {
	
	@And("get the incident number")
	public createincidentpage get_the_incident_number() {
		text2 = getdriver().findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Inident NUmber"+text2);
		return this;
        }

	@Given("enter the short desc as (.*)$")
	public createincidentpage enter_the_short_desc(String desc) {
		getdriver().findElement(By.id("incident.short_description")).sendKeys(desc);
		return this;
}
	
	@And("click submit")
	public viewpage click_submit() {
		getdriver().findElement(By.xpath("//button[text()='Submit']")).click();
		getdriver().switchTo().defaultContent();
		return new viewpage();
}
	

}

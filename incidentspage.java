package marathon3.pagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import marathon3.basePom.ServiceCommon;

public class incidentspage extends ServiceCommon{
	
	@And("click new")
	public createincidentpage click_new() {
		WebElement eleFrame= shadow.findElementByXPath(("//iframe[@title='Main Content']"));
		getdriver().switchTo().frame(eleFrame);
		getdriver().findElement(By.xpath("//button[text()='New']")).click();
		return new createincidentpage();
		}

}

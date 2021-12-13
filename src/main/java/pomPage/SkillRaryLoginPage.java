package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {

	@FindBy(xpath="//a[text()= ' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[text()= ' SkillRary Demo AP'])[2]")
	private WebElement  SkillRaryDemoAPP;
	
	
	public SkillRaryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbtn() {
		gears.click();
	}
	
	public void SkillRaryDemoAPP() {
		SkillRaryDemoAPP.click();
	}
}

package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemoPage {


	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement  SeleniumTraining;
	
	
	

	public SkillRaryDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCourse() {
		return course;
	}


	public void seleinum() {
		SeleniumTraining.click();
	}
}

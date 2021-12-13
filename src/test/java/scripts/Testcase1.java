package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPage.AddingToCart;
import pomPage.SkillRaryDemoPage;
import pomPage.SkillRaryLoginPage;

public class Testcase1 extends BaseClass {

	@Test
	public void tc1() 
	{
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.gearsbtn();
		s.SkillRaryDemoAPP();
		
		uitilies.switchtabs(driver);
		SkillRaryDemoPage d=new SkillRaryDemoPage(driver);
		uitilies.mousehover(driver,d.getCourse());
		d.seleinum();
		
		AddingToCart a=new AddingToCart(driver);
		uitilies.doubleclick(driver, a.getAdd());
		
		a.addingtocart();
		uitilies.alertpopup(driver);
	}
}

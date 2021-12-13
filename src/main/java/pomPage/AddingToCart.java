package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingToCart {
	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement  AddtoCart;
	
	
	public AddingToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void addingtocart()  {
		AddtoCart.click();
		
	}


	public WebElement getAdd() {
		// TODO Auto-generated method stub
		return add;
	}

}

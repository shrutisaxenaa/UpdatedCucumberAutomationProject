package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class Page1 {

	WebDriver driver;
	
	public Page1(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Set SkyBlue Background']")WebElement BlueButton;
	@FindBy(how=How.XPATH,using="//button[text()='Set White Background']")WebElement whiteButton;
	
	public void validationForExistingSetSkyBlueBackgroundButton() {
		
		Assert.assertEquals("Button not exists",BlueButton.getText() , "Set SkyBlue Background");
		
	}
	
	
	public void setBackgroundToBlue() throws InterruptedException  {
		
		BlueButton.click();
		Thread.sleep(3000);
		
	}
   public void validationForExistingSetWhiteBackgroundButton() {
		
		Assert.assertEquals("Button not exists",whiteButton.getText() , "Set White Background");
		
	}

	
	public void setBackgroundToWhite() throws InterruptedException  {
		
		BlueButton.click();
		Thread.sleep(3000);
		whiteButton.click();
		
		
	}
	public void whiteBackgroundColor() {
		
		System.out.println("BackGround color is changed into white");
	}
}

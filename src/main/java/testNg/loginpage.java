package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	// Constructor
		WebDriver driver;
		
		loginpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(name="user-name") 
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement buttonlogin;

		public void enterUserName(String username) {

			userName.sendKeys(username);
		
		}
		
		public void enterPassword(String pwd) {

			password.sendKeys(pwd);
			
			}
		
		public void clickOnLoginButton() {

			buttonlogin.click();
			
			}

		
		
		/*
	// locators
		By uname= (By.name("user-name"));
		By password= (By.name("password"));
		By buttonlogin= (By.xpath("//input[@value='Login']"));
		
		
		//Action Methods
		public void enterUserName(String username) {

		driver.findElement(uname).sendKeys(username);
		
		}
	public void enterPassword(String pwd) {

			driver.findElement(password).sendKeys(pwd);
			
			}
		
		public void clickOnLoginButton() {

			driver.findElement(buttonlogin).click();
			
			}
*/

}

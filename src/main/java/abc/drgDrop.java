package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drgDrop {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		driver.manage().window().maximize();
		
		WebElement sourcepossition=driver.findElement(By.xpath("(//div[@dragableelement='4'])[2]"));
		WebElement targetpossition=driver.findElement(By.xpath("//div[normalize-space(text())='Italy']"));

		Actions act= new Actions(driver);
		
		act.dragAndDrop(sourcepossition, targetpossition).perform();



}
	
}

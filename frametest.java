package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Static.html");
		driver.switchTo().frame(driver.findElement(By.cssSelector("*[id='droparea']")));
		
		Actions s = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("#mongo"));
		WebElement target = driver.findElement(By.cssSelector("#droparea"));
		s.dragAndDrop(source, target).build().perform();	
	}
}

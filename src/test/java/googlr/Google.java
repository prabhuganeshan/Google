package googlr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		int count=0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prabhu\\eclipse-workspace\\Google\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("ice cream");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	 WebElement text = driver.findElement(By.xpath("//div[@class='aajZCb']"));
		String text2 = text.getText();
		System.out.println(text2);
		for (int i = 0; i < text2.length(); i++) {
		count++;
			
			
		}
		System.out.println(count);
		
	}
}

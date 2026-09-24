package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a1=new ChromeDriver();
Thread.sleep(5000);
a1.get("https://techhirings.com/");
Thread.sleep(2000);
WebElement text=a1.findElement(By.xpath("//input[@type='text']"));
Thread.sleep(2000);
text.sendKeys("testing");

	}

}

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumWorkspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		/*
		 * driver.get("http://www.google.com"); driver.navigate().back();
		 * Thread.sleep(1000); driver.navigate().forward();
		 */
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		System.out.println(links.size());

		for (WebElement element : links) {
			String text = element.getText();
			System.out.println(text);
		}

			System.out.println("-----------------------------");
			for (int i = 0; i < links.size(); i++) {
				String str = links.get(i).getText();
				System.out.println(str);
				System.out.println("-----------------------------");
			}
			Iterator<WebElement> itr= links.iterator();
				
				while(itr.hasNext) {
					
					
				}

			}
	

	}

}

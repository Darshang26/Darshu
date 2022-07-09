import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String ActualTitle=driver.getTitle();
		System.out.println("googletitle :"+ ActualTitle);
		 
		String ExpectedTitle="Google";
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Case is Pass!!!!!!");
		}else {
			System.out.println("Test Case is Failed!!!!!");
		}
		
		driver.close();

	}

}

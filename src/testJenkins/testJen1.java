package testJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testJen1 {
	@Test
	public void testJen(){
		System.out.println("Hellow !");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Eclipse\\workspace\\testJenkins\\driver\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
		
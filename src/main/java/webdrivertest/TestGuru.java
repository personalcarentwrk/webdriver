package webdrivertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGuru {

	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");
		String title = driver.getTitle();
		AssertJUnit.assertFalse(title.contains("Demo Guru99 Page"));
	}

	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}

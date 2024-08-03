package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.POMHome;

public class testHome {
	public WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		System.out.println("myFR: LAUNCHED");
driver.manage().window().maximize();
	}

	@Test
	public void f() {
		try {
	POMHome home=new POMHome(driver);
			home.sendFirstName("myFR: xxx");
			home.sendFirstName("myFR: xxx1");
			home.sendLastName("myFR: ppp1");
			System.out.println( "myFR: Cleared / Entered and entered");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void fQA() {
		try {
	POMHome home=new POMHome(driver);
		home.clickQA();
		System.out.println( "myFR: Clicked on QA");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

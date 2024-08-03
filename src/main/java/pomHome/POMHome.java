package pomHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMHome {
//all public variables
	public WebDriver driver = null;
	private String myFirstName = "fname";
	private String myLastName = "lname";
	private String myQA = "//a[@name='QA']";

	public POMHome(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getFirstName() {
		WebElement FirstName = null;
		try {
			FirstName = driver.findElement(By.id(myFirstName));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return FirstName;
	}

	private WebElement getLastName() {
		WebElement LastName = null;
		try {
			LastName = driver.findElement(By.id(myLastName));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return LastName;
	}

	private WebElement getQA() {
		WebElement QA = null;
		try {
			QA = driver.findElement(By.xpath(myQA));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return QA;
	}

	public void sendFirstName(String myFirstData) {
		getFirstName().clear();
		getFirstName().sendKeys(myFirstData);
	}

	public void sendLastName(String myLastData) {
		try {
			getLastName().clear();
			getLastName().sendKeys(myLastData);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickQA() {
		try {
			getQA().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

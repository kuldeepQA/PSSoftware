package psk.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kuldeep\\Documents\\GicDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://pstakecare.com/");
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='city-toggle-slide']/section/section[2]/div[2]/button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='site-header']/section/section[1]/div[4]/div"))).click();
		

	}

}

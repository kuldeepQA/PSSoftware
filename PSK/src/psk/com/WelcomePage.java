package psk.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WelcomePage {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kuldeep\\Documents\\GicDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://pstakecare.com/");
		

	}

}

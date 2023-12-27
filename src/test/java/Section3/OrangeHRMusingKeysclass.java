package Section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMusingKeysclass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//login using keys
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
//another way

		driver.findElement(By.name("username")).sendKeys(Keys.SHIFT, "a", Keys.NULL, "dmin", Keys.TAB, "admin123",
				Keys.ENTER);
//using robot class
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

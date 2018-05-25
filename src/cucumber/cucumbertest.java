package cucumber;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class cucumbertest {
private static WebDriver driver = null;
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe"); 
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys("arif4"); 
        driver.findElement(By.id("pwd")).sendKeys("arif4");
        driver.findElement(By.id("login")).click();
        System.out.println("Login Successfully");
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        System.out.println("LogOut Successfully");
        driver.quit(); 
	}
}


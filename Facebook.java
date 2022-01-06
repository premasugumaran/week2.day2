package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// set up driver
				WebDriverManager.chromedriver().setup();
				// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
				// launch the browser
				ChromeDriver driver = new ChromeDriver();
				// load url
				driver.get("https://en-gb.facebook.com/");
				// Maximize the browser
				driver.manage().window().maximize();
				//implicit wait
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.findElement(By.linkText("Create New Account")).click();
				driver.findElement(By.name("firstname")).sendKeys("AAA");
				driver.findElement(By.name("lastname")).sendKeys("BBB");
				driver.findElement(By.name("reg_email__")).sendKeys("9965040638");
				
				driver.findElement(By.name("reg_passwd__")).sendKeys("Sugum1r#");
				
				
				WebElement day = driver.findElement(By.name("birthday_day"));
				Select code1 = new Select(day);
				code1.selectByValue("1");
				
				WebElement month = driver.findElement(By.name("birthday_month"));
				Select code2 = new Select(month);
				code2.selectByVisibleText("Dec");
				
				WebElement year = driver.findElement(By.name("birthday_year"));
				Select code3 = new Select(year);
				code3.selectByValue("1989");
				
				driver.findElement(By.xpath("//label[text()='Female']/following::input[1]")).click();
				
				driver.findElement(By.name("websubmit")).click();

	}

}

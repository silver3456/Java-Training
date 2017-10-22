package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.concurrent.TimeUnit;

public class Login {

	private WebDriver driver;

	@Before
	// @SuppressWarnings("Duplicates")
	public void start() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-fullscreen");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driverWait = new WebDriverWait(driver, 10);
	}

	@Test
	public void loginTest() {
		driver.navigate().to("http://localhost/litecart/admin");
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin");
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

		for (int i = 1; i <= 17; i++) {
			driver.findElement(By.cssSelector("li#app-:nth-child("+ i +")")).click();
			// String a = ;
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(2)")).click();
		// String b = driver.getTitle();
		// System.out.println(b);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(3)")).click();
		// String c = driver.getTitle();
		// System.out.println(c);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(4)")).click();
		// String d = driver.getTitle();
		// System.out.println(d);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(5)")).click();
		// String f = driver.getTitle();
		// System.out.println(f);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(6)")).click();
		// String g = driver.getTitle();
		// System.out.println(g);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(7)")).click();
		// String h = driver.getTitle();
		// System.out.println(h);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(8)")).click();
		// String i = driver.getTitle();
		// System.out.println(i);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(9)")).click();
		// String j = driver.getTitle();
		// System.out.println(j);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(10)")).click();
		// String k = driver.getTitle();
		// System.out.println(k);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(11)")).click();
		// String l = driver.getTitle();
		// System.out.println(l);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(12)")).click();
		// String m = driver.getTitle();
		// System.out.println(m);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(13)")).click();
		// String n = driver.getTitle();
		// System.out.println(n);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(14)")).click();
		// String o = driver.getTitle();
		// System.out.println(o);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(15)")).click();
		// String p = driver.getTitle();
		// System.out.println(p);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(16)")).click();
		// String q = driver.getTitle();
		// System.out.println(q);
		// driver.navigate().back();
		//
		// driver.findElement(By.cssSelector("li#app-:nth-child(17)")).click();
		// String r = driver.getTitle();
		// System.out.println(r);
		// driver.navigate().back();

	}
	

	@After
	public void stop() {
		driver.quit();
		driver = null;
	}

}

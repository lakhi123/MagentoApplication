

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void magento() {
		
		String url="http://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		
		Home h=new Home(driver);
		h.clickOnMyAcc();
		
		Login l=new Login(driver);
		l.typeEmail("nitinmanjunath1991@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		Logout l2=new Logout(driver);
		l2.clickOnLogout();
		
		
		driver.quit();
		
		
	}

}

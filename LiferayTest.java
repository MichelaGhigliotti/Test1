# File: LiferayTest.java
# Description: automated testing for Liferay Forms
# Author: Michela Ghigliotti - Italy, Liguria, Genoa
# Date: 3 March 2021

package liferaypackage;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LiferayTest {
	
	System.setProperty("webdriver.chrome.driver", "C:\\users\\user\\Download\\chromedriver_win32\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
	  
	  @Test
		public void testCaseTitle() {
			System.out.println("*** Test Title started ***");
			WebElement title=driver.findElement(By.id("This is a Liferay Forms"));
			String expectedTitle = "This is a Liferay Forms";
			Assert.assertEquals(expectedTitle, title);
			System.out.println("Test Title passed");
		}
	  @Test
		public void testCaseSubtitle() {
			System.out.println("*** Test Subtitle started ***");
			WebElement subtitle=driver.findElement(By.id("Let's party rock."));
			String expectedSubtitle = "Let's party rock.";
			Assert.assertEquals(expectedSubtitle, subtitle);
			System.out.println("Test Subtitle passed");
		}	 
	  driver.close();
	  System.exit(0);	  
}

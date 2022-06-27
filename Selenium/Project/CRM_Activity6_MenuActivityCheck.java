package CRM_Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CRM_Activity6_MenuActivityCheck {
	WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }
	
	 @Test
	    public void MenuActivity() {
     	
     	driver.findElement(By.cssSelector("#user_name")).sendKeys("admin");
     	driver.findElement(By.cssSelector("#username_password")).sendKeys("pa$$w0rd");
     	driver.findElement(By.cssSelector("#bigbutton")).submit();	        	
     	// Create object of WebDriverWait class
     	WebDriverWait wait=new WebDriverWait(driver,30);
     	// Wait till the element is not visible
     	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toolbar")));
     
     	WebElement Activity = driver.findElement(By.xpath("//a[@id='grouptab_3']"));
     	
     	Assert.assertTrue(Activity.isDisplayed());
     	
	    }
	   
	 @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
	 
}

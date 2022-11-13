import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_Page {

	private static final String Else = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String userName = "standard_user";
		String Password = "secret_sauce";
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String actualTitel = driver.getTitle();
		String expectedTitel = "Swag Labs";
		
		Assert.assertEquals(actualTitel, expectedTitel);
		
		if(actualTitel==expectedTitel) {
			System.out.println("pass");
		}
		else{
			System.out.println("Fall");	
		}
		
		
	}

}

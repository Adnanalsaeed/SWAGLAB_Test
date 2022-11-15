import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drivr", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String userName = "standard_user";
		String passWord = "secret_sauce";

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		int expectedITems = 6 ;
		List<WebElement> mybuttons = driver.findElements(By.className("btn"));
		for (int i = 0; i < mybuttons.size(); i++) {
			mybuttons.get(i).click();
		}

		String actualItemsAdd = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
//		System.out.println(actualItemsAdd);
		int theReadlNumber = Integer.parseInt(actualItemsAdd);
		
		 Assert.assertEquals(theReadlNumber, expectedITems);
		 



	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati.a.rastogi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();	
		driver.findElement(By.xpath("//div[@class='inventory_item_name'][contains(text(),'Backpack')]")).click();
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//driver.findElement(By.cssSelector("input[aria-label='Log In']")).click();
		// System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//driver.close();
	}

}

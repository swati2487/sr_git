import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati.a.rastogi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("password");
		// driver.findElement(By.className("input r4 wide mb16 mt8 username")).click();
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("input[aria-label='Log In']")).click();
		// System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//driver.close();
	}

}

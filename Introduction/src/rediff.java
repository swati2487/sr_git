import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati.a.rastogi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("world");
		// driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("input[name='proceed']")).click();
		// System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		// driver.close();
	}

}

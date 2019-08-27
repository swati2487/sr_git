import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\swati.a.rastogi\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}

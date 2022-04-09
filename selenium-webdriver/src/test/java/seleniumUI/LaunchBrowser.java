package seleniumUI;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"libs/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = " https://www.tutorialspoint.com/questions/index.php";
        driver.get(url);
        driver.quit();
    }

}

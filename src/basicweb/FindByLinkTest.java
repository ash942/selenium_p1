package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByLinkTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/neo/Documents/selenium_workspace/Driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        String baseUrl="https://letskodeit.teachable.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Pract")).click();





    }
}

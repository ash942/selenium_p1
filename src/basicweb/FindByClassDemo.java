package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByClassDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/home/neo/Documents/selenium_workspace/Driver/chromedriver");
        WebDriver driver= new ChromeDriver();
        String baseURL="https://en-gb.facebook.com/r.php?locale=en_GB&display=page";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.className("inputtext")).sendKeys("abc");



    }
}

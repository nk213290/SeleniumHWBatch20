package SeleniumHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxAssignment {
    public static void main(String[] args) throws InterruptedException {
        // Create Object of webdriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https:www.amazon.com"); // go to webpage
        String url = driver.getCurrentUrl();
        driver.manage().window().maximize();
        Thread.sleep(5000);              // wait 5s
        String title = driver.getTitle();
        System.out.println("The title of the webpage is "+title); // print
        System.out.println("The url of the webpage is "+url);
        driver.close();  // close
    }
}

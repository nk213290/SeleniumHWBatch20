package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxScript {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("The title of the webpage is "+title);
        System.out.println("The url of the webpage is "+url);
        driver.quit();
    }
}

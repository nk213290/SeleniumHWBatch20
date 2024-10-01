package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverCommandsLive {
    public static void main(String[] args) {
//  Webdriver
        WebDriver driver = new ChromeDriver();
//  goto the url
        driver.get("https://www.ebay.com/");

//  maximize the screen
        driver.manage().window().maximize();

//        print all the links on the webpage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }
    }
}
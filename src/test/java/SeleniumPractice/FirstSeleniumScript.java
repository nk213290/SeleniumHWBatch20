package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        // Create an object of the webdrive interface.
        WebDriver driver = new ChromeDriver();
        // Navigate to Syntax practice page.
        driver.get("https://www.syntaxprojects.com/");
        // ger the current url and print on the console
        String url = driver.getCurrentUrl();
        System.out.println("The current url is "+url);
        // close the browser
        driver.quit();
    }
}

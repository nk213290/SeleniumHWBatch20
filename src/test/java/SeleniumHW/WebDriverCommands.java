package SeleniumHW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        // Create instance of webdrive
        WebDriver driver = new ChromeDriver();
        // Go to webpage google
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        // obtain title
        String title = driver.getTitle();
        System.out.println("The title of the webpage is "+title);
        driver.navigate().to("https://www.syntaxprojects.com");
        title = driver.getTitle();
        System.out.println("The title of the webpage is "+title);
        driver.navigate().back();
        driver.navigate().refresh();//Thread.sleep(5000 ms) used while testing
        driver.close();
    }
}

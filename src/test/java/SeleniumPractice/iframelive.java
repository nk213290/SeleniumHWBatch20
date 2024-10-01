package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframelive {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homeword.php");
        driver.findElement(By.xpath("//iframe[@id='textfieldIframe']\""));
        //switch the focus

        WebElement frameUserName;

        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='Username']"));
        usernameTextBox.sendKeys("abracadabra");
//        switch focus to main page
        driver.switchTo().defaultContent();
    }
}

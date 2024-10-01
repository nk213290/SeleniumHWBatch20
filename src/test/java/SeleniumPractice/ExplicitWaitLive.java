package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class ExplicitWaitLive {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com//synchronization-explicit-wait-homework.php");
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableButton.click();
//         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
        button.click();
        WebElement button2 = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        button2.click();




    }
}

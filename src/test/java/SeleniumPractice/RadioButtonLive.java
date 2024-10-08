package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonLive {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // click button
        List<WebElement> allAgeRB = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioBtn : allAgeRB) {
            if (radioBtn.getAttribute("value").equals("5 - 15")) {
                radioBtn.click();

            }
        }
    }
}
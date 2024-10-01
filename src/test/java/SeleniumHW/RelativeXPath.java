package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath-homework-php");
        // 1. Enter hobbies
        WebElement hobby = driver.findElement(By.xpath("//input[@id = 'yourHobbiesId']"));
        hobby.sendKeys("chess, football");
        // 2. Click Here
        WebElement clickbtn = driver.findElement(By.xpath("//button[text(),'Click Here']"));
        clickbtn.click();
    }
}

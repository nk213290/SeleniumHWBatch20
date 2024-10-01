package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {
    public static void main(String[] args) throws InterruptedException {
        // Create instance of webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize
        driver.navigate().to("https://www.syntaxprojects.com/locator-homework.php");
        // Enter full name in field
        WebElement fullname = driver.findElement(By.id("fullName"));
        fullname.sendKeys("Sudhir N Bhat");
        // Enter email address
        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("sudhir.bhat108@gmail.com");
            WebElement clientName=driver.findElement(By.id("clientNameId"));
            clientName.sendKeys("Moazzam");
            WebElement clientId=driver.findElement(By.id("ClientId"));
            clientId.sendKeys("nk213290");
            WebElement clientFeedback=driver.findElement(By.name("Clientfeedback"));
            clientFeedback.sendKeys("Love Automation class");
            WebElement projectName=driver.findElement(By.name("ProjectName"));
            projectName.sendKeys("Selenium Locators");
            WebElement projectDeadline=driver.findElement(By.id("ProjectTimeId"));
            projectDeadline.sendKeys("Saturday, September 28");
            WebElement currentAddress=driver.findElement(By.name("CurrentAddress"));
            currentAddress.sendKeys("3400 Ocee St, Houston, TX, 77063");
            WebElement permanentAddress=driver.findElement(By.name("PermanentAddress"));
            permanentAddress.sendKeys("2200 Guadelupe Sreet, Austin, TX, 78705");
            WebElement submitBtn=driver.findElement(By.name("btn-submit"));
            submitBtn.click();
            //added Thread to observe the changes in the form while executing the code
            Thread.sleep(5000);
        // Click here button
            WebElement clickbtn=driver.findElement(By.linkText("Click Here."));
            clickbtn.click();
        // Click submit button
        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();
    }
}

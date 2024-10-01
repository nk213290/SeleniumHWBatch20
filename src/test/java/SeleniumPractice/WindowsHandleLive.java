package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandleLive {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        //1. Click on Button B1: Ensure that clicking on the B1 button opens a new window.
        WebElement B1PageBtn = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1PageBtn.click();
        System.out.println("B1 page successfully opened on a new window");

        //2. Click on Button B2: Ensure that clicking on the B2 button opens a new window.
        WebElement B2PageBtn = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        B2PageBtn.click();
        System.out.println("B2 page opened on a new tab");
        //        -------------------------------------------------------------
//        get windows handle of the main page
//        print on the console

        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

//        switch the focus of the driver to the page
//        B2  and orint text
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
            if(driver.getCurrentUrl().equals("https://syntaxprojects.com/b2-page.php")){
                break;
            }
        }

        System.out.println(driver.getCurrentUrl());

        WebElement textOfWebsite = driver.findElement(By.xpath("//h2"));
        System.out.println(textOfWebsite.getText());

        //switch to main page and print the url
        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getCurrentUrl());


    }
}

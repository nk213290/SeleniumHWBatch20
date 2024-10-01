package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableLive {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //select PIM option in the main menu
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

//        locate the id 110307A and click on check box
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for(int i=0;i<ids.size();i++){
            if(ids.get(i).getText().equals("110307A")){
                WebElement row = driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
                row.click();
            }
        }
        //        locate the id 110307A and click on check box
     /*   List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean isnotfound=true;

        while (isnotfound) {
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i).getText().equals("111017A")) {
                    WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    row.click();
                    isnotfound=false;
                }
            }
            if(isnotfound) {
                //if not found on the page click on next button
                WebElement nxtBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nxtBtn.click();
            }
        }*/
    }
}

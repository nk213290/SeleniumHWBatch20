package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableLive {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        //want to print all rows with status  in progress
        //        locate the column status
        List<WebElement> statusCol = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

//        iterate and find the rows in which status is in progress
        int count=1;
        for(WebElement col:statusCol){
            if(col.getText().equals("in progress")){
//                print this row
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(row.getText());
            }
            count=count+1;
        }
    }
}

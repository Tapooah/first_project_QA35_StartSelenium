import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void w3schoolTables() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //print count raw in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows: " + listRows.size());
        Assert.assertEquals(listRows.size(), 7);

        //print last rows
        WebElement res = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(res.getText());

        //print count of columns
        List<WebElement> res2 = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(res2.size(), 3);

        //print "Canada"
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(), "Canada");


        wd.quit();
    }

//----------------------------------------------------------------------------------------------------------------------
    @Test
    public void homeWorkTable() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///D:/QA35_git_clone/first_project_QA35_StartSelenium/src/main/resources/index.html");

        //print count rows in table + xPath
        //List <WebElement> rows = wd.findElements(By.cssSelector("tr"));
        List<WebElement> rows = wd.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Task 1-1: count rows in table");
        System.out.println("Amount of rows: " + rows.size());
        System.out.println("Expected: 4");
        Assert.assertEquals(rows.size(), 4);

        //print last row  + xPath
        // WebElement res = wd.findElement(By.cssSelector("tr:last-child"));
        WebElement res = wd.findElement(By.xpath("//tr[last()]"));
        System.out.println("Task 1-2: print last row");
        System.out.println("Answer: " + res.getText());
        Assert.assertEquals(res.getText(), "Poland Chine Mexico");

        //print count of columns  + xPath
        //List<WebElement> columns = wd.findElements(By.cssSelector("#country-table tr:first-child td"));
        List<WebElement> columns = wd.findElements(By.xpath("//table[@id='country-table']//tr[1]/td"));
        System.out.println("Task 1-3: print count of columns");
        System.out.println("Amount of columns: " + columns.size());
        System.out.println("Expected: 3");
        Assert.assertEquals(columns.size(), 3);

        //print "Israel"  + xPath
        //WebElement israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement israel = wd.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Task1-4: print \"Israel\"");
        System.out.println("Answer: " + israel.getText());
        Assert.assertEquals(israel.getText(), "Israel");

        wd.quit();
    }
//----------------------------------------------------------------------------------------------------------------------
}

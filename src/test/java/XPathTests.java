import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTests {
    WebDriver wd;


    @Test
    public void xPathTests() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        //fill email pablo.thebestqa@gmail.com
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("pablo.thebestqa@gmail.com");

        //fill password TheBestTester_123
        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputEmail.clear();
        inputPassword.sendKeys("TheBestTester_123");

        //Submit LoginBtn
        WebElement loginBtn = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginBtn.click();

        //       wd.quit();
    }
    //a[starts-with(@href.'/ho')]
    //a[contains(@href.'/om')]

}

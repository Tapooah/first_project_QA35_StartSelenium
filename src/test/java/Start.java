import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
        //open the browser
        wd = new ChromeDriver();
        //go to phonebook
//        wd.get("https://contacts-app.tobbymarshall815.vercel.app");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");
        //close the browser
        wd.close();//close tab but not browser
        wd.quit();// close all tabs and browser
    }
}

package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get( "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement( By.id("ctl00_MainContent_username")).sendKeys("Tester" );
        driver.findElement( By.id( "ctl00_MainContent_password")).sendKeys("test");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if (driver.getTitle().equalsIgnoreCase( "Web orders login" )){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is wrong");
        }
        driver.findElement( By.id( "ctl00_MainContent_login_button" ) ).click();
        driver.findElement( By.linkText( "Logout" ) ).click();
        driver.quit();




    }
}

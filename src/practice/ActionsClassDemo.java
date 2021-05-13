package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ActionsClassDemo {
    public static String url = "http://amazon.com";
    public static void main(String[] args) throws IOException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( url );

        WebElement accountButton= driver.findElement( By.id( "nav-link-accountList" ));
        Actions action= new Actions( driver);
        action.moveToElement( accountButton ).perform();

    }
}
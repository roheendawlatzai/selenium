package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        String url="https://www.saucedemo.com/";
        driver.get( url );
        driver.findElement( By.id("user-name")).sendKeys( "standard_user" );
        driver.findElement(By.id( "password" )) .sendKeys( "secret_sauce" );
        driver.findElement( By.id( "login-button" ) ).click();
        Thread.sleep( 2000 );
        driver.findElement( By.id( "add-to-cart-sauce-labs-backpack" ) ).click();
        driver.findElement( By.className( "inventory_item_img" ) ).click();
        Thread.sleep( 5000 );
        driver.navigate().back();
        driver.findElement( By.id( "react-burger-menu-btn" ) ).click();
        Thread.sleep( 4000 );
        driver.findElement( By.linkText( "ABOUT" ) ).click();
        Thread.sleep( 5000 );



    }
}

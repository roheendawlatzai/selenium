package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login" );
        driver.findElement( By.id("txtUsername") ).sendKeys( "Admin" );
        driver.findElement( By.id(  "btnLogin" )).click();
        Thread.sleep( 2000 );
        WebElement errorMessage=driver.findElement( By.id( "spanMessage" ) );//Password empty error messsage
        boolean errorDisplayed=errorMessage.isDisplayed();
        if(errorDisplayed){
            System.out.println("Password empty error message displayed");
        }




    }
}

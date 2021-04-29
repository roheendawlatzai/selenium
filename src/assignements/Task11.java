package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get( "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login" );
        driver.findElement( By.id("txtUsername") ).sendKeys( "Admin" );
        Thread.sleep( 2000 );
        driver.findElement( By.id( "txtPassword" )).sendKeys( "Hum@nhrm123" );
        driver.findElement( By.id( "btnLogin" ) ).click();
        WebElement syntaxLogo=driver.findElement( By.cssSelector( "img[alt='OrangeHRM']" ) );
        boolean syntaxLOGO=syntaxLogo.isDisplayed();
        if (syntaxLOGO){
            System.out.println("Syntax Logo is displayed");
        }else{
            System.out.println("Syntax Logo is not displayed");
        }
    }
}

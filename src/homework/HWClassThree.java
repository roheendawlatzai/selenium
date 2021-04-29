package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWClassThree {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php"  );
        driver.manage().window().maximize();
        WebElement startPracticingbutton=driver.findElement( By.id("btn_basic_example") );
        startPracticingbutton.click();
        Thread.sleep( 2000 );
        WebElement simpleFormDemo= driver.findElement(By.xpath( "//a[contains(text(), 'Simple Form Demo')]/parent::div" ));
//        //WebElement simpleFormDemo= driver.findElement(By.xpath( "//a[text()='Javascript Alerts']/preceding-sibling::a[4]"));
//        simpleFormDemo.click();
//        Thread.sleep( 2000 );
//        WebElement enterMessageTextBox= driver.findElement(By.id( "user-message" ));
//        enterMessageTextBox.sendKeys( "syntax technologies" );
//        WebElement showMessageButton= driver.findElement(By.xpath( "//button[@onclick='showInput();']" ));
//        showMessageButton.click();
//        Thread.sleep( 2000 );
//        driver.quit();

    }
}

package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2of2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver= new ChromeDriver();
        driver.get( "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement usernameTextBox=driver.findElement( By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameTextBox.sendKeys( "Tester" );
        WebElement passwordTextBox= driver.findElement(By.xpath( "//input[@type='password']" ));
        passwordTextBox.sendKeys( "test" );
        WebElement loginButton= driver.findElement(By.xpath( "//input[@value='Login']" ));
        loginButton.click();
        Thread.sleep( 2000 );
        WebElement logoutButton= driver.findElement(By.xpath( "//a[text()='Logout']" ));
        logoutButton.click();


        //input[@id='ctl00_MainContent_username']
        //input[@name='ctl00$MainContent$username']
        //input[@name='ctl00$MainContent$username']
        //input[@id='ctl00_MainContent_username']

    }
}

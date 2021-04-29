package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//HW
//        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//        fill out the form
//        click on register
//        close the browser
public class task1of2 {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get( "https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement( By.id("customer.firstName") ).sendKeys( "FirstName" );
        driver.findElement( By.id("customer.lastName") ).sendKeys( "LastName" );
        driver.findElement( By.id("customer.address.street") ).sendKeys( "123 NYB ST" );
        driver.findElement( By.id("customer.address.city") ).sendKeys( "Houston" );
        driver.findElement( By.id("customer.address.state") ).sendKeys( "TX" );
        driver.findElement( By.id("customer.address.zipCode") ).sendKeys( "77077" );
        driver.findElement( By.id("customer.phoneNumber") ).sendKeys( "832-822-2222" );
        driver.findElement( By.id("customer.ssn") ).sendKeys( "123121212" );
        driver.findElement( By.id("customer.username") ).sendKeys( "halwa" );
        driver.findElement( By.id("customer.password") ).sendKeys( "iampassword@9" );
        driver.findElement( By.id("repeatedPassword") ).sendKeys( "iampassword@9" );
        driver.findElement(By.className( "button" )).click();
        driver.quit();





    }
}

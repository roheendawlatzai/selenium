package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class facebook1 {
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get( url );
        Thread.sleep( 1000 );
        WebElement createAccountButton =driver.findElement( By.linkText("Create New Account") );
        createAccountButton.click();
        Thread.sleep( 1000 );
        //Month options
        WebElement monthButton =driver.findElement( By.id("month") );
        Select select=new Select( monthButton );
        List<WebElement> monthDD=select.getOptions();
        int monthSize=monthDD.size();
        if (monthSize==12){
            System.out.println("Month dd has 12 month options");
        }else{
            System.out.println("Month dd has size "+monthSize);
        }
        //Day Options
        WebElement daysButton =driver.findElement( By.id("day") );
        Select select1=new Select( daysButton );
        List<WebElement> daysDD=select1.getOptions();
        int daysSize=daysDD.size();
        if (daysSize==31){
            System.out.println("Days dd has 31 days options");
        }else{
            System.out.println("Days dd has size "+daysSize);
        }
        WebElement yearButton=driver.findElement( By.id( "year" ) );
        Select select2=new Select( yearButton );
        List<WebElement> yearsDD=select.getOptions();
        int yearSize=yearsDD.size();
        if (yearSize==115){
            System.out.println("year dd has 115 year options");
        }else{
            System.out.println("year dd has size "+yearSize);
        }
        select.selectByVisibleText( "December" );


//        monthButton.sendKeys( "January" );
//        daysButton.sendKeys( "1" );
//        yearButton.sendKeys( "1995" );
//        driver.quit();
}}


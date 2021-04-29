package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAccount {
    public static String url="https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get( url );
        WebElement createAccountButton =driver.findElement( By.linkText("Create New Account") );
        createAccountButton.click();
        Thread.sleep( 2000 );
        WebElement nameBox=driver.findElement( By.name( "firstname" ) );
        nameBox.sendKeys( "Charlie" );
        Thread.sleep( 2000 );
        WebElement lastNameBox=driver.findElement( By.name( "lastname" ) );
        lastNameBox.sendKeys( "Chaplin" );
        Thread.sleep( 2000 );
        WebElement emailBox=driver.findElement( By.name( "reg_email__" ) );
        emailBox.sendKeys( "char@yahoo.com" );
        Thread.sleep( 2000 );
        WebElement reEmailBox=driver.findElement( By.name( "reg_email_confirmation__" ) );
        reEmailBox.sendKeys( "char@yahoo.com" );
        Thread.sleep( 2000 );
        WebElement passBox=driver.findElement( By.name( "reg_passwd__" ) );
        passBox.sendKeys( "char@123" );

        WebElement monthButton =driver.findElement( By.id("month") );
        WebElement daysButton =driver.findElement( By.id("day") );
        WebElement yearButton=driver.findElement( By.id( "year" ) );

        monthButton.sendKeys( "January" );
        daysButton.sendKeys( "01" );
        yearButton.sendKeys( "1995" );


        Thread.sleep( 2000 );
        WebElement maleGenderSelector=driver.findElement( By.id( "u_1_3_wS" ) );
        maleGenderSelector.click();




    }
}
//Go to facebook sign up page
//Fill out the whole form
//Click signup
//Last name: u_k_d_dy
//      email  u_k_g_A5   pas: password_step_input re email: reg_email_confirmation__
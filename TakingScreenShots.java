import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShots {
    public static String url=
            "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username= driver.findElement( By.id("ctl00_MainContent_username"));
        username.sendKeys( "Tester", Keys.TAB );

        WebElement password= driver.findElement( By.id("ctl00_MainContent_password"));
        password.sendKeys( "test", Keys.ENTER );

        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile= ts.getScreenshotAs( OutputType.FILE ); //screenshot taken

        try {
            FileUtils.copyFile( sourceFile, new File( "screenshots/SmartBear/adminLogin.png" ) );
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

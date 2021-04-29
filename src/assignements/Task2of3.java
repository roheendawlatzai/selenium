package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Task2of3 {

    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
        WebDriver driver=new ChromeDriver();
        driver.get( "https://www.amazon.com/" );
        List<WebElement> allLinks=driver.findElements( By.tagName("a") );
        System.out.println("Number of links "+allLinks.size());

        for (WebElement links:allLinks){
            String fullLink=links.getAttribute( "href" );
            String linkText=links.getText();
            if (!linkText.isEmpty()){
                System.out.println(linkText+"    "+fullLink);
            }
        }
    }
}

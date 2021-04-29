package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class AmazonDDHandling {
        public static String url="https://amazon.com/";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty( "webdriver.chrome.driver", "drivers/chromedriver" );
            WebDriver driver=new ChromeDriver();
            driver.get( url );
            WebElement cat=driver.findElement( By.id("searchDropdownBox") );
            Select select=new Select( cat );

            List<WebElement> options=select.getOptions();

            Iterator<WebElement> iterator=options.iterator();

            boolean isMultiple=select.isMultiple();
            System.out.println(isMultiple);

            if (isMultiple){
                for (WebElement option:options){
                    WebElement itOptions= iterator.next();
                    String optionText=itOptions.getText();
                    System.out.println(optionText);
            }}

//
//
//            for (WebElement option:options){
//                String optionText=option.getText();
////                System.out.println(optionText);
//
//            }
//            select.selectByValue("search-alias=alexa-skills"  );




    }
}

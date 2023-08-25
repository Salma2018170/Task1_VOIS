package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
   private WebDriver driver;
   //Locator
    By searchField=By.id("twotabsearchtextbox");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    /**
     * @param item -  string value for Item you want to search about
     */
    public CategoryPage SearchForItem(String item){
       WebElement search=driver.findElement(searchField);
               search.sendKeys(item);
               search.sendKeys(Keys.RETURN);
               return new CategoryPage(driver);
    }
}

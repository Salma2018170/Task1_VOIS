package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    //Locator
    By itemField=By.xpath("//*[contains(text(),'AUJEN Bling License Plate Frame')]");
    public CategoryPage(WebDriver driver){
        this.driver=driver;
    }
    public SubCategoryPage selectItem(){
        driver.findElement(itemField).click();
        return new SubCategoryPage(driver);
    }
}

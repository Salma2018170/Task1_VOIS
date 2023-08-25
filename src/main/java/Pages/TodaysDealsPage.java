package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysDealsPage {
    //
    By headphoneField = By.xpath("//*[@data-csa-c-element-id=\"filter-department-172541\"]");
    By groceryField = By.xpath("//*[@data-csa-c-element-id=\"filter-department-16310101\"]");
    By discountField = By.xpath("//span[contains(text(),'10% off or more')]");
    By page3=By.xpath("//a[text()=3]");
    By itemField=By.xpath("//div[contains(text(),'Redzoo Neckband Headphones')]");
    private final WebDriver driver;

    public TodaysDealsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterItems() {
        driver.findElement(headphoneField).click();
        driver.findElement(groceryField).click();
    }

    public void filterBaseOnDiscount() {
        driver.findElement(discountField).click();
    }
    public void selectThirdPage(){
        driver.findElement(page3).click();
    }
    public SubCategoryPage selectItem(){
        driver.findElement(itemField).click();
        return new SubCategoryPage(driver);
    }
}

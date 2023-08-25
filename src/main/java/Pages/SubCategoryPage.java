package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubCategoryPage {
    //Locator
    By addToCartButton = By.id("add-to-cart-button");
    By cartIcon = By.id("nav-cart-text-container");

    private final WebDriver driver;

    public SubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
         driver.findElement(addToCartButton).click();
    }
    public CartPage goToCartPage(){
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }
}

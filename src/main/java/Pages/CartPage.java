package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    //locator
    //Subtotal (1 item):
    //*[contains(text(),'Subtotal (1 item)')]
    By totalItemField=By.xpath("//*[contains(text(),'Subtotal (1 item)')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void checkItemAdded(){
           driver.findElement(totalItemField).isEnabled();
    }

}

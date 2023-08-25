package scenarios;

import basics.Base;
import org.testng.annotations.Test;

public class Scenario1 extends Base {
    @Test(description = "Search for specific Item")
    public void TC1(){
       categoryPage= homePage.SearchForItem("car accessories");
    }
    @Test(description = "Select first item ")
    public void TC2(){
       subCategoryPage=categoryPage.selectItem();

    }
    @Test(description = "Add item to cart and go to cart page")
    public void TC3(){
       subCategoryPage.addItemToCart();
       cartPage=subCategoryPage.goToCartPage();
    }
    @Test(description = "verify item added")
    public void TC4(){
       cartPage.checkItemAdded();
    }
}

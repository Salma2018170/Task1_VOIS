package scenarios;

import basics.Base;
import org.testng.annotations.Test;

public class Scenario2 extends Base {
    @Test
    public void TC1(){
      dealsPage=  homePage.gotToDealPage();
    }
    @Test
    public void TC2(){
        dealsPage.filterItems();
        dealsPage.filterBaseOnDiscount();
        dealsPage.selectThirdPage();
       subCategoryPage= dealsPage.selectItem();
       subCategoryPage.addItemToCart();
    }
}

package basics;

import Pages.CartPage;
import Pages.CategoryPage;
import Pages.HomePage;
import Pages.SubCategoryPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
    protected WebDriver driver;
    //Pages
    protected HomePage homePage;
    protected CategoryPage categoryPage;
    protected SubCategoryPage subCategoryPage;
    protected CartPage cartPage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
        Thread.sleep(10000);
        driver.get("https://www.amazon.com/");
        homePage=new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
            // driver.quit();
    }
}

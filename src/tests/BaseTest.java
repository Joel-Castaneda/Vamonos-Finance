package tests;
import Pages.BuyPage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.SellPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected BuyPage buyPage;
    protected SellPage sellPage;

    public void clickButton(String btn) {
        driver.findElement(By.cssSelector(btn)).click();
    }

    public boolean hasMessage(String alert){
        return driver.findElement(By.cssSelector(alert)).isDisplayed();
    }

    public void clickLink(String link) {
        driver.findElement(By.cssSelector(link)).click();
    }


    @Before
    public void beforeTest() {
        driver = new ChromeDriver();
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        buyPage = new BuyPage(driver);
        sellPage = new SellPage(driver);
    }


    @After
    public void cleanTest() {
        driver.quit();
    }

}

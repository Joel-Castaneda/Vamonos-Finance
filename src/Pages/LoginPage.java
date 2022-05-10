package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.awt.SystemColor.text;


public class LoginPage extends BasePage{

    @FindBy(name = "username")
    WebElement Uname;

    @FindBy(name = "password")
    WebElement Password;

    WebDriverWait wait = new WebDriverWait(driver, 60);
    public LoginPage(WebDriver driver) {super(driver);}

    public void goTo() {
        driver.get("https://vamonos-finance.herokuapp.com/login");
    }

    public void Login(String uname, String password){
        wait.until(ExpectedConditions.visibilityOf(Uname));
        Uname.sendKeys(uname);
        Password.sendKeys(password);
    }

}

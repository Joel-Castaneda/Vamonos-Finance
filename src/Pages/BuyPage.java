package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuyPage extends BasePage{

    @FindBy (className = "form-control")
    WebElement actionName;

    @FindBy (name = "qty")
    WebElement quantity;

    public BuyPage(WebDriver driver) {super(driver);}

    /*public boolean hasBuyed(String text){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text))).isDisplayed();
    }*/

    public void succesBuy(String name, String qty){
        wait.until(ExpectedConditions.visibilityOf(actionName));
        actionName.sendKeys(name);
        quantity.sendKeys(qty);
    }

}

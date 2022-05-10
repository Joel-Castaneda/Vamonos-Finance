package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SellPage extends BasePage{

    @FindBy (name = "symbol")
    WebElement symbol;

    @FindBy (name = "qty")
    WebElement QTY;

    public SellPage(WebDriver driver) {super(driver);}

    public void successSell(String quantity, String number){
        Select selectObject = new Select(symbol);
        wait.until(ExpectedConditions.visibilityOf(symbol));
        selectObject.selectByIndex(Integer.parseInt(number));
        QTY.sendKeys(quantity);
    }
}

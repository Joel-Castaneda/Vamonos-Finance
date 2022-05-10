package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegisterPage extends BasePage{
    private String userSuffix;

    @FindBy(name = "first_name")
    WebElement FName;

    @FindBy(name = "last_name")
    WebElement LName;

    @FindBy(name = "username")
    WebElement Uname;

    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(name = "repeat_password")
    WebElement RPassword;

    @FindBy(name = "phone")
    WebElement Phone;

    @FindBy(name = "birthdate")
    WebElement BDate;

    @FindBy(name = "cc")
    WebElement CCard;

    @FindBy(name = "expiration")
    WebElement Expir;

    @FindBy(name = "cvv")
    WebElement CVV;

    WebDriverWait wait = new WebDriverWait(driver, 60);
    public RegisterPage(WebDriver driver) {super(driver);}

    public void goTo() {
        driver.get("https://vamonos-finance.herokuapp.com/register");
    }

    public void Register(String userP, String password, String EDate, String tphone, String Card, String CV, String Date){
        userSuffix = new Random().nextInt(10000) + "";
        wait.until(ExpectedConditions.visibilityOf(Uname));
        Uname.sendKeys(userP + userSuffix);
        FName.sendKeys(userP + userSuffix);
        LName.sendKeys(userP + userSuffix);
        Password.sendKeys(password);
        RPassword.sendKeys(password);
        Email.sendKeys(userP + userSuffix + "@gmail.com");
        Expir.sendKeys(EDate);
        Phone.sendKeys(tphone);
        CCard.sendKeys(Card);
        CVV.sendKeys(CV);
        BDate.sendKeys(Date);
    }

    public void emptyFields(String userP, String password,String rpassword, String EDate, String tphone, String Card, String CV, String Date){
        userSuffix = new Random().nextInt(10000) + "";
        wait.until(ExpectedConditions.visibilityOf(Uname));
        Uname.sendKeys(userP + userSuffix);
        FName.sendKeys(userP);
        LName.sendKeys(userP);
        Password.sendKeys(password);
        RPassword.sendKeys(rpassword);
        Email.sendKeys(userP + userSuffix + "@gmail.com");
        Expir.sendKeys(EDate);
        Phone.sendKeys(tphone);
        CCard.sendKeys(Card);
        CVV.sendKeys(CV);
        BDate.sendKeys(Date);
    }

    public void incorrectPassword(String userP, String password,String rpassword, String EDate, String tphone, String Card, String CV, String Date){
        userSuffix = new Random().nextInt(10000) + "";
        wait.until(ExpectedConditions.visibilityOf(Uname));
        Uname.sendKeys(userP + userSuffix);
        FName.sendKeys(userP + userSuffix);
        LName.sendKeys(userP + userSuffix);
        Password.sendKeys(password);
        RPassword.sendKeys(rpassword);
        Email.sendKeys(userP + userSuffix + "@gmail.com");
        Expir.sendKeys(EDate);
        Phone.sendKeys(tphone);
        CCard.sendKeys(Card);
        CVV.sendKeys(CV);
        BDate.sendKeys(Date);
    }

    public void reapetedUser(String userP, String password,String rpassword, String EDate, String tphone, String Card, String CV, String Date){
        wait.until(ExpectedConditions.visibilityOf(Uname));
        Uname.sendKeys(userP);
        FName.sendKeys(userP);
        LName.sendKeys(userP);
        Password.sendKeys(password);
        RPassword.sendKeys(rpassword);
        Email.sendKeys(userP + "@gmail.com");
        Expir.sendKeys(EDate);
        Phone.sendKeys(tphone);
        CCard.sendKeys(Card);
        CVV.sendKeys(CV);
        BDate.sendKeys(Date);
    }
}

package tests;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class SellTest extends BaseTest{

    @Test
    public void sellTest(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8612","12345678");
        clickButton(".btn");
        clickLink("[href=\"/sell\"]");

        sellPage.successSell("1", "0");
        clickButton(".btn");
        assertTrue(hasMessage(".table.table-striped"));
        cleanTest();
    }

    @Test
    public void negativeSell(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8612","12345678");
        clickButton(".btn");
        clickLink("[href=\"/sell\"]");

        sellPage.successSell("-5", "0");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }

    @Test
    public void InsufficientActions(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8612","12345678");
        clickButton(".btn");
        clickLink("[href=\"/sell\"]");

        sellPage.successSell("10", "0");
        clickButton(".btn");
        assertTrue(hasMessage(".table.table-striped"));
        cleanTest();
    }
}

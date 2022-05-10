package tests;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class BuyTest extends BaseTest{


    @Test
    public void succesBuyTest(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8612","12345678");
        clickButton(".btn");
        clickLink("[href=\"/buy\"]");

        buyPage.succesBuy("IBM","1");
        clickButton(".btn");
        assertTrue(hasMessage(".table.table-striped"));
        cleanTest();
    }

    @Test
    public void inexistantAction(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel12","01234567");
        clickButton(".btn");
        clickLink("[href=\"/buy\"]");

        buyPage.succesBuy("NFT","1");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }

    @Test
    public void insuficientMoney(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel12","01234567");
        clickButton(".btn");
        clickLink("[href=\"/buy\"]");

        buyPage.succesBuy("IBM","5000");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }

    @Test
    public void negativeMoney(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8612","12345678");
        clickButton(".btn");
        clickLink("[href=\"/buy\"]");

        buyPage.succesBuy("IBM","-5");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }
}

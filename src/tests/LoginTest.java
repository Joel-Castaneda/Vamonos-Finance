package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void LoginTest(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel12","01234567");
        clickButton(".btn");
        cleanTest();
    }

    @Test
    public void NoUserTest(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("lohkjob","123456789");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }

    @Test
    public void NothingTest(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("","");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }

    @Test
    public void wrongPassword(){
        beforeTest();
        loginPage.goTo();
        loginPage.Login("joel8579","kjhkjkj");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }
}

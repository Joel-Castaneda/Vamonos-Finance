package tests;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class RegisterTest extends BaseTest{

    @Test
    public void registerTest(){

        beforeTest();
        registerPage.goTo();
        registerPage.Register("joel","12345678","15/30", "1234567890",
                "0123456789123456", "159", "15052025");
        clickButton(".btn");
        cleanTest();
    }

    @Test
    public void emptyFields(){
        beforeTest();
        registerPage.goTo();
        registerPage.emptyFields("","12345678","12345678","15/30", "1234567890",
                "0123456789123456", "159", "15052025");
        clickButton(".btn");
        //cleanTest();
    }

    @Test
    public void incorrectPasswordTest(){
        beforeTest();
        registerPage.goTo();
        registerPage.incorrectPassword("joel","12345678","123456789","15/30", "1234567890",
                "0123456789123456", "159", "15052025");
        clickButton(".btn");
        hasMessage(".alert");
        cleanTest();
    }

    @Test
    public void sameUserTest(){
        beforeTest();
        registerPage.goTo();
        registerPage.reapetedUser("joel12","12345678","12345678","15/30", "1234567890",
                "0123456789123456", "159", "15052025");
        clickButton(".btn");
        hasMessage(".alert");
        cleanTest();
    }

    @Test
    public void verifySuccessAlert(){

        beforeTest();
        registerPage.goTo();
        registerPage.Register("joel","12345678","15/30", "1234567890",
                "0123456789123456", "159", "15052025");
        clickButton(".btn");
        assertTrue(hasMessage(".alert"));
        cleanTest();
    }
}

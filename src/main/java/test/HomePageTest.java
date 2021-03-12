package test;

import org.junit.Before;
import org.junit.Test;
import pages.AccountCreationPage;
import pages.AuthenticationPage;
import pages.HomePage;
import utility.Driver;

public class HomePageTest {

    @Before
    public void setUp() {
        Driver.getDriver().get("http://automationpractice.com/index.php");
    }

    @Test
    public void Test() {
        HomePage homePage = new HomePage();
        homePage.clickSignInButton();
        AuthenticationPage authenticationPage = new AuthenticationPage();
        authenticationPage.enterEmail("someone@domain.tld");
        authenticationPage.clickCreateAccountButton();
        AccountCreationPage accountCreationPage=new AccountCreationPage();
        accountCreationPage.userCreateAccount("Akida","Akbar","Hello1129!","44 Valleywoods rd","Windsor","00000","4164209865","Selenium");

    }

}

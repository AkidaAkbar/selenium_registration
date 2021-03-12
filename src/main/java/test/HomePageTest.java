package test;

import com.github.javafaker.Faker;
import org.junit.Assert;
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
        Faker faker=new Faker();
        AccountCreationPage accountCreationPage=new AccountCreationPage();
        accountCreationPage.userCreateAccount(faker.name().firstName(), faker.name().lastName() ,faker.lorem().characters(8, 16) ,faker.address().streetAddress(),faker.address().cityName(),faker.address().zipCode(),faker.phoneNumber().cellPhone(),"Selenium");
        Assert.assertTrue("Validate that the Sign out button is present.", accountCreationPage.getSignOutButton().isDisplayed());
    }

}

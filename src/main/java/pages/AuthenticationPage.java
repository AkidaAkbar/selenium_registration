package pages;

import org.openqa.selenium.By;
import utility.Driver;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class AuthenticationPage {
    private static final By EMAIL_ADDRESS_INPUT = id("email_create");
    private static final By CREATE_BUTTON = xpath("//button[@id='SubmitCreate']/span");

    public void enterEmail(String email) {

        Driver.getDriver().findElement(EMAIL_ADDRESS_INPUT).sendKeys(email+System.currentTimeMillis());
    }
    public void clickCreateAccountButton(){
        Driver.getDriver().findElement(CREATE_BUTTON).click();
    }

}

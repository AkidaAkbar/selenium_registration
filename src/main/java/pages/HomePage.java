package pages;

import org.openqa.selenium.By;

import utility.Driver;

import static org.openqa.selenium.By.xpath;

public class HomePage {
    private static final By CLICK_SIGN_IN = xpath("//a[contains(text(),'Sign in')]");


    public void clickSignInButton() {
        Driver.getDriver().findElement(CLICK_SIGN_IN).click();
    }

}
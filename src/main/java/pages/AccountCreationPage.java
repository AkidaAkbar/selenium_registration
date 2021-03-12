package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.Driver;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;



public class AccountCreationPage {
    private static final By FIRST_NAME = id("customer_firstname");
    private static final By LAST_NAME = id("customer_lastname");
    private static final By EMAIL = id("email");
    private static final By PASSWORD = id("passwd");
    private static final By DAY = xpath("//select[@id='days']");
    private static final By MONTH = xpath("//select[@id='months']");
    private static final By YEAR = xpath("//select[@id='years']");
    private static final By ADDRESS = id("address1");
    private static final By CITY = id("city");
    private static final By STATE = id("id_state");
    private static final By ZIP_CODE = id("postcode");
    private static final By MOBILE_PHONE = id("phone_mobile");
    private static final By ADDRESS_ALIAS = id("alias");
    private static final By SIGN_IN_BUTTON = xpath("//button[@id='submitAccount']/span");
    private static final By SIGN_OUT_BUTTON= xpath("//a[contains(text(),'Sign out')]");



    public void enterFirstName(String firstName) {
        Driver.wait(FIRST_NAME);
        Driver.getDriver().findElement(FIRST_NAME).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        Driver.getDriver().findElement(LAST_NAME).sendKeys(lastName);
    }

    public void clickEmail() {
        Driver.getDriver().findElement(EMAIL).click();
    }

    public void enterPassword(String password) {

        Driver.getDriver().findElement(PASSWORD).sendKeys(password);
    }
    public void clickDay() {
        WebElement element = Driver.getDriver().findElement(DAY);
        Select select = new Select(element);
        select.selectByValue("1");
    }
    public void clickMonth() {
        WebElement element = Driver.getDriver().findElement(MONTH);
        Select select = new Select(element);
        select.selectByValue("1");
    }
    public void clickYear() {
        WebElement element = Driver.getDriver().findElement(YEAR);
        Select select = new Select(element);
        select.selectByValue("1997");
    }

    public void enterAddress(String address) {
        Driver.getDriver().findElement(ADDRESS).sendKeys(address);
    }
    public void enterCity(String city) {

        Driver.getDriver().findElement(CITY).sendKeys(city);
    }
    public void clickState() {
        WebElement element = Driver.getDriver().findElement(STATE);
        Select select = new Select(element);
        select.selectByValue("20");
    }

    public void enterZipCode(String zipCode) {
        Driver.getDriver().findElement(ZIP_CODE).sendKeys(zipCode);
    }
    public void enterMobile(String mobile) {
        Driver.getDriver().findElement(MOBILE_PHONE).sendKeys(mobile);
    }
    public void enterAddressAlias(String alias) {
        Driver.getDriver().findElement(ADDRESS_ALIAS).sendKeys(alias);
    }
    public void clickSignInButton(){
        Driver.getDriver().findElement(SIGN_IN_BUTTON).click();
    }

    public WebElement getSignOutButton() {
        return Driver.getDriver().findElement(SIGN_OUT_BUTTON);
    }

    //combine all methods from current page
    public void userCreateAccount(String firstName, String lastName, String password, String address, String city, String zipCode, String mobile, String alias){
        enterFirstName(firstName);
        enterLastName(lastName);
        clickEmail();
        enterPassword(password);
        clickDay();
        clickMonth();
        clickYear();
        enterAddress(address);
        enterCity(city);
        clickState();
        enterZipCode(zipCode);
        enterMobile(mobile);
        enterAddressAlias(alias);
        clickSignInButton();

    }
}
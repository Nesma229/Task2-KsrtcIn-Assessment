package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utls.CustomMethods;

public class SeatsPage {
    private WebDriver driver;
    public SeatsPage(WebDriver driver) {
        this.driver = driver;
    }



    private final By selectSeatsBtn = By.xpath("//div[@class='seatlook'][9]");
    private final By boardingvalue = By.xpath("//div[@class='pick--val']");

    private final By droppingPointField = By.xpath("//div[@tabindex='1']");

    private final By droppingValue = By.xpath("//div[@class='drop--val']");
    private final By providePassengerDetailsBtn = By.xpath("//div[text()='Provide Passenger Details']");


    private final By mobileField = By.xpath("//label[text()='Mobile No']//preceding-sibling::input[1]");
    private final By emailField = By.xpath("//label[text()='Email ID']//preceding-sibling::input[1]");
    private final By proceedToPassengerDetailsBtn = By.xpath("//div[text()='PROCEED TO passenger detail as']");

    private final By nameField = By.xpath("//input[@placeholder=\"Name\"]");
    private final By genderField = By.xpath("//input[@name=\"paxGender[0]\"]");
    private final By searchGenderField = By.xpath("//input[@class=\"checkout--drop--inp\"]");
    private final By ageField = By.xpath("//input[@name=\"paxAge[0]\"]");
    private final By commissionField = By.xpath("//input[@name=\"paxConcessionType[0]\"]");
    private final By selectionOfCommission = By.xpath("//div[text()='GENERAL PUBLIC']//parent::div");
    private final By proceedToCheckoutBtn = By.xpath("//div[text()='Proceed to Checkout']");



    public SeatsPage selectSeat() {
        CustomMethods.click(driver, selectSeatsBtn);
        return this;
    }

    public SeatsPage selectBoardingPointAndDroppingPoint() {
        CustomMethods.click(driver, boardingvalue);
        CustomMethods.click(driver,droppingPointField);
        CustomMethods.click(driver,droppingValue);
        return this;
    }

    public SeatsPage clickProvidePassengerDetailsBtn() {
        CustomMethods.click(driver, providePassengerDetailsBtn);
        return this;
    }

    public SeatsPage fillCustomerDetails(String mobile, String email) {
        CustomMethods.enterText(driver,mobileField,mobile);
        CustomMethods.enterText(driver,emailField,email);
        return this;
    }

    public SeatsPage clickProceedPassengerDetailsBtn() {
        CustomMethods.click(driver, proceedToPassengerDetailsBtn);
        return this;
    }


    public SeatsPage fillPassengerDetails(String name, String gender , String age) {
        Actions actions = new Actions(driver);
        CustomMethods.enterText(driver,nameField,name);

        CustomMethods.click(driver,genderField);
        CustomMethods.enterText(driver,searchGenderField, gender);
        actions.sendKeys(Keys.ENTER).perform();

        CustomMethods.enterText(driver,ageField,age);

        CustomMethods.click(driver,commissionField);
        CustomMethods.click(driver,selectionOfCommission);
        return this;
    }

    public SeatsPage clickProceedToCheckOutBtn() {
        CustomMethods.click(driver, proceedToCheckoutBtn);
        return this;
    }

}

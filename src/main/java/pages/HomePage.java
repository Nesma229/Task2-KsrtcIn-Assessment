package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utls.CustomMethods;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    private final By leavingFromField = By.xpath("//span[text()='Select Departure City']//parent::a");
    private final By  goingToField = By.xpath("//span[text()='Select Destination City']//parent::a");
    private final By searchField = By.xpath("//input[@placeholder=\"Search Your City Name\"]");

    private final By arrivalDateField = By.xpath("//input[@value='Sat, 28-Sep-2024']");
    private final By searchBusesBtn = By.xpath("//div[@id='submitSearch']");


    public HomePage fillLeavingFromAndGoingToFields1(String leavingFrom, String goingTo){
        Actions  actions = new Actions(driver);
        CustomMethods.click(driver,leavingFromField);
        CustomMethods.enterText(driver,searchField,leavingFrom);
        actions.sendKeys(Keys.ENTER).perform();

        CustomMethods.click(driver,goingToField);
        CustomMethods.enterTextFindDuplicationIndex(driver,searchField,1,goingTo);
        actions.sendKeys(Keys.ENTER).perform();
        return this;
    }

    public HomePage chooseArrivalDate() throws InterruptedException {
        Actions  actions = new Actions(driver);
        CustomMethods.click(driver, arrivalDateField);
        Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER).perform();
        return this;
    }

    public BusesPage clickSearchBuses() {
        CustomMethods.click(driver, searchBusesBtn);
        return new BusesPage(driver);
    }

}
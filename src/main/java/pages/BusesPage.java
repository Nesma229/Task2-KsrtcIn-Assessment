package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utls.CustomMethods;

public class BusesPage {
    private WebDriver driver;
    public BusesPage(WebDriver driver) {
        this.driver =driver;
    }



    private final By selectSeatsBtn = By.xpath("//div[@class='selectbutton']");



    public SeatsPage clickSelectSeatsBtn() {
        CustomMethods.click(driver, selectSeatsBtn);
        return new SeatsPage(driver);
    }

}

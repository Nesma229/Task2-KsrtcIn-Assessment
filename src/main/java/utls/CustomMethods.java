package utls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomMethods {


    public static WebElement findElementPresence(WebDriver driver, By locator){
        return wait(driver,10).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement findElementVisible(WebDriver driver, By locator ){

        return wait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void enterText(WebDriver driver, By locator , String text ){
        WebElement element = findElementVisible(driver,locator);
        element.clear();
        element.sendKeys(text);
    }

    public static void enterTextFindDuplicationIndex(WebDriver driver, By locator ,int index, String text ){
        WebElement element = findDuplicationIndex(driver,locator,index);
        element.clear();
        element.sendKeys(text);
    }

    public static void selectByVisibleText(WebDriver driver, By locator, String text){
        Select dropDownField = new Select(findElementVisible(driver,locator));
        dropDownField.selectByVisibleText(text);
    }

    public static WebElement findElementClickable(WebDriver driver, By locator){
        return wait(driver,20).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void click(WebDriver driver, By locator){
        findElementClickable(driver, locator).click();
    }

    public static WebElement findDuplicationIndex(WebDriver driver,By locator, int index){
        return  wait(driver,5).until(ExpectedConditions.visibilityOf(driver.findElements(locator).get(index)));
    }


    private static WebDriverWait wait(WebDriver driver, int timeOut){
        return new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    }


}

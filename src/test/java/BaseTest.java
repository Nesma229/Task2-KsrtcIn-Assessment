import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


        WebDriver driver;
        pages.HomePage homePage;


        @BeforeMethod
        public void setUp () {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/");

        homePage = new pages.HomePage(driver);

    }

//        @AfterMethod
//        public void tearDown () {
//
//        driver.quit();
//    }

}

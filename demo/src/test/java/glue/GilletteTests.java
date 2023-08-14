
package glue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;
// import io.cucumber.java.After;
// import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import runner.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class GilletteTests {
    private WebDriver driver;
    ExtentReports reporter;
    ExtentSparkReporter sparkReporter;
    Homepage homePage = new Homepage();
    Base base = new Base();
    Logger log = LoggerHandler.log;
    Homepage homepage = new Homepage();

    @Before
    public void setUp() throws MalformedURLException {
        // Set up ChromeDriver path
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create ChromeDriver instance
        // driver = new ChromeDriver();
        driver = base.openBrowser();
        
        driver.manage().window().maximize();
        reporter = Reporter.generateExtentReport();
    }
    
    @Given("User searches for HP Pen Drive")
    public void user_searches_for_HP_Pen_Drive() {
        System.out.println("User searches for HP Pen Drive");
    }

    @When("Add the first result on the page with quantity {int}")
    public void add_the_first_result_on_the_page_with_quantity(Integer qty) {
        System.out.println("Add the first result with quantity: " + qty);
    }

    @Then("Cart should display {int} pen drive")
    public void cart_should_display_pen_drive(Integer qty) {
        System.out.println("Cart should display " + qty + " pen drive");
    }
    @After
    public void tearDown() {
        driver.quit();
        reporter.flush();
    }
}

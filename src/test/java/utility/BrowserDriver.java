package utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BrowserDriver {

    public static WebDriver driver;

    @After(order = 1)
    public void closebrowser()
    {
        driver.close();
        driver.quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario)
    {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
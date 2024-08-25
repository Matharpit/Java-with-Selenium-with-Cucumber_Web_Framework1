package pages;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static String main_menu = "//*[@id='menuToggle']//input";
    public static String signin_menu_option = "//*[@id='menu']//li[text()='Sign In Portal']";
    public static String username = "usr";
    public static String password = "pwd";
    public static String loginBtn = "//*[@type='submit' and @value='Login']";
    public static String exclusiveButton = "(//button[@type='button' and text()='Click here for Exclusive Collection'])[1]";

    public static void login_with_credentials() {
        driver.findElement(By.id(username)).sendKeys("aa");
        driver.findElement(By.id(password)).sendKeys("aa");
        driver.findElement(By.xpath(loginBtn)).click();
    }

    public static void verify_user_login() {
        Assert.assertTrue(driver.findElement(By.xpath(exclusiveButton)).isDisplayed());
    }
}

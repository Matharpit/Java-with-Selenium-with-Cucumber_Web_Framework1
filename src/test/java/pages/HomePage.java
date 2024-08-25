package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;
import utility.ReadPropfile;

import java.io.IOException;

public class HomePage extends BrowserDriver {
    public static String main_menu = "//*[@id='menuToggle']//input";
    public static String signin_menu_option = "//*[@id='menu']//li[text()='Sign In Portal']";
    static ReadPropfile rp = new ReadPropfile();

    public static void open_shoe_app_portal() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(rp.readvalue("testurl"));
      //  driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    public static void click_on_main_menu() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(main_menu)).click();
    }

    public static void click_on_signin_menuoption() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_menu_option)).click();
    }
}

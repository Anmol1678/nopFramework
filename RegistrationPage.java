package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Properties;

public class RegistrationPage {

    WebDriver driver;
    Properties prop;
    BasePage basePage;

    public void openbrowser() {
        BasePage basepage = new BasePage();
        prop = basePage.();
        String browser = prop.getProperty("Browser");
        driver.get(prop.getProperty("url"));

    }
}



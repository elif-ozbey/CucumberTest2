package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    static WebDriver driver;
    public static WebDriver getdriver()
    {
        if (driver == null)
        {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser)
            {
                case "chrome":
                    WebDriverManager.chromedriver();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
            WebDriverManager.chromedriver();
            driver = new ChromeDriver();
        }
        return  driver;
    }
    public  static  void closedriver()
    {
        if (driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }
}

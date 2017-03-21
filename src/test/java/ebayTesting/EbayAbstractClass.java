package ebayTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

/**
 * Created by Zakir_Mustafin on 3/20/2017.
 */
public abstract class EbayAbstractClass {
    protected static WebDriver driver;
    protected Logger logger;


    public EbayAbstractClass(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
        PageFactory.initElements(this.driver, this);
    }

    public static WebDriver getDriver() {
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    private static void setDriver() {
//         System.setProperty("webdriver.ie.driver", "C:\\Data\\For_grid\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//
//		 System.setProperty("webdriver.gecko.driver", "C:\\Data\\For_grid\\geckodriver.exe");
//        driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\For_grid\\chromedriver.exe");
//        driver = new ChromeDriver();
    }

    public static void close(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }
}

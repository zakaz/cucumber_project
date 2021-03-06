package ebayTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Zakir_Mustafin on 3/20/2017.
 */
public abstract class EbayAbstractClass {
    protected static WebDriver driver;
    protected static Logger logger;
//    protected static WebDriverWait wait;


    public EbayAbstractClass(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
    }

    public EbayAbstractClass(){
        PageFactory.initElements(this.driver, this);
    }

    public static WebDriver getDriver() {
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    private static void setDriver() {
//         System.setProperty("webdriver.ie.driver", "src\\test\\java\\drivers\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
//
//		 System.setProperty("webdriver.gecko.driver", "src\\test\\java\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();

        //Win
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\drivers\\chromedriver.exe");
        //Linux
//        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\drivers\\chromedriver");
        driver = new ChromeDriver();
        logger = Logger.getLogger("1111111111");
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

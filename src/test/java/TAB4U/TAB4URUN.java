package TAB4U;
import java.awt.*;
import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB_OBJ_FUNC;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.Objects;
public class TAB4URUN {
    private static WebDriver driver = null;
    static ExtentReports extent;
    static ExtentTest test;
    static ExtentManager exm = new ExtentManager(driver);
    @BeforeClass(alwaysRun = true)
    public static void setUpBeforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        extent = ExtentManager.GetExtent();
        test = exm.createTest("name", "description");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tab4u.com//");
        Thread.sleep(2000);
    }
    @AfterClass(alwaysRun = true)
    public static void tearDownAfterClass() throws Exception {
        driver.quit();
        extent.flush();
    }
    @Test(priority = 1) //enabled = false)
    public static void SignIn() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC tablog = new TAB_OBJ_FUNC(driver);
        tablog.LOGIN();
        tablog.ProfBtnClick();
        tablog.ProfPage();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("LoginTest");
        if (Objects.equals(URL, "https://www.tab4u.com/profile.php?id=2534522")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public static void logobtn() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC tablog = new TAB_OBJ_FUNC(driver);
        tablog.logobtn();
        String URL = driver.getCurrentUrl();
        test.info("Logo Button Url Test");
        if (Objects.equals(URL, "https://www.tab4u.com/")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public static void LogOut() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC LogOut = new TAB_OBJ_FUNC(driver);
        LogOut.LOGOUT();
        String URL = driver.getCurrentUrl();
        test.info("Log Out Test");
        if (Objects.equals(URL, "https://www.tab4u.com/")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(1000);
    }
 @Test(priority = 4)
    public static void ChangeToEnglish() throws InterruptedException,AWTException{
     TAB_OBJ_FUNC ENGLISH = new TAB_OBJ_FUNC(driver);
     ENGLISH.ENG();
     Thread.sleep(2000);
     String URL = driver.getCurrentUrl();
     test.info("ChangeToEnglish Test");
     if (Objects.equals(URL, "https://en.tab4u.com/index_en.php")) {
         test.pass("pass");
     } else {
         test.fail("fail");
     }
     test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
     Thread.sleep(2000);
 }
    @Test(priority = 5)
    public static void ChangeToHebrew() throws InterruptedException,AWTException{
        TAB_OBJ_FUNC HEBREW = new TAB_OBJ_FUNC(driver);
        HEBREW.HEB();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("ChangeToHebrew");
        if (Objects.equals(URL, "https://www.tab4u.com/")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }
}



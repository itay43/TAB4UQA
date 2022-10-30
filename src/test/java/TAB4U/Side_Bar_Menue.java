package TAB4U;

import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB2_OBJ_FUNC;
import TAB4U.Objfunc.TAB_OBJ_FUNC;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Objects;
public class Side_Bar_Menue  {
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
    @Test (priority = 1)
    public static void  TavimLeshirim() throws InterruptedException{
        TAB2_OBJ_FUNC TavimBtn = new TAB2_OBJ_FUNC(driver);
        TavimBtn.TavimLeBtnClick();
        Thread.sleep(4000);
        String URL = driver.getCurrentUrl();
        test.info("Tavim Button Test");
        if (Objects.equals(URL, "https://www.tab4u.com/last100Notes.php")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }
    @Test(priority = 2 )
    public static void BakeshTavim() throws InterruptedException{
        TAB_OBJ_FUNC login = new TAB_OBJ_FUNC(driver);
        login.LOGIN();
        TAB2_OBJ_FUNC Tavim = new TAB2_OBJ_FUNC(driver);
        Tavim.BakeshButton();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("Bakesh Tavim Btn Lead To Page Test");
        if (Objects.equals(URL, "https://www.tab4u.com/notes.php")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public static void HosefTav()throws InterruptedException{
        TAB2_OBJ_FUNC Tavim = new TAB2_OBJ_FUNC(driver);
        Tavim.HosefT();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("Hosef Tavim Btn Lead To Page Test");
        if (Objects.equals(URL, "https://www.tab4u.com/missingSongsASked.php")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
    }
@Test (priority = 4)
    public static void TavimByTime()throws InterruptedException{
    TAB2_OBJ_FUNC Tavim = new TAB2_OBJ_FUNC(driver);
    Tavim.TavByTime();
    Thread.sleep(2000);
    String URL = driver.getCurrentUrl();
    test.info("Tavim By Time Btn Lead To Page Test");
    if (Objects.equals(URL, "https://www.tab4u.com/last100Notes.php?ob=0")) {
        test.pass("pass");
    } else {
        test.fail("fail");
    }
    test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
}
    @Test (priority = 5)
    public static void TavimByPrice()throws InterruptedException {
        TAB2_OBJ_FUNC Tavim = new TAB2_OBJ_FUNC(driver);
        Tavim.TavByPrice();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("Tavim By Price Btn Lead To Page Test");
        if (Objects.equals(URL, "https://www.tab4u.com/last100Notes.php?ob=1")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
    }
    @Test (priority = 6)
    public static void TavimByAbc()throws InterruptedException {
        TAB2_OBJ_FUNC Tavim = new TAB2_OBJ_FUNC(driver);
        Tavim.TavByAbc();
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        test.info("Tavim By ABC Btn Lead To Page Test");
        if (Objects.equals(URL, "https://www.tab4u.com/last100Notes.php?ob=2")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
    }
}

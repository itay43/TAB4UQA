package TAB4U;

import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB2_OBJ_FUNC;
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


}

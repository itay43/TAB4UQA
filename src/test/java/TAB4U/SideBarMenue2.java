package TAB4U;
import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB3_OBJ_FUNC;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import TAB4U.Objfunc.TAB_OBJ_FUNC;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
public class SideBarMenue2 {
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

    @Test(priority = 1)
    public static void CoachersPageGuitarLesson() throws InterruptedException, IOException {
        //   TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        // logo.logobtn();
        TAB3_OBJ_FUNC coachclick = new TAB3_OBJ_FUNC(driver);
        coachclick.CoachPageGuitarLess();
        test.info("Guitar Lesson Page Link Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/guitar")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Guitar Lesson Page.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Guitar Lesson Page.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 2)
    public static void StrummingPage() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB3_OBJ_FUNC strum = new TAB3_OBJ_FUNC(driver);
        strum.StrumingPage();
        test.info(" Strumming Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/strummings.php")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Strumming Page.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Strumming Page.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 3)
    public static void BassGuitar() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB3_OBJ_FUNC bass = new TAB3_OBJ_FUNC(driver);
        bass.Bassguitar();
        test.info("Bass Guitar Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/bass_guitar")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Bass Guitar Page.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Bass Guitar Page.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 4)
    public static void DrumsPage() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB3_OBJ_FUNC Drums = new TAB3_OBJ_FUNC(driver);
        Drums.Drumas();
        Thread.sleep(2000);
        test.info("Drums Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/drums")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Drums Page Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Drums Page Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 5)
    public static void TrumpetPage() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB3_OBJ_FUNC Trumpet = new TAB3_OBJ_FUNC(driver);
        Trumpet.Trumpetpage();
        Thread.sleep(2000);
        test.info("Trumpet Page Test");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/trumpet")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Trumpet Page Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Trumpet Page Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 6)
    public static void VocalsPage() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB3_OBJ_FUNC Vocal = new TAB3_OBJ_FUNC(driver);
        Vocal.Vocalspage();
        Thread.sleep(2000);
        test.info("Vocals Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/vocal")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Vocals Page Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Vocals Page Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 7)
    public static void OtherPlayrsLastcConection() throws InterruptedException, IOException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB_OBJ_FUNC tablog = new TAB_OBJ_FUNC(driver);
        tablog.LOGIN();
        TAB3_OBJ_FUNC Others = new TAB3_OBJ_FUNC(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        Others.OtherplayresLastconection();
        js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        test.info("Other Playrs Last Conection Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/players?ref=1")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Other Playrs Last Conection Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Other Playrs Last Conection Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 8, dependsOnMethods = "OtherPlayrsLastcConection")
    public static void SignByDatePage() throws InterruptedException, IOException {
        TAB3_OBJ_FUNC Bydate = new TAB3_OBJ_FUNC(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Bydate.SighnDate();
        js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        test.info("Sign By Date Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/players?ref=1")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Sign By Date Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Sign By Date Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 9, dependsOnMethods = "OtherPlayrsLastcConection")
    public static void ByBirthdayPage() throws InterruptedException, IOException {
        TAB3_OBJ_FUNC birth = new TAB3_OBJ_FUNC(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        birth.ByBirth();
        js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        test.info("By Birthday Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/players?ref=1")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\By Birthday Page Test.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\By Birthday Page Test.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }


}



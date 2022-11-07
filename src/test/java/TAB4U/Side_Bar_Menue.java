package TAB4U;
import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB2_OBJ_FUNC;
import TAB4U.Objfunc.TAB_OBJ_FUNC;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
public class Side_Bar_Menue {
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
    public static void TavimLeshirim() throws InterruptedException {
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
    @Test(priority = 2)
    public static void BakeshTavim() throws InterruptedException {
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
    public static void HosefTav() throws InterruptedException {
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
    @Test(priority = 4)
    public static void TavimByTime() throws InterruptedException {

        TAB_OBJ_FUNC Tav = new TAB_OBJ_FUNC(driver);
        Tav.logobtn();
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
    @Test(priority = 5)
    public static void TavimByPrice() throws InterruptedException {
        TAB_OBJ_FUNC Tav = new TAB_OBJ_FUNC(driver);
        Tav.logobtn();
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
    @Test(priority = 6)
    public static void TavimByAbc() throws InterruptedException {
        TAB_OBJ_FUNC Tav = new TAB_OBJ_FUNC(driver);
        Tav.logobtn();
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
    @Test(priority = 7)
    public static void ShmiaMusikalitPage() throws InterruptedException, IOException {
        TAB_OBJ_FUNC Tune = new TAB_OBJ_FUNC(driver);
        Tune.logobtn();
        TAB2_OBJ_FUNC Tuner = new TAB2_OBJ_FUNC(driver);
        Tuner.GtrTune();
        Thread.sleep(1000);
        String URL = driver.getCurrentUrl();
        test.info("Shmia Musikalit Article Page Test");
        if (Objects.equals(URL, "https://www.tab4u.com/articles/49_article.html?id=49")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Shmia Musikalit.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Shmia Musikalit.png"));
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }
    @Test(priority = 8)
    public static void Tuner() throws InterruptedException, IOException, ATUTestRecorderException {
        ATUTestRecorder recorder = new ATUTestRecorder ("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Video Recording","Tuner Video",true);
        recorder.start();
        TAB_OBJ_FUNC Tune = new TAB_OBJ_FUNC(driver);
        Tune.logobtn();
        Thread.sleep(1000);
        TAB2_OBJ_FUNC tuner = new TAB2_OBJ_FUNC(driver);
        tuner.Tune();
        test.info("Tuner Test - video with sound is in the project library");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/tuner")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        recorder.stop();
    }
    @Test(priority = 9)
    public static void ChordsDictionary() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB2_OBJ_FUNC ChorDir = new TAB2_OBJ_FUNC(driver);
        ChorDir.ChordsDir();
        test.info("Chords Dictionary Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/chords_dictionary")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }
    @Test(priority = 10, dependsOnMethods = "ChordsDictionary")
    public static void ChordsDictionaryForGtr() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB2_OBJ_FUNC ChorDirgtr = new TAB2_OBJ_FUNC(driver);
        ChorDirgtr.ChordsDirGtr();
        test.info("Guitar Chords Dictionary Test (screenshot of chord D9 on proj folder too)");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryForGtr.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryForGtr.png"));
            test.pass("Pass");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            test.fail("Fail");
        }
    }
    @Test(priority = 11, dependsOnMethods = "ChordsDictionary")
    public static void ChordsDictionaryForPiano() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB2_OBJ_FUNC ChorDirPian = new TAB2_OBJ_FUNC(driver);
        ChorDirPian.ChordsDirPiano();
        test.info("Piano Chords Dictionary Test (screenshot of chord D aug on proj folder too)");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryFor Piano Chord d aug.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryFor Piano Chord d aug.png"));
            test.pass("Pass");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            test.fail("Fail");
        }
    }
    @Test(priority = 12, dependsOnMethods = "ChordsDictionary")
    public static void ChordsDictionaryForUkulele() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB2_OBJ_FUNC ChorDirUkulele = new TAB2_OBJ_FUNC(driver);
        ChorDirUkulele.ChordsDirUkulele();
        test.info("Ukulele Chords Dictionary Test (screenshot of chord Dm on proj folder too)");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryFor Ukulele Chord Dm aug.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\ChordsDictionaryFor Ukulele Chord Dm aug.png"));
            test.pass("Pass");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            test.fail("Fail");
        }
    }
    @Test(priority = 13)
    public static void ChordsVideoTutorialPage() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        TAB2_OBJ_FUNC ChorDir = new TAB2_OBJ_FUNC(driver);
        ChorDir.Chordstutorialpage();
        test.info("Chords Tutorial Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/25_article.html?id=25")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Chords Video Tutorial Page.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\Chords Video Tutorial Page.png"));

            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        logo.logobtn();
        Thread.sleep(1000);
        TAB_OBJ_FUNC logout = new TAB_OBJ_FUNC(driver);
        logout.LOGOUT();
    }
    @Test(priority = 14)
    public static void Mysongs() throws InterruptedException, IOException, ATUTestRecorderException {
     TAB_OBJ_FUNC login = new TAB_OBJ_FUNC(driver);
     login.LOGIN();
     Thread.sleep(1000);
        TAB2_OBJ_FUNC mysong = new TAB2_OBJ_FUNC(driver);
        mysong.mysongs();
        test.info("My Songs Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/my_songs.php")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }
    @Test(priority = 15, dependsOnMethods = "Mysongs")
    public static void Premium() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        TAB2_OBJ_FUNC premium = new TAB2_OBJ_FUNC(driver);
        premium.Prem();
        Thread.sleep(1000);
        test.info("Premium Page Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/premium.php?source=10")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }
    @Test(priority = 16, dependsOnMethods = "Mysongs")
    public static void ChordsBook() throws InterruptedException, IOException, ATUTestRecorderException {
        TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
        logo.logobtn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
        TAB2_OBJ_FUNC bookchords = new TAB2_OBJ_FUNC(driver);
        bookchords.ChordBookClick();
        Thread.sleep(2000);
        test.info("Chords Book Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/articles/chordsbook")) {
            test.pass("pass");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

}

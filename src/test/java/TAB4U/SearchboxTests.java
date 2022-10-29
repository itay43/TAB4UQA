package TAB4U;
import java.awt.*;
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
public class SearchboxTests {
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
    public static void searchBox() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC Search = new TAB_OBJ_FUNC(driver);
        Search.SearchBox("משינה");
        Search.SearchBtn();
        String SRS = Search.SearchResults();
        test.info("Search Box Result Test");
        if (Objects.equals(SRS, "משינה")) {
            test.pass("pass");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        } else {
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
        Search.SearchBoxClear();
    }

    @Test(priority = 2)
    public static void SrcBoxSuj() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC tablog = new TAB_OBJ_FUNC(driver);
        tablog.SRCCLICK();
        Thread.sleep(1000);
        tablog.SRCSUJCLICK();
        Thread.sleep(3000);
        tablog.SearchBtn();
        Thread.sleep(3000);
        String URL = driver.getCurrentUrl();
        test.info("Pick from search box suggestion Test");
        if (Objects.equals(URL, "https://www.tab4u.com/resultsSimple?tab=songs&q=%D7%A9%D7%9C%D7%9E%D7%94+%D7%90%D7%A8%D7%A6%D7%99&content=&max_chords=0")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public static void SearchMenueButton() throws InterruptedException, AWTException, IOException {
        TAB_OBJ_FUNC SrcMenBtn = new TAB_OBJ_FUNC(driver);
        SrcMenBtn.searchmenue();
        Thread.sleep(2000);
        test.info("Locate Menu Button");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchMenueButton.png"));
            test.pass("pass");
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
            test.fail("fail");
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        }
    }

    @Test(priority = 4, dependsOnMethods = {"SearchMenueButton"})
    public static void SearchBySingerLyricsAndChords() throws InterruptedException, AWTException {
        TAB_OBJ_FUNC SrcMenSinger = new TAB_OBJ_FUNC(driver);
        SrcMenSinger.SrcBySingerLyricsChordsNum();
        String URL = driver.getCurrentUrl();
        test.info("Search By Singer, Lyrics, And Chords Test");
        if (Objects.equals(URL, "https://www.tab4u.com/resultsSimple?tab=songs&q=%D7%90%D7%A8%D7%99%D7%A7+%D7%90%D7%99%D7%99%D7%A0%D7%A9%D7%98%D7%99%D7%99%D7%9F&content=lyrics&max_chords=5")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
        Thread.sleep(2000);
    }

    @Test(priority = 5, dependsOnMethods = {"SearchMenueButton"})
    public static void SearchTeacher() throws InterruptedException, AWTException, IOException {
        TAB_OBJ_FUNC SearchTeach = new TAB_OBJ_FUNC(driver);
        SearchTeach.SrcTeach();
        test.info("Search Teacher Test");
        String URL = driver.getCurrentUrl();
        if (Objects.equals(URL, "https://www.tab4u.com/teacherSearch.php?inst=2&city=%D7%91%D7%90%D7%A8+%D7%A9%D7%91%D7%A2")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        Thread.sleep(1000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchTeacher.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchTeacher.png"));
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            Thread.sleep(2000);
        }
    }

    @Test(priority = 6, dependsOnMethods = {"SearchMenueButton"})

    public static void SearchLuchot() throws InterruptedException, IOException {
        TAB_OBJ_FUNC SearchLuc = new TAB_OBJ_FUNC(driver);
        SearchLuc.SrcLuchot();
        String URL = driver.getCurrentUrl();
        test.info("Luchot Mechirot Electric Guitar Search Test");
        if (Objects.equals(URL, "https://www.tab4u.com/boards/sale/?cat=6")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchLuchotElectricGuitar.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchLuchotElectricGuitar.png"));
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            Thread.sleep(2000);
        }
    }
    @Test(priority = 7)
    public static void SearchLMishtamshim() throws InterruptedException, IOException {
        TAB_OBJ_FUNC SearchMish = new TAB_OBJ_FUNC(driver);
        SearchMish.Mishtamshim();
        String URL = driver.getCurrentUrl();
        test.info("Test - Search Users By (man, age 25-30, with picture )");
        if (Objects.equals(URL, "https://www.tab4u.com/players.php?fromS=1&photoOnly=on&gender=1&fromAge=25&toAge=30&area%5B%5D=0&city=&av%5B%5D=0&purpose%5B%5D=0&state%5B%5D=0")) {
            test.pass("pass");
        } else {
            test.fail("fail");
        }
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchUsers.png"));
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\Screenshots\\SearchUsers.png"));
        } catch (
                IOException e) {
            test.addScreenCaptureFromPath("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS");
            Thread.sleep(2000);
        }
    }
}





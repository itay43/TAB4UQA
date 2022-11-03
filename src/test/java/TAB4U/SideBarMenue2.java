package TAB4U;
import TAB4U.ConfigFiles.ExtentManager;
import TAB4U.Objfunc.TAB3_OBJ_FUNC;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
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
public class SideBarMenue2  {
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
        public static void CoachersPageGuitarLesson () throws InterruptedException, IOException {
            TAB_OBJ_FUNC logo = new TAB_OBJ_FUNC(driver);
            logo.logobtn();
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
            public static void StrummingPage () throws InterruptedException, IOException {
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
              public static void BassGuitar () throws InterruptedException, IOException {
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
          }


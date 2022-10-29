package TAB4U.ConfigFiles;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.awt.AWTException;
public class ExtentManager {
    public static WebDriver driver;
   public  ExtentManager(WebDriver driver) {
       ExtentManager.driver = driver;
    }
    public static ExtentReports extent;
    static ExtentTest test;
    public static ExtentSparkReporter htmlReporter;
    static DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    static Date today = Calendar.getInstance().getTime();
    static String reportDate = df.format(today);
    public static String filePath = "C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS\\REPORTS" + reportDate + "\\exReport.html";
    public static ExtentReports GetExtent() {
        new File("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS\\REPORTS" + reportDate).mkdirs();
        if (extent != null)
            return extent;
        extent = new ExtentReports();
        extent.attachReporter(getHtmlReporter());
        return extent;
    }
    public static ExtentTest createTest(String name, String description){
        test = extent.createTest (name,description);
        return test;
    }
    public static ExtentSparkReporter getHtmlReporter() {
        htmlReporter = new ExtentSparkReporter (filePath);
        htmlReporter.config ().setDocumentTitle("QAV automation report");
        htmlReporter.config ().setReportName("Regression cycle");
        return htmlReporter ;
    }
   public static String CaptureScreen( WebDriver driver ) throws AWTException, IOException {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("ddHHmmss"));
        String folderPath = ("C:\\Users\\itay\\Desktop\\TAB4U AUTO PROJ\\REPORTS" + reportDate);
        String imagePath = folderPath + "/pic" + time + ".jpg";
        TakesScreenshot oScn = (TakesScreenshot) driver;
        File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
        File oDest = new File(imagePath);
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, oDest);
        return imagePath;
    }
}

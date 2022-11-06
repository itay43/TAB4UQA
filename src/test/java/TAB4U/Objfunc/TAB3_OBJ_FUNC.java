package TAB4U.Objfunc;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class TAB3_OBJ_FUNC {
    WebDriver driver = null;
By Coachclick = By.xpath("//*[@id=\"rightPCMenu\"]/div[10]/a");
By Guitarless = By.xpath("//*[@id=\"intrumentsMenu\"]/div[1]/a");
By strum = By.xpath("//*[@id=\"intrumentsMenu\"]/div[2]/a");
By bass = By.xpath("//*[@id=\"intrumentsMenu\"]/div[3]/a");
By drumsclick = By.xpath("//*[@id=\"intrumentsMenu\"]/div[4]/a");
By trumpet = By.partialLinkText("לימוד חצוצרה");
By vocals = By.xpath("//*[@id=\"intrumentsMenu\"]/div[6]/a");
By others = By.xpath("//*[@id=\"usersRight\"]/a");
By signdate = By.xpath("//*[@id=\"byArea\"]/a[2]");
By birthday = By.xpath("//*[@id=\"byArea\"]/a[3]");
By randomclick = By.xpath("//*[@id=\"randomSong\"]");
By songbycat = By.xpath("//*[@id=\"sidebar\"]/div[3]/ul[3]/li[11]/a");
By mostview = By.partialLinkText("הנצפים ביותר");
By mostrated = By.partialLinkText("המדורגים ביותר");
By mostnew = By.partialLinkText("שירים חדשים");
    public TAB3_OBJ_FUNC(WebDriver driver) {
        this.driver = driver;
    }
    public void CoachPageGuitarLess() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        driver.findElement(Guitarless).click();
    }
    public void StrumingPage() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        driver.findElement(strum).click();
    }
    public void Bassguitar() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        driver.findElement(bass).click();
    }
    public void Drumas() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        driver.findElement(drumsclick).click();
    }
    public void Trumpetpage() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        driver.findElement(trumpet).click();
    }
    public void Vocalspage() throws InterruptedException{
        driver.findElement(Coachclick).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
        driver.findElement(vocals).click();
    }
    public void OtherplayresLastconection() throws InterruptedException{
        driver.findElement(others).click();
        Thread.sleep(1000);
    }
    public void SighnDate() throws InterruptedException{
        driver.findElement(signdate).click();
        Thread.sleep(1000);
    }
    public void ByBirth() throws InterruptedException{
        driver.findElement(birthday).click();
        Thread.sleep(1000);
    }
    public void randomsong ()throws InterruptedException{
        driver.findElement(randomclick).click();
    Thread.sleep(1000);
    }
    public void songbycategory ()throws InterruptedException{
        driver.findElement(songbycat).click();
        Thread.sleep(1000);
    }
    public void Mostview ()throws InterruptedException{
        driver.findElement(mostview).click();
        Thread.sleep(1000);
    }
    public void Mosrated ()throws InterruptedException{
        driver.findElement(mostrated).click();
        Thread.sleep(1000);
    }
    public void Mostnew () throws InterruptedException{
        driver.findElement(mostnew).click();
        Thread.sleep(1000);
    }
}

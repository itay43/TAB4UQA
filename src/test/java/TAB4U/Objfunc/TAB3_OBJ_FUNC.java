package TAB4U.Objfunc;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TAB3_OBJ_FUNC {
    WebDriver driver = null;
    By Coachclick = By.ByCssSelector.cssSelector("body.notLogin.rtl:nth-child(2) div.lang_HE:nth-child(2) div.row2.content_frame_borders:nth-child(2) aside:nth-child(14) div:nth-child(1) div:nth-child(1) div.pcMenuUnit:nth-child(10) > a.mLink");
  By Guitarless = By.xpath("//*[@id=\"intrumentsMenu\"]/div[1]/a");
By strum = By.xpath("//*[@id=\"intrumentsMenu\"]/div[2]/a");
By bass = By.xpath("//*[@id=\"intrumentsMenu\"]/div[3]/a");

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












}

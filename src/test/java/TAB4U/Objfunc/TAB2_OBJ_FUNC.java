package TAB4U.Objfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TAB2_OBJ_FUNC {
    WebDriver driver = null;
    By TavimBtn = By.xpath("//*[@id=\"rightPCMenu\"]/div[1]/a");
    By BakeshBtn = By.xpath("//*[@id=\"topLinksNotes\"]/a[2]");
    By Hosef = By.xpath("//*[@id=\"topLinksNotes\"]/a[1]");
    By TavTime = By.xpath("//*[@id=\"orderByDiv\"]/a[1]");
    By TavPrice = By.xpath("//*[@id=\"orderByDiv\"]/a[2]");
    By TavAbc = By.xpath("//*[@id=\"orderByDiv\"]/a[3]");
    public TAB2_OBJ_FUNC(WebDriver driver) {
        this.driver = driver;
    }
    public void TavimLeBtnClick() {
        driver.findElement(TavimBtn).click();
    }
    public void BakeshButton() throws InterruptedException {
        driver.findElement(TavimBtn).click();
        Thread.sleep(3000);
        driver.findElement(BakeshBtn).click();
        Thread.sleep(1000);
    }
    public void HosefT() throws InterruptedException {
        driver.findElement(TavimBtn).click();
        Thread.sleep(1000);
        driver.findElement(Hosef).click();
    }
    public void TavByTime() throws InterruptedException {
        driver.findElement(TavimBtn).click();
        Thread.sleep(1000);
        driver.findElement(TavTime).click();
        Thread.sleep(1000);
    }
    public void TavByPrice() throws InterruptedException {
        driver.findElement(TavimBtn).click();
        Thread.sleep(1000);
        driver.findElement(TavPrice).click();
        Thread.sleep(1000);
    }
    public void TavByAbc() throws InterruptedException {
        driver.findElement(TavimBtn).click();
        Thread.sleep(1000);
        driver.findElement(TavAbc).click();
        Thread.sleep(1000);
    }
}
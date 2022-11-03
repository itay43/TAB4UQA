package TAB4U.Objfunc;
import org.apache.poi.ss.formula.functions.T;
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
    By GtrtuneBtn = By.xpath("//*[@id=\"rightPCMenu\"]/div[3]/a");
    By ShmiaLink = By.xpath("//*[@id=\"page_content\"]/div/div/div[2]/div/center/a");
    By estr = By.id("eStr");
    By bstr = By.id("BStr");
    By gstr = By.id("GStr");
    By dstr = By.id("DStr");
    By astr = By.id("AStr");
    By Estr = By.id("EStr");
    By Milchor = By.xpath("//*[@id=\"rightPCMenu\"]/div[4]/a");

    By gtrchor = By.xpath("//*[@id=\"rightPCMenu\"]/div[4]/a");

    By Chordd = By.xpath("//*[@id=\"chord_base\"]/option[6]");

    By chord9 = By.xpath("//*[@id=\"chord_addition\"]/option[7]");

    By Pianobtn = By.xpath("//*[@id=\"cdInTable1\"]/tbody/tr/td[2]/a");

    By Ukulele = By.xpath("//*[@id=\"cdInTable1\"]/tbody/tr/td[3]/a");

    By ChrdsTutorial = By.xpath("//*[@id=\"CDtable\"]/tbody/tr[2]/td/b/a");

    By mysongbtn = By.xpath("//*[@id=\"rightPCMenu\"]/div[5]/a");
    By Mysongs = By.xpath("//*[@id=\"mySongSideMenu\"]/a[1]");

    By prem = By.xpath("//*[@id=\"rightPCMenu\"]/div[6]/a");

    By chordbook = By.xpath("//*[@id=\"rightPCMenu\"]/div[9]/a/span/img");

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

    public void GtrTune() throws InterruptedException {
        driver.findElement(GtrtuneBtn).click();
        driver.findElement(ShmiaLink).click();
    }

    public void Tune() throws InterruptedException {
        driver.findElement(GtrtuneBtn).click();
        Thread.sleep(1000);
        driver.findElement(estr).click();
        Thread.sleep(1000);
        driver.findElement(bstr).click();
        Thread.sleep(1000);
        driver.findElement(gstr).click();
        Thread.sleep(1000);
        driver.findElement(dstr).click();
        Thread.sleep(1000);
        driver.findElement(astr).click();
        Thread.sleep(1000);
        driver.findElement(Estr).click();
        Thread.sleep(1000);
    }

    public void ChordsDir() throws InterruptedException {
        driver.findElement(Milchor).click();
        Thread.sleep(1000);
    }

    public void ChordsDirGtr() throws InterruptedException {
        driver.findElement(gtrchor).click();
        Thread.sleep(1000);
        driver.findElement(Chordd).click();
        Thread.sleep(1000);
        driver.findElement(chord9).click();
        Thread.sleep(1000);
    }

    public void ChordsDirPiano() throws InterruptedException {
        driver.findElement(Pianobtn).click();
        Thread.sleep(1000);
        driver.findElement(Chordd).click();
        Thread.sleep(1000);
        driver.findElement(chord9).click();
        Thread.sleep(1000);
    }
    public void ChordsDirUkulele() throws InterruptedException {
        driver.findElement(Ukulele).click();
        Thread.sleep(1000);
        driver.findElement(Chordd).click();
        Thread.sleep(1000);
        driver.findElement(chord9).click();
        Thread.sleep(1000);
    }
    public void Chordstutorialpage() throws InterruptedException {
        driver.findElement(Milchor).click();
        Thread.sleep(1000);
        driver.findElement(ChrdsTutorial).click();
        Thread.sleep(1000);
    }
    public void mysongs() throws InterruptedException {
        driver.findElement(mysongbtn).click();
        Thread.sleep(2000);
        driver.findElement(Mysongs).click();
        Thread.sleep(2000);
    }
    public void Prem () throws InterruptedException {driver.findElement(prem).click();
    }
    public void ChordBookClick() throws InterruptedException {driver.findElement(chordbook).click();
    }

}
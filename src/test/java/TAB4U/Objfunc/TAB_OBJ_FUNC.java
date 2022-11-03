package TAB4U.Objfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public  class  TAB_OBJ_FUNC {
    WebDriver driver = null;
    By signin_btn = By.xpath("//*[@id=\"user_menu\"]/li/a");
    By mail = By.id("username");
    By pass = By.id("password");
    By btnmailpass = By.id("loginButton1");
    By logo = By.xpath("//*[@id=\"logo\"]/img");
    By Srcbox = By.id("searchText");
    By SrcBtn = By.xpath("//*[@id=\"siteSearchForm\"]/div/input[2]");
    By profbtn = By.xpath("//*[@id=\"picOnTopA\"]");
    By Profpage = By.xpath("//*[@id=\"profileMenuA\"]/a[1]");
    By SrcRsSuj = By.xpath("//*[@id=\"ui-id-12\"]");
    By ProBtn = By.xpath("//*[@id=\"picOnTopA\"]");
    By LogOut = By.xpath("//*[@id=\"profileMenuA\"]/a[6]");
    By eng = By.xpath("//*[@id=\"lang_menu\"]/li[1]/a/img");
    By heb = By.xpath("//*[@id=\"lang_menu\"]/li[2]/a/img");
    By SrcMEN = By.xpath("//*[@id=\"extraMenuImg\"]");
    By SrcBYCat = By.xpath("//*[@id=\"siteSearchForm\"]/div/select[1]");
    By MilMeha = By.xpath("//*[@id=\"siteSearchForm\"]/div/select[1]/option[2]");
    By ChordsnumBtn = By.xpath("//*[@id=\"mc1\"]");
    By fivechords = By.xpath("//*[@id=\"mc1\"]/option[5]");
    By aman = By.xpath("//*[@id=\"site_search_menu\"]/li[4]/a/span");
    By cateacher = By.xpath("//*[@id=\"site_search_menu\"]/li[4]/a/span");
    By bass= By.xpath("//*[@id=\"category1\"]/option[3]");
    By town = By.id("user_from");
    By TeachFindBtn = By.xpath("//*[@id=\"teachForm\"]/input[2]");
By Luch = By.xpath("//*[@id=\"site_search_menu\"]/li[3]/a/span");

By lucSelc = By.id("boardsSelect");
By Sales = By.xpath("//*[@id=\"boardsSelect\"]/option[2]");

By SrclucotBtn = By.xpath("//*[@id=\"site_search_form_block\"]/div[3]/form/div/input[2]");

By SrcBoxLuchot = By.xpath("//*[@id=\"searchTextB\"]");

By elcguitar = By.xpath("//*[@id=\"page_content\"]/ul[2]/li[3]/a/span");
By Mish = By.xpath("//*[@id=\"site_search_menu\"]/li[5]/a/span");

By Photo = By.xpath("//*[@id=\"pOnlyArea\"]");
By gender = By.id("bp3");
By man = By.xpath("//*[@id=\"bp3\"]/option[2]");
By agebtn = By.id("bp4");
By age25 = By.xpath("//*[@id=\"bp4\"]/option[15]");

By ageoldbtn = By.id("bp5");
By age30 = By.xpath("//*[@id=\"bp5\"]/option[14]");

By mishsrcbtn = By.id("bP1");
    public TAB_OBJ_FUNC(WebDriver driver) {
        this.driver = driver;
    }
    public void LOGIN () {
        driver.findElement(signin_btn).click();
        driver.findElement(mail).sendKeys("30itay@gmail.com");
        driver.findElement(pass).sendKeys("123456");
        driver.findElement(btnmailpass).click();
        driver.findElement(logo).click();
    }
  /*  public void mailfill(String text) {
        driver.findElement(mail).sendKeys(text);
    }
    public void passfill(String text) {
        driver.findElement(pass).sendKeys(text);
    }
*/    public void btnclick() {
        driver.findElement(btnmailpass).click();
    }
    public void logobtn() {
        driver.findElement(logo).click();
    }
    public void SearchBox(String text) {
        driver.findElement(Srcbox).sendKeys(text);
    }
    public void SearchBtn() {
        driver.findElement(SrcBtn).click();
    }
    public String SearchResults() {
        By RstSrc = By.xpath("//*[@id=\"page_content\"]/div[2]/table/tbody/tr[2]/td[3]/a");
        String SRS = driver.findElement(RstSrc).getText();
        return SRS;
    }
    public void ProfBtnClick() {
        driver.findElement(profbtn).click();
    }
    public void ProfPage() {
        driver.findElement(Profpage).click();
    }
    public void SRCCLICK() {
        driver.findElement(Srcbox).click();
    }
    public void SRCSUJCLICK(){
        driver.findElement(SrcRsSuj).click();
    }

    public void  SearchBoxClear(){driver.findElement(Srcbox).clear();  }
public void LOGOUT() throws InterruptedException {
        driver.findElement(ProBtn).click();
    Thread.sleep(2000);
    driver.findElement(LogOut).click();
    Thread.sleep(1000);
}
public void ENG() throws InterruptedException{
    driver.findElement(eng).click();
}
    public void HEB() throws InterruptedException{
        driver.findElement(heb).click();
    }
    public void searchmenue() throws InterruptedException{
    driver.findElement(SrcMEN).click();
    }
    public void SrcBySingerLyricsChordsNum() throws  InterruptedException {

        driver.findElement(Srcbox).clear();
        driver.findElement(Srcbox).sendKeys("אריק איינשטיין");
        driver.findElement(SrcBYCat).click();
        driver.findElement(MilMeha).click();
        driver.findElement(ChordsnumBtn).click();
        driver.findElement(fivechords).click();
        driver.findElement(SrcBtn).click();
    }
    public void  SrcTeach () throws  InterruptedException{
    driver.findElement(logo).click();
        Thread.sleep(1000);
    driver.findElement(SrcMEN).click();
        Thread.sleep(3000);
    driver.findElement(cateacher).click();
    Thread.sleep(2000);
    driver.findElement(bass).click();
        Thread.sleep(2000);
        driver.findElement(town).click();
    driver.findElement(town).sendKeys("באר שבע");
    Thread.sleep(1000);
driver.findElement(TeachFindBtn).click();
        Thread.sleep(3000);
    }
public  void  SrcLuchot () throws InterruptedException{
    driver.findElement(logo).click();
    Thread.sleep(1000);
    driver.findElement(SrcMEN).click();
    Thread.sleep(1000);
    driver.findElement(Luch).click();
    Thread.sleep(1000);
    driver.findElement(SrcBoxLuchot).clear();
    driver.findElement(SrcBoxLuchot).sendKeys("גיטרה");
driver.findElement(lucSelc).click();
    Thread.sleep(1000);
    driver.findElement(Sales).click();
    Thread.sleep(1000);
    driver.findElement(SrclucotBtn).click();
    Thread.sleep(2000);

}

    public  void  Mishtamshim () throws InterruptedException{
        driver.findElement(signin_btn).click();
        driver.findElement(mail).sendKeys("30itay@gmail.com");
        driver.findElement(pass).sendKeys("123456");
        driver.findElement(btnmailpass).click();
        driver.findElement(logo).click();
        Thread.sleep(1000);
        driver.findElement(SrcMEN).click();
        Thread.sleep(2000);
        driver.findElement(Mish).click();
        Thread.sleep(2000);
        driver.findElement(Photo).click();
        Thread.sleep(2000);
driver.findElement(gender).click();
        Thread.sleep(1000);
driver.findElement(man).click();
        Thread.sleep(1000);
driver.findElement(agebtn).click();
        Thread.sleep(1000);
driver.findElement(age25).click();
        Thread.sleep(1000);
driver.findElement(ageoldbtn).click();
        Thread.sleep(1000);
driver.findElement(age30).click();
        Thread.sleep(1000);
driver.findElement(mishsrcbtn).click();
        Thread.sleep(3000);

    }

}
package TAB4U.Objfunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TAB2_OBJ_FUNC {
    WebDriver driver = null;
By TavimBtn = By.xpath("//*[@id=\"rightPCMenu\"]/div[1]/a");
    public TAB2_OBJ_FUNC(WebDriver driver) {
        this.driver = driver;
    }
public void TavimLeBtnClick (){
    driver.findElement(TavimBtn).click();
}

}

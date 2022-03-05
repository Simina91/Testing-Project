import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selenium extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement readMoreSelenium;

    public Selenium(WebDriver driver) {
        super(driver);
    }

    public String getReadMoreLearnSelenium() {
        return this.readMoreSelenium.getText();
    }

}

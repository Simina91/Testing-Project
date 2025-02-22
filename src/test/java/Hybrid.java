import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hybrid extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement readMoreHybrid;

    public Hybrid(WebDriver driver) {
        super(driver);
    }

    public String getHybridHeader() {
        return this.readMoreHybrid.getText();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPerson extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement readMoreInPerson;

    public InPerson(WebDriver driver) {
        super(driver);
    }

    public String getInPerson () {
        return this.readMoreInPerson.getText();
    }
}
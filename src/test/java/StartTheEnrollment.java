import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class StartTheEnrollment extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement startTheEnrollment;

    public StartTheEnrollment(WebDriver driver){
        super(driver);
    }

    public String getStartTheEnrollment() {
        return this.startTheEnrollment.getText();
    }
}

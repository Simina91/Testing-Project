import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HomePage extends PageObject {

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement NewsletterSubmit;
    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement ReturnOnTop;
    @FindBy(xpath ="/html/body/section[3]/div/div/div[1]/div/div/a" )
    private WebElement readMoreVirtual;
    @FindBy(xpath = "/html/body/h1")
    private WebElement Virtual;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreHybrid;
    @FindBy(xpath = "/html/body/h1")
    private WebElement Hybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionHeader;
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement questionAccordin;
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsHeader;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructor;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollemnt;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformations;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreInPerson;
    @FindBy(xpath = "/html/body/h1/html/body/h1")
    private WebElement inPerson;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreLearnSelenium;
    @FindBy(xpath = "/html/body/h1")
    private WebElement LearnSelenium;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement JohnDoeTwitter;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[1]")
    private WebElement JohnTwitter;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[2]/i")
    private WebElement JohnDoeFacebook;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div[1]/div[2]")
    private WebElement JohnFacebook;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[3]/i")
    private WebElement JohnDoeLinkedIn;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]/i")
    private WebElement JohnDoeInstagram;
    @FindBy(xpath = "/html/body/div[4]")
    private WebElement JohnInstagram;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[1]/i")
    private WebElement JaneDoeTwitter;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[1]/span")
    private WebElement JaneTwitter;
    @FindBy(xpath = "/html/body/section[1]/div/div/div/h1")
    private WebElement homepageHeader;



    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void ClickReturnOnTop() {
        Utils.scrollToElement(driver, ReturnOnTop);
        this.ReturnOnTop.click();
    }

    public void ClickOnVirtualReadMore() {
        Utils.scrollToElement(driver, virtualHeader);
        this.readMoreVirtual.click();

    }

    public void ClickOnHybridReadMore() {
        Utils.scrollToElement(driver, hybridHeader);
        this.readMoreHybrid.click();
    }

    public void ClickOnQuestion() {
        Utils.scrollToElement(driver, questionHeader);
        this.questionHeader.click();
    }

    public void ClickOnInstructors() {
        Utils.scrollToElement(driver,instructorsHeader);
        this.instructorsHeader.click();
    }

    public void ClickOnStartTheEnrollment() {
        this.startTheEnrollemnt.click();
    }

    public void ClickOnReadMoreInPerson() {
        Utils.scrollToElement(driver, hybridHeader);
        this.readMoreInPerson.click();
    }

    public void ClickOnReadMoreSelenium() {
        Utils.scrollToElement(driver, readMoreLearnSelenium);
        this.readMoreLearnSelenium.click();
    }

    public void ClickOnJohnDoe() {
        Utils.scrollToElement(driver,JohnDoeTwitter);
        this.JohnDoeTwitter.click();
    }

    public void ClickOnJohnDoeFacebook() {
        Utils.scrollToElement(driver, JohnDoeFacebook);
        this.JohnDoeFacebook.click();
    }

    public void ClickOnJohnDoeLinkedIn() {
        Utils.scrollToElement(driver, JohnDoeLinkedIn);
        this.JohnDoeLinkedIn.click();
    }

    public void ClickOnJohnDoeInstagram() {
        Utils.scrollToElement(driver, JohnDoeInstagram);
        this.JohnDoeInstagram.click();
    }

    public void ClickOnJaneDoeTwitter() {
        Utils.scrollToElement(driver, JaneDoeTwitter);
        this.JaneDoeTwitter.click();
    }

    public String getHomePageHeader() {
        return homepageHeader.getText();
    }

    public String getQuestionHeader() {
        return questionAccordin.getText();
    }

    public String getInstructorsHeader() {
        return instructor.getText();
    }

}

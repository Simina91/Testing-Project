import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();
    
    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Verify functionality for Return to top button in down page")
    public void VerifyDownPage() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickReturnOnTop();
        Assert.assertEquals(page.getHomePageHeader(), Constants.HOMEPAGE_HEADER);
    }

    @Test(testName = "Verify functionality for Read More in the Functional section")
    public void VerifyFunctionalSection() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnVirtualReadMore();
        Virtual form =new Virtual(driver);
        Assert.assertEquals(form.getVirtualHeader(), Constants.VIRTUAL);
    }

    @Test(testName = "Verify functonality for Read More in the Hybrid section")
    public void VerifyHybrid() {
        driver.get(Utils.BASE_URL);
        HomePage Page = new HomePage(driver);
        Page.ClickOnHybridReadMore();
        Hybrid form = new Hybrid(driver);
        Assert.assertEquals(form.getHybridHeader(),Constants.HYBRID);
    }

    @Test(testName = "Verify functionality for Question Accordin in navbar section")
    public void VerifyNavbar() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnQuestion();
        Assert.assertEquals(page.getQuestionHeader(), Constants.QUESTION_ACCORDIN );
    }

    @Test(testName = "Verify functionality for Instructors in Navbar section")
    public void VerifyNavBar() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnInstructors();
        Assert.assertEquals(page.getInstructorsHeader(), Constants.INSTRUCTORS );

    }

    @Test(testName = "Verify functionality for Start The Enrollment in Showcase section")
    public void VerifyShowcase() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnStartTheEnrollment();
        StartTheEnrollment form= new StartTheEnrollment(driver);
        Assert.assertEquals(form.getStartTheEnrollment(), Constants.START_THE_ENROLLMENT);
    }

    @Test(testName = "Verify functionality for Read More in Boxes section")
    public void VerifyBoxes() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnReadMoreInPerson();
        InPerson form = new InPerson(driver);
        Assert.assertEquals(form.getInPerson(), Constants.IN_PERSON);
    }

    @Test(testName = "Verify functionality for Read More in Learn Section")
    public void VerifyLearnSection() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnReadMoreSelenium();
        Selenium form = new Selenium(driver);
        Assert.assertEquals(form.getReadMoreLearnSelenium(), Constants.SELENIUM2);
    }

    @Test(testName = "Verify functionality for John Don Twitter's in Instructors section")
    public void VerifyInstructorsSectionJohn() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnJohnDoe();
        Assert.assertEquals(driver.getTitle(), Constants.TWITTER);
    }

    @Test(testName = "Verify functionality for John Doe Facebook's in Instructor section")
    public void VerifyInstructor() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnJohnDoeFacebook();
        Assert.assertEquals(driver.getTitle(), Constants.FACEBOOK);
    }

    @Test(testName = "Verify functionality for John Doe LinkedIn's in Instructors section")
    public void VerifyInstructors() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnJohnDoeLinkedIn();
        Assert.assertEquals(driver.getTitle(), Constants.LINKEDIN);
    }

    @Test(testName = "Verify functionality for John Doe LinkedIn's in Instructors section")
    public void VerifySection() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnJohnDoeInstagram();
        Assert.assertEquals(driver.getTitle(), Constants.INSTAGRAM);
    }

    @Test(testName = "Verify functionality for Jane Don Twitter's in Instructors section")
    public void VerifyInstructorsSection() {
        driver.get(Utils.BASE_URL);
        HomePage page = new HomePage(driver);
        page.ClickOnJaneDoeTwitter();
        Assert.assertEquals(driver.getTitle(), Constants.JANE_TWITTER);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}

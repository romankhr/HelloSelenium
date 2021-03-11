package HelloSelenium.GitLogin.pages;


import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeGitPage extends Page {

    protected RemoteWebDriver driver;
    private String logInLinkLocator = "//a[@class='HeaderMenu-link flex-shrink-0 no-underline mr-3']";

    public HomeGitPage(RemoteWebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public <T extends Page> T clickOnLogInLink(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(logInLinkLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

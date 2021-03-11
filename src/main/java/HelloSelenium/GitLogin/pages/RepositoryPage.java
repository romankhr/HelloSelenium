package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RepositoryPage extends Page {
    public RepositoryPage(RemoteWebDriver driver) {
        super(driver);
    }

    private String addReadmeLocator = "//a[contains(text(),'Add a README')]";
    private String settingsLocator = "//span[contains(text(),'Settings')]";
    private String signedInLocator = "//header/div[7]/details[1]/summary[1]";
    private String signOutLocator = "//button[contains(text(),'Sign out')]";

    public <T extends Page> T clickAddReadmeButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(addReadmeLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

    public <T extends Page> T clickSettingsButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(settingsLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

    public RepositoryPage clickSignedIn() {
        driver.findElement(By.xpath(signedInLocator)).click();
        return this;
    }

    public <T extends Page> T clickSignOut(Class<T> clazz) throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.xpath(signOutLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

}

package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CabinetGitPage extends Page {
    public CabinetGitPage(RemoteWebDriver driver) {
        super(driver);
    }
    private String newRepositoriesLocator="//body/div[4]/div[1]/aside[1]/div[2]/div[2]/div[1]/h2[1]/a[1]";

    public <T extends Page> T clickOnNewRepositoryButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(newRepositoriesLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

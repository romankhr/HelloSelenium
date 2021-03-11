package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsPage extends Page {
    public SettingsPage(RemoteWebDriver driver) {
        super(driver);
    }

    //Insert your account name
    private String accountName = "Account Name";
    private String nameRepositoryToDelete = accountName+"/TestRepository";

    private String deleteLocator = "//div[@class='Box Box--danger']/ul[1]/li[4]//summary[contains(text(),'Delete this repository')]";
    private String typeConfirmLocator = "//div[@class='Box-body overflow-auto']/form[1]/p[1]/input[1]";
    private String deleteConfirmLocator = "//button[@class='btn btn-block btn-danger']//span[contains(text(),'I understand the consequences, delete this reposit')]";


    public SettingsPage clickDelete() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(deleteLocator)).click();
        return this;
    }

    public SettingsPage typeConfirm() throws InterruptedException {
        driver.findElement(By.xpath(typeConfirmLocator)).sendKeys(nameRepositoryToDelete);
        Thread.sleep(1000);
        return this;
    }

    public <T extends Page> T clickConfirmDeleteButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(deleteConfirmLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

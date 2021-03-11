package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewRepositoryPage extends Page {
    public NewRepositoryPage(RemoteWebDriver driver) {
        super(driver);
    }

    private String repositoryNameLocator="//input[@id='repository_name']";
    private String REPOSITORY_NAME="TestRepository";
    private String addGitignoreLocator="//input[@id='repository_gitignore_template_toggle']";
    private String gitignoreTenplateLocator="//i[contains(text(),'.gitignore template:')]";
    private String filterGitignoreLocator="//span[contains(text(),'Java')]";
    private String gitignoreJava="Java";
    private String createRepositoryLocator="//button[contains(text(),'Create repository')]";

    public NewRepositoryPage setNameRepository() {
        driver.findElement(By.xpath(repositoryNameLocator)).sendKeys(REPOSITORY_NAME);
        return this;
    }
    public NewRepositoryPage checkGitignore(){
        driver.findElement(By.xpath(addGitignoreLocator)).click();
        return this;
    }
    public NewRepositoryPage clickGitignoreTemplate(){
        driver.findElement(By.xpath(gitignoreTenplateLocator)).click();
        return this;
    }
    public NewRepositoryPage gitignoreJava(){
        driver.findElement(By.xpath(filterGitignoreLocator)).click();
        return this;
    }
    public <T extends Page> T clickOnCreateButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(createRepositoryLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

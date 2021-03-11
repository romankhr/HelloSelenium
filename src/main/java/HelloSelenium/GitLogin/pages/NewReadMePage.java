package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewReadMePage extends  Page {
    public NewReadMePage(RemoteWebDriver driver) {
        super(driver);
    }
    private String editReadMeLocator="//pre[@class=' CodeMirror-line ']";
    private String textReadMe="My Test Repository";
    private String commentsLocator="//input[@id='commit-summary-input']";
    private String commentsReadMe="Add readme file";
    private  String commitButtonLocator="//button[@id='submit-file']";

    public NewReadMePage TypeText(){
        driver.findElement(By.xpath(editReadMeLocator)).clear();
        driver.findElement(By.xpath(editReadMeLocator)).sendKeys(textReadMe);
        return this;
    }
    public NewReadMePage commentsText(){
        driver.findElement(By.xpath(commentsLocator)).sendKeys(commentsReadMe);
        return this;
    }
    public <T extends Page> T clickCommitButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(commitButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

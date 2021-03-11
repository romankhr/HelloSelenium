package HelloSelenium.GitLogin.pages;

import HelloSelenium.GitLogin.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LogInFormPage extends Page {
    private String eMailLocator="//input[@id='login_field']";
    private String passwordLocator="//input[@id='password']";
    private String EMAIL="romankhr@yahoo.com";
    private String PASSWORD="Olgaolga2410";
    private String logInButtonLocator="//input[@class='btn btn-primary btn-block']";

    public LogInFormPage(RemoteWebDriver driver) {
        super(driver);
    }

            public LogInFormPage setEmail(){
            driver.findElement(By.xpath(eMailLocator)).sendKeys(EMAIL);
            return this;
        }

    public LogInFormPage setPassword(){
        driver.findElement(By.xpath(passwordLocator)).sendKeys(PASSWORD);
        return this;
    }

    public <T extends Page> T clickOnLogInButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(logInButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

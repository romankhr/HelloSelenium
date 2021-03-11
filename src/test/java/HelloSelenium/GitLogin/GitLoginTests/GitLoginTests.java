package HelloSelenium.GitLogin.GitLoginTests;

import HelloSelenium.GitLogin.BaseTest;
import HelloSelenium.GitLogin.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitLoginTests extends BaseTest {
    private HomeGitPage homePage;
    private CabinetGitPage cabinetGit;
    private RepositoryPage repositoryPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        homePage = new HomeGitPage(driver);
    }

    //   -----------------------------Test 1-----------------------------

    @Test(groups = "main", suiteName = "ui")
    public void gitLoginTest() throws Exception {

        homePage = homePage
                .clickOnLogInLink(LogInFormPage.class)
                .setEmail()
                .setPassword()
                .clickOnLogInButton(CabinetGitPage.class)
                .clickOnNewRepositoryButton(NewRepositoryPage.class)
                .setNameRepository()
                .checkGitignore()
                .clickGitignoreTemplate()
                .gitignoreJava()
                .clickOnCreateButton(RepositoryPage.class)
                .clickAddReadmeButton(NewReadMePage.class)
                .TypeText()
                .commentsText()
                .clickCommitButton(RepositoryPage.class)
                .clickSettingsButton(SettingsPage.class)
                .clickDelete()
                .typeConfirm()
                .clickConfirmDeleteButton(RepositoryPage.class)
                .clickSignedIn()
                .clickSignOut(HomeGitPage.class);

    }

}

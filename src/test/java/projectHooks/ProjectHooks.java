package projectHooks;

import UI.Driver;
import api.RequestManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.AlertMessage;
import pages.HomePage;
import pages.ProjectPage;

import java.util.List;
import java.util.Map;

public class ProjectHooks {
    public ProjectPage projectPage = new ProjectPage();
    public HomePage homePage;
    private static final String PROJECTS_ENDPOINT = "/projects/";
    private static final String ID_KEY = "id";

    @Before(value="@deleteAllProjects", order=1)
    public void deleteAllProject(){
        List<Map<String, ?>> projects = RequestManager.get(PROJECTS_ENDPOINT).jsonPath().get();
        for (Map<String, ?> object : projects) {
            RequestManager.delete(PROJECTS_ENDPOINT + object.get(ID_KEY).toString());
        }

    }
    @After("@goToHomePage")
    public void goToHomePage(){
        projectPage.clickOnPivotalLogo();
        }

    @After("@goToWelcomePage")
    public void goToWelcomePage(){
       Driver.getInstance().getWebDriver().get("https://www.pivotaltracker.com/dashboard");
       AlertMessage alertMessage = new AlertMessage();
       alertMessage.clickOKAlertMessage();
       homePage = new HomePage();
       homePage.waitHomePage();
    }
}

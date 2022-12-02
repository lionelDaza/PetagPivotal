package projectHooks;

import UI.Driver;
import UI.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.HomePage;
import pages.SignInPage;

public class LoginHooks {

    @After("@LogOut")
    public void  logOutFromHomePage(){
        HomePage.signOut();
    }

    @Before(value="@LoginSuccessfully", order=0)
    public void  logInSuccessfully(){
        String currentUrl = Driver.getInstance().getWebDriver().getCurrentUrl();
        if ("https://www.pivotaltracker.com/dashboard".equals(currentUrl)) {
            System.out.println("estamos en la pagina");
        }
        else
        {
            String user = Environment.getInstance().getUser();
            String password = Environment.getInstance().getPassWord();
            SignInPage singIn = new SignInPage();
            singIn.signInSuccessfully(user, password);
            }

    }
}

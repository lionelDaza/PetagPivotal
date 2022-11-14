package projectHooks;

import UI.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.SignInPage;

public class LoginHooks {

    @After("@LogOut")
    public void  logOutFromHomePage(){
        HomePage.signOut();
    }

    @Before("@LoginSuccessfully")
    public void  logInSuccessfully(){
        String user = Environment.getInstance().getUser();
        String password = Environment.getInstance().getPassWord();
        SignInPage singIn = new SignInPage();
        singIn.signInSuccessfully(user, password);
    }
}

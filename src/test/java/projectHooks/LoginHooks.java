package projectHooks;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import pages.SignInPage;

public class LoginHooks {

    @After("@LogOut")
    public void  logOutFromHomePage(){
        HomePage.signOut();
    }
}

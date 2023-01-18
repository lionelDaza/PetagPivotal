package projectHooks;

import UI.Driver;
import UI.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;


//mport org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;
import pages.SignInPage;

public class LoginHooks {

   static Logger logger = LoggerFactory.getLogger(LoginHooks.class);

    @After("@LogOut")
    public void  logOutFromHomePage(){
        HomePage.signOut();
        logger.info("Saliendo a la pagina de Logeo");
    }

    @Before(value="@LoginSuccessfully", order=0)
    public void  logInSuccessfully(){
        String currentUrl = Driver.getInstance().getWebDriver().getCurrentUrl();
        if ("https://www.pivotaltracker.com/dashboard".equals(currentUrl)) {
            logger.info("Login exitoso");
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

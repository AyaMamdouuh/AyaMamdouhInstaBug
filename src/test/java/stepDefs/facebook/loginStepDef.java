package stepDefs.facebook;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class loginStepDef extends base.Base {
    @Given("user open the browser")
    public void userOpenTheBrowser() {
        launchBrowser();
    }
    @Given("clear all cookies")
    public void clearAllCookies() {
        clearAllCookies();
    }
    @Given("user navigate to the url")
    public void userNavigateToTheUrl() {
        navigateToURL();
    }
}

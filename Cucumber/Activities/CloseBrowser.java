package stepDefinition;

import io.cucumber.java.en.Then;

public class CloseBrowser extends BaseClass{
    @Then("^Close the browser$")
    public void closeBrowser(){
        driver.quit();
    }
}

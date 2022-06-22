package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FirstTest extends BaseClass{

    @Given("^User is on Ts page$")
    public void openingTSPage() {
        driver.get("https://training-support.net");
        String pageTitle= driver.getTitle();

        Assert.assertEquals(pageTitle,"Training Support");
    }

        @When("^user clicks on about us button$")
                public void clickAboutUsButton(){
        driver.findElement(By.id("about-link")).click();
        }
        @Then("^User is redirected to the about us page$")
    public void pageRedirect(){
       String aboutUsPageTitle=driver.getTitle();
       Assert.assertEquals(aboutUsPageTitle,"About Training Support");

        }

}

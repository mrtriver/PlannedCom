package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static hooks.Hooks.driver;


public class US_001_HomePageStepDefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));

    HomePage homePage = new HomePage();


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        driver.get(ConfigurationReader.getProperty("base_url"));
    }

    @Then("user verifies Get availibility button is clickable")
    public void userVerifiesGetAvailibilityButtonIsClickable() {
        ReusableMethods.waitForClickablility(homePage.getAvailabilityButton,2).click();
        ReusableMethods.waitForClickablility(homePage.getAvailibilityAlertX,2).click();
        System.out.println("1st Point");
    }
    @Then("user verifies Save button is clickable")
    public void userVerifiesSaveButtonIsClickable() {
        ReusableMethods.waitForClickablility(homePage.saveEmotionButton,4).click();
        ReusableMethods.waitForClickablility(homePage.SaveEmotionClose,4).click();
        System.out.println("2st Point");
    }


    @When("user clicks show more, the page scrolls downs")
    public void userClicksShowMoreThePageScrollsDowns() {
        ReusableMethods.waitForClickablility(homePage.showMoreButton,2).click();

    }

    @Then("user verifies we guarantiee text is visible")
    public void userVerifiesWeGuarantieeTextIsVisible() {
        ReusableMethods.scrollToElement(homePage.showMoreButton);
        ReusableMethods.verifyElementDisplayed(homePage.weGuarantee);    //The Method is together with Assert
        System.out.println("3st Point");
    }

    @Then("user verifies Industrial Event text is visible")
    public void userVerifiesIndustrialEventTextIsVisible() {
    ReusableMethods.verifyElementDisplayed(homePage.industrialEventText);
    }

    @Then("user verifies Montreal, $$ and star rate is visible")
    public void userVerifiesMontreal$$AndStarRateIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.montrealText);
        ReusableMethods.verifyElementDisplayed(homePage.$$Text);

    }

}

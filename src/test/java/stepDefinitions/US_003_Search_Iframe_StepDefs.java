package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static hooks.Hooks.driver;

public class US_003_Search_Iframe_StepDefs {
    HomePage homePage = new HomePage();

    @Given("user goes to {string}")
    public void userGoesTo(String url) {
        driver.get(ConfigurationReader.getProperty(url));
    }

    @Then("user closes alerts on the bottom")
    public void userClosesAlertsOnTheBottom() {
//        ReusableMethods.waitFor(2);
        homePage.closeJoin.click();

    }

    @Then("user clicks on play button")
    public void userClicksOnPlayButton() {
        ReusableMethods.waitFor(2);
        driver.switchTo().frame(0);
        homePage.play.click();
    }
    @And("user clicks on fullscreen")
    public void userClicksOnFullscreen() {
        ReusableMethods.waitFor(2);
//        ReusableMethods.clickWithJS(homePage.fullScreen);
        homePage.fullScreen.click();
    }

    @Then("user clicks on the search icon")
    public void userClicksOnTheSearchIcon() {
       homePage.searchI.click();
    }

    @When("user verifies {string} is visible")
    public void userVerifiesIsVisible(String num) {
        WebElement element = driver.findElement(By.xpath("(//div[@class='accordion-item'])"+num));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @When("user verifies {string} is enabled")
    public void userVerifiesIsEnabled(String num) {
        ReusableMethods.waitFor(3);
        WebElement element = driver.findElement(By.xpath("(//div[@class='accordion-item' or @class='accordion-item accordion-item-selected'])"+num));
        ReusableMethods.verifyElementClickable(element);
        element.click();
        //ReusableMethods.waitFor(5);
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();


    }
    @When("user clicks dropdown")
    public void userClicksDropdown() {
       homePage.dropDownOpener.click();
    }

    @And("user verifies {string} option is visible")
    public void userVerifiesOptionIsVisible(String text) {
        WebElement element = driver.findElement(By.xpath("(//div[@data-value='" + text + "'])"));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @And("user clicks on {string} option")
    public void userClicksOnOption(String text) {
        WebElement element = driver.findElement(By.xpath("(//div[@data-value='" + text + "'])"));
        ReusableMethods.verifyElementClickable(element);
        element.click();
    }

    @And("user verifies close button is visible")
    public void userVerifiesCloseButtonIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.close);
    }

    @Then("user verifies close button is enabled")
    public void userVerifiesCloseButtonIsEnabled() {
        ReusableMethods.verifyElementClickable(homePage.close);
    }

    @Then("user closes search field")
    public void userClosesSearchField() {
     homePage.close.click();
    }

    @When("user clicks on searchbar")
    public void userClicksOnSearchbar() {
       homePage.searchBar.click();
    }

    @And("user enters {string} and result number is {string}")
    public void userEntersAndResultNumberIs(String search, String num) {
       homePage.searchBar.sendKeys(search);
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'" + num + " Item')]"));
        ReusableMethods.verifyElementDisplayed(element);
    }

    @And("user verifies searchbar is visible")
    public void userVerifiesSearchbarIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.searchBar);
    }

    @Then("user verifies searchbar is enabled")
    public void userVerifiesSearchbarIsEnabled() {
        ReusableMethods.verifyElementClickable(homePage.searchBar);
    }

}
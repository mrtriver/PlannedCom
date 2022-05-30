package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.time.Duration;
import static hooks.Hooks.driver;


public class US_002_ShowCasePlay_StepDefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
    HomePage homePage = new HomePage();


    @When("user clicks on the Show case play button")
    public void userClicksOnTheShowCasePlayButton() throws InterruptedException {
        WebElement iframe = homePage.showCaseIframe;      //Switch to IFRAME
        driver.switchTo().frame(iframe);
        homePage.showCasePlayButton.click();              //Button clicks
        Thread.sleep(300);
    }

    @Then("user verifies if the Show case plays")
    public void userVerifiesIfTheShowCasePlays() {          // //Verify Show Case Play
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.getPlayControl()));  //End of Background
    }


    @When("user clicks on exploreThreeD_Out icon")
    public void userClicksOnExploreThreeD_OutIcon() {
        ReusableMethods.clickWithJS(homePage.explore3DSpaceOut);
        System.out.println(" Fifth point");
    }

    @Then("user verifies if exploreThreeD_In icon is clickable")
    public void userVerifiesIfExploreThreeD_InIconIsClickable() {
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.explore3DSpaceIn));
    }


    @When("user clicks on View Floor Plan_In_button")
    public void userClicksOnViewFloorPlan_In_button() {
        ReusableMethods.clickWithJS(homePage.viewFloorPlanInButton);
    }


    @Then("user verifies if the View Floor_Out button is clickable")
    public void userVerifiesIfTheViewFloor_OutButtonIsClickable() {
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.viewFloorPlan_Out_Button));
    }

    @And("user clicks on floor icon")
    public void userClicksOnFloorIcon() {
        homePage.floorIcon.click();
    }

    @Then("user verifies floor icon is visible")
    public void userVerifiesFloorIconIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.floorIcon);
    }

    @And("user verifies floor icon is click-able")
    public void userVerifiesFloorIconIsClickAble() {
        ReusableMethods.verifyElementClickable(homePage.floorIcon);
    }

    @Then("user clicks on {string}")
    public void userClicksOn(String floor) {
        WebElement element = driver.findElement(By.xpath("(//div[contains(@class, 'floor-button') and contains(text(), '" + floor + "')])[1]"));
        ReusableMethods.scrollToElement(element);
        ReusableMethods.clickWithJS(element);
        ReusableMethods.waitFor(3);
    }
}

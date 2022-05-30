package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static hooks.Hooks.driver;

public class US_004_Share_This_Space_StepDefs {
    HomePage homePage = new HomePage();
    String copiedText = "";

    @And("user clicks on share icon")
    public void userClicksOnShareIcon() {
        ReusableMethods.clickWithJS(homePage.share);
    }

    @When("user verifies share icon is visible")
    public void userVerifiesShareIconIsVisible() {
        ReusableMethods.scrollToElement(homePage.share);
        ReusableMethods.verifyElementDisplayed(homePage.share);
    }

    @Then("user verifies share icon is clickable")
    public void userVerifiesShareIconIsClickable() {
        ReusableMethods.verifyElementClickable(homePage.share);
    }

    @When("user verifies close button in share is visible")
    public void userVerifiesCloseButtonInShareIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.shareClose);
    }

    @Then("user verifies close button in share is enabled")
    public void userVerifiesCloseButtonInShareIsEnabled() {
        ReusableMethods.verifyElementClickable(homePage.shareClose);
    }

    @When("user verifies Share text is visible")
    public void userVerifiesShareTextIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.shareText);
    }

    @Then("user verifies link text is visible")
    public void userVerifiesLinkTextIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.linkText);
    }

    @And("user verifies copy text is visible")
    public void userVerifiesCopyTextIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.copyText);
    }

    @And("user verifies checkbox text is visible")
    public void userVerifiesCheckboxTextIsVisible() {
        ReusableMethods.verifyElementDisplayed(homePage.checkboxText);
    }

    @Then("user checks visibility of {string} social media icon")
    public void userChecksVisibilityOfSocialMediaIcon(String smicon) {
        WebElement element = driver.findElement(By.xpath("//span[@class='" + smicon + "']"));
        ReusableMethods.scrollToElement(element);
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(element);
    }

    @Then("user checks click-ability of {string} social media icon")
    public void userChecksClickAbilityOfSocialMediaIcon(String smicon) {
        WebElement element = driver.findElement(By.xpath("//span[@class='" + smicon + "']"));
        ReusableMethods.scrollToElement(element);
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementClickable(element);
    }

    @When("user clicks on {string} icon")
    public void userClicksOnIcon(String smicon) {
        String firstWindowHandle = driver.getWindowHandle();

        WebElement element = driver.findElement(By.xpath("//span[@class='" + smicon + "']"));
        ReusableMethods.clickWithJS(element);

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    @Then("user closes popup")
    public void userClosesPopup() {
        ReusableMethods.waitFor(3);
        driver.close();
        ReusableMethods.waitFor(5);
    }

    @When("user clicks on the copy button")
    public void userClicksOnTheCopyButton() {
        copiedText = Driver.getDriver().findElement(By.cssSelector(".share-controls .input-group input")).getAttribute("value");
        homePage.copyButton.click();
    }

    @Then("user verifies copy button works")
    public void userVerifiesCopyButtonWorks() throws IOException, UnsupportedFlavorException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();

        String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
        System.out.println("String from Clipboard:" + actualCopedText);
        //Assert the copied text contains the expected text.
        Assert.assertTrue(actualCopedText.startsWith(copiedText));


    }
}










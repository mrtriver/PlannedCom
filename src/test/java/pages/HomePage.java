package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.security.cert.X509Certificate;

import static hooks.Hooks.driver;

public class HomePage extends BasePage {

    //############### USER STORY US_001 #####################
    @FindBy(xpath = "//button[contains(text(), 'Get availability')]")
    public WebElement getAvailabilityButton;

    @FindBy(css = "div.jss27")

    public WebElement getAvailibilityAlertX;


    @FindBy(css = "div.emotion-1c7syob button.emotion-1wdrlw4")                  //Save Emotion
    public WebElement saveEmotionButton;

    @FindBy (xpath = "//div[@class='jss27 MuiBox-root emotion-0']")
    public WebElement SaveEmotionClose;

    @FindBy (xpath = "//div[@class='MuiAlert-action emotion-1mzcepu']")
    public WebElement showMoreButton;

    @FindBy (xpath = "//strong[text()='We guarantee'] ")
    public WebElement weGuarantee;

    @FindBy (xpath = "//h5[contains(text(),'Industrial Event Venue near Griffintown')]")
    public WebElement industrialEventText;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container jss18 emotion-tzs92q' and contains(text(), 'Montreal')] ")
    public WebElement montrealText;

    @FindBy (xpath = "(//div[@class='MuiGrid-root MuiGrid-container jss18 emotion-tzs92q'])[1]")
    public WebElement $$Text;

    @FindBy (xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap emotion-a2e4ud']")
    public WebElement star;






    //############### USER STORY US_002 IFRAME #####################
    @FindBy(xpath = "//iframe[contains(@src,'matterport')]")                        //Iframe
    public WebElement showCaseIframe;

    @FindBy(css = "div#showcase-play")                                             // showcase play button
    public WebElement showCasePlayButton;


    private final By playControl = By.xpath("//div[@id='showcase-play' and @class='icon-play-unicode hidden']");
    public By getPlayControl() {
        return playControl;
    }


    @FindBy(xpath = "(//div[@aria-label='Share this Space' and @role='button'])[1]") // Share This Space button
    public WebElement shareThisSpaceButton;

    @FindBy (xpath = "//span[@class='icon icon-linkedin']")
    public WebElement linkedIn;

    //Explore 3D Space Out Button

    @FindBy (xpath = "(//div[@aria-label='View Dollhouse'])[1]")
    public WebElement explore3DSpaceOut;

    public By explore3DSpaceIn = By.xpath("(//div[@aria-label='Explore 3D Space'])[1]");  //Explore 3D Space IN

    @FindBy (xpath = "(//span[@class='icon icon-dollhouse'])[1]")                     //View Florr Plan In BUTTON
    public WebElement viewFloorPlanInButton;

    public By viewFloorPlan_Out_Button = By.xpath("(//span[@class='icon icon-floorplan'])[1]");  //View Floor Out
    // FLOOR SELECTOR

     @FindBy(xpath = "(//div[@class='floor-number'])[1]")     //Floor selector
     public WebElement floorSelectorButton;

     @FindBy(xpath = "(//div[contains(text(), 'Floor 3')])[2]")
     public WebElement floor3;                                //Floor 3

    @FindBy(xpath ="(//div[contains(text(), 'Floor 2')])[1]")  // Floor 2
    public WebElement floor2;

    @FindBy(xpath="//span[contains(@class,'icon icon-floor-controls')]")
    public WebElement floorIcon;









//  IFRAME SEARC US003 ##############################################


    @FindBy(xpath = "(//span[@class='icon icon-fullscreen'])[1]") // DIDN'T WORK: //div[@class='fullscreen-mode']
    public WebElement fullScreen;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium emotion-1kw0wo4']")
    public WebElement closeJoin;

    @FindBy(xpath = "//button[@class='intercom-14n7zlk e8hx9tm1']") //no need
    public WebElement clear;

    @FindBy(xpath = "//span[@class='icon icon-magnifying-glass']")
    public WebElement searchI;

    @FindBy(xpath = "//input[@class='text-input-box']")
    public WebElement searchBox;

    @FindBy(className = "select-trigger")
// these dont work->  //span[@class='icon icon-dpad-down'] -- select-popup select-dropdown
    public WebElement dropDownOpener;

    @FindBy(xpath = "//div[@class='accordion-group collapsed double-line']")
    public WebElement tags;

    @FindBy(xpath = "//div[@class='icon-button button-interactive icon-button-plain']")
    public WebElement close;

    @FindBy(xpath = "//input[@class='text-input-box']")
    public WebElement searchBar;

    @FindBy(id = "showcase-play")
    public WebElement play;


    //US_004 SHARE THIS SPACE #############################################
    @FindBy(xpath = "(//span[@class='icon icon-share'])[1]")
    public WebElement share;

    @FindBy(xpath = "(//div[@class='icon-button button-interactive icon-button-plain close-button'])[1]")
    public WebElement shareClose;

    @FindBy(className = "modal-title")
    public WebElement shareText;

    @FindBy(className = "checkbox-text")
    public WebElement checkboxText;

    @FindBy(xpath = "//input[@value='https://my.matterport.com/show/?m=dhWW8bUGx3o']")
    public WebElement linkText;

    @FindBy(className = "input-addon")
    public WebElement copyText;

    @FindBy(xpath = "//span[@class='icon icon-facebook']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//span[@class='icon icon-twitter']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//span[@class='icon icon-linkedin']")
    public WebElement pinterestIcon;

    @FindBy(xpath = "//span[@class='icon icon-pinterest']")
    public WebElement linkedInIcon;

    @FindBy(xpath = "//span[@class='icon icon-email']")
    public WebElement emailIcon;

    @FindBy(xpath = "(//div[@data-balloon-pos='up'])[1]")
    public WebElement copyButton;





}




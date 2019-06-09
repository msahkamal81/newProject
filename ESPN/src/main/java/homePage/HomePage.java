package homePage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI2 {

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")
    WebElement SIGNUP;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")
WebElement LOGIN;

@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"App Logo\"])[2]")
WebElement AppLogo;

@FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[60]/div")
WebElement India;

@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout")
WebElement SignUpLate;
@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView\n")
WebElement BBL;



public void clickOnSIGNUP() throws InterruptedException {
        SIGNUP.click();
        Thread.sleep(5);
    }
    public void clickOnLOGIN() throws InterruptedException {
        LOGIN.click();
        Thread.sleep(5);
    }
    public void clickOnAppLogo() throws InterruptedException {
        AppLogo.click();
        Thread.sleep(5);
    }
    public void clickOnIndia() throws InterruptedException {
        India.click();
        Thread.sleep(5);
    }
    public void clickOnSignUpLate() throws InterruptedException {
        SignUpLate.click();
        Thread.sleep(5);
    }
    public void clickOnBBL() throws InterruptedException {
        BBL.click();
        Thread.sleep(5);
    }

}

package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class AppMenuPage {


    AppiumDriver driver;

    AndroidUtils androidUtils;

    AppiumDriverFactory appiumDriverFactory=AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static final By alarmMenu= By.xpath("//android.widget.TextView[@content-desc=\"Alarm\"]");



    public AppMenuPage(){
        driver=appiumDriverFactory.getDriver();
        androidUtils= new AndroidUtils(driver);
        PageFactory.initElements(driver,this);
    }

    public void verifyAlarmIsDisplayed(){
        androidUtils.objectExist(alarmMenu);
    }


    public void clickAlarmMenu(){
        androidUtils.clickButton(alarmMenu);
    }

}

package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class AlarmPage {

    AppiumDriver driver;

    AndroidUtils androidUtils;

    AppiumDriverFactory appiumDriverFactory=AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static final By alarmService= By.xpath("//android.widget.TextView[@content-desc=\"Alarm Service\"]");



    public AlarmPage(){
        driver=appiumDriverFactory.getDriver();
        androidUtils= new AndroidUtils(driver);
        PageFactory.initElements(driver,this);
    }

    public void verifyAlarmServiceIsDisplayed(){
        androidUtils.objectExist(alarmService);
    }


}

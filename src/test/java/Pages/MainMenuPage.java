package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class MainMenuPage {

    AppiumDriver driver;

    AndroidUtils androidUtils;

    AppiumDriverFactory appiumDriverFactory=AppiumDriverFactory.getInstanceOfAppiumDriverFactory();

    private static By apiDemosTitle= By.xpath("//android.widget.TextView[@text=\"API Demos\"]");


   public MainMenuPage(){
       driver=appiumDriverFactory.getDriver();
       androidUtils= new AndroidUtils(driver);
       PageFactory.initElements(driver,this);
   }

    public void verifyAppIsLaunched(){

       if (androidUtils.objectExist(apiDemosTitle)){
           Assert.assertTrue(true,"The app was successfully launched");
       }else {
           Assert.fail("The app was not successfully launched");
       }

    }
}

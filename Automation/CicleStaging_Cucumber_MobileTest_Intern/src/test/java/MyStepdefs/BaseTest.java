package MyStepdefs;

import Config.Base;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class BaseTest extends Base {
    @Given("User open staging-cicle on mobile")
    public void userOpenStagingCicleOnMobile() {
        initialization();
    }

    @When("User click on mobile team in Team menu")
    public void userClickOnMobileTeamInTeamMenu() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickwebteambox = driver.findElement(By.xpath("*//*[contains(@content-desc,'mobile')]"));
        clickwebteambox.click();
    }

}

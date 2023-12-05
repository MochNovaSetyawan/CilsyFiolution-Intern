package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static MyStepdefs.Bypass.driver;

public class TeamPages {

    public TeamPages() {

        PageFactory.initElements(driver,this);
    }
    By novateambutton = By.xpath("//*[@href=\"/companies/61eba2c85080f47b25ddc8f8/teams/63855485b24aac5c97be3ff2\"]");

    public void Clicknovateambutton() {
        driver.findElement(novateambutton).click();
    }
}

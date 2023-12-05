package MyStepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import Page.TeamPages;

public class TeamTest {

    public WebDriver driver;

    public TeamTest() {
        super();
        this.driver= Bypass.driver;
    }
    TeamPages TeamPage = new TeamPages();
    @Given("User click nova team")
    public void userClickNovaTeam() throws InterruptedException {
        Thread.sleep(2000);
        TeamPage.Clicknovateambutton();
    }
}

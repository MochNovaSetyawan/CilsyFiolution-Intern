package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Page.SearchPages;

public class SearchTest {
    public WebDriver driver;
    public SearchTest() {
        super();
        this.driver= Bypass.driver;
    }
    SearchPages SearchPage = new SearchPages();

    @Given("User click search colloumn")
    public void userClickSearchColloumn() throws InterruptedException {
        Thread.sleep(4000);
        SearchPage.Clicksearchcolloumn();
    }

    @When("User type search")
    public void userTypeSearch() throws InterruptedException {
        Thread.sleep(4000);
        SearchPage.Typesearch();
    }
    @And("User choose team")
    public void userChooseTeam() throws InterruptedException {
        Thread.sleep(4000);
        SearchPage.Chooseteam();
    }
    @Then("User successfully jump to search team")
    public void userSuccessfullyJumpToSearchTeam() throws InterruptedException {
        Thread.sleep(4000);
        SearchPage.Verifyteam();
    }
    @And("User choose kanban")
    public void userChooseKanban() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Choosekanban();
    }

    @Then("User successfully jump to search kanban")
    public void userSuccessfullyJumpToSearchKanban() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifykanban();
    }

    @And("User choose blast")
    public void userChooseBlast() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Chooseblast();
    }

    @Then("User successfully jump to search blast")
    public void userSuccessfullyJumpToSearchBlast() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifyblast();
    }

    @And("User choose schedules")
    public void userChooseSchedules() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Chooseschedules();
    }

    @Then("User successfully jump to search schedules")
    public void userSuccessfullyJumpToSearchSchedules() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifyschedules();
    }

    @And("User choose checkin")
    public void userChooseCheckin() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Choosecheckin();
    }

    @Then("User successfully jump to search checkin")
    public void userSuccessfullyJumpToSearchCheckin() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifycheckin();
    }

    @And("User choose groupchat")
    public void userChooseGroupchat() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Choosegroupchat();
    }

    @Then("User successfully jump to search groupchat")
    public void userSuccessfullyJumpToSearchGroupchat() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifygroupchat();
    }

    @And("User choose doc and file")
    public void userChooseDocAndFile() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Choosedocandfile();
    }

    @Then("User successfully jump to search doc and file")
    public void userSuccessfullyJumpToSearchDocAndFile() throws InterruptedException  {
        Thread.sleep(4000);
        SearchPage.Verifydocandfile();
    }

}

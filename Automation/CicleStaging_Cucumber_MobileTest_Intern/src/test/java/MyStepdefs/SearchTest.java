package MyStepdefs;

import Config.Base;
import Pages.SearchPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest extends Base {

    SearchPages searchPages = new SearchPages();

    //User search jump to Search team (web team)
    @When("User click search menu")
    public void userClickSearchMenu() throws InterruptedException {
        searchPages.userClickSearchMenu();
    }

    @And("User type search")
    public void userTypeSearch() throws InterruptedException {
        searchPages.userTypeSearch();
    }

    @And("User choose team")
    public void userChooseTeam() throws InterruptedException {
        searchPages.userChooseTeam();
    }

    @Then("User successfully jump to search team")
    public void userSuccessfullyJumpToSearchTeam() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchTeam();
    }

    //User search jump to Search kanban (web team)
    @And("User choose kanban")
    public void userChooseKanban() throws InterruptedException {
        searchPages.userChooseKanban();
    }

    @Then("User successfully jump to search kanban")
    public void userSuccessfullyJumpToSearchKanban() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchKanban();
    }

    //User search jump to Search blast (web team)
    @And("User choose blast")
    public void userChooseBlast() throws InterruptedException {
        searchPages.userChooseBlast();
    }

    @Then("User successfully jump to search blast")
    public void userSuccessfullyJumpToSearchBlast() throws InterruptedException {
        searchPages.userChooseBlast();
    }

    //User search jump to Search schedules (web team)
    @And("User choose schedules")
    public void userChooseSchedules() throws InterruptedException {
        searchPages.userChooseSchedules();
    }

    @Then("User successfully jump to search schedules")
    public void userSuccessfullyJumpToSearchSchedules() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchSchedules();
    }

    //User search jump to Search checkin (web team)
    @And("User choose checkin")
    public void userChooseCheckin() throws InterruptedException {
        searchPages.userChooseCheckin();
    }

    @Then("User successfully jump to search checkin")
    public void userSuccessfullyJumpToSearchCheckin() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchCheckin();
    }

    @And("User choose groupchat")
    public void userChooseGroupchat() throws InterruptedException {
        searchPages.userChooseGroupchat();
    }

    @Then("User successfully jump to search groupchat")
    public void userSuccessfullyJumpToSearchGroupchat() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchGroupchat();
    }

    //User search jump to Search doc and file
    @And("User choose doc and file")
    public void userChooseDocAndFile() throws InterruptedException {
        searchPages.userChooseDocAndFile();
    }

    @Then("User successfully jump to search doc and file")
    public void userSuccessfullyJumpToSearchDocAndFile() throws InterruptedException {
        searchPages.userSuccessfullyJumpToSearchDocAndFile();
    }
}

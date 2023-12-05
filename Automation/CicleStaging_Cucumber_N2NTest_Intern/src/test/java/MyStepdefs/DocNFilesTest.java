package MyStepdefs;

import Page.DocNFilesPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DocNFilesTest {

    public WebDriver driver;
    public DocNFilesTest() {
        super();
        this.driver= Bypass.driver;
    }
    DocNFilesPages DocandfilePage = new DocNFilesPages();

    @When("User click doc & file box menu")
    public void userClickDocFileBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickdocandfileboxmenu();
    }

    @And("User click add item here button")
    public void userClickAddItemHereButton() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickadditemherebutton();
    }

    @And("User click add a new doc")
    public void userClickAddANewDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickaddanewdoc();
    }

    @And("User type title")
    public void userTypeTitle() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Typetitle();
    }

    @And("User click publish button")
    public void userClickPublishButton() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickpublishbutton();
    }

    @Then("User successfully create add a new doc")
    public void userSuccessfullyCreateAddANewDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Verifyaddanewdoc();
    }

    @And("User click create a new folder")
    public void userClickCreateANewFolder() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickcreateanewfolser();
    }

    @And("User type name folder")
    public void userTypeNameFolder() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Typenamefolder();
    }

    @Then("User successfully create new folder")
    public void userSuccessfullyCreateNewFolder() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Verifycreatenewfolder();
    }

    @And("User click upload files")
    public void userClickUploadFiles() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.clickuploadfiles();
    }

    @And("User send files")
    public void userSendFiles() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.sendfiles();
    }

    @And("User successfully upload files")
    public void userSuccessfullyUploadFiles() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.verifyuploadfiles();
    }

    @And("User type story")
    public void userTypeStory() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Typestory();
    }

    @And("User choose folder")
    public void userChooseFolder() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Choosefolder();
    }

    @And("User click edit this folder button")
    public void userClickEditThisFolderButton() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickeditthisfolderbutton();
    }

    @And("User type edit title")
    public void userTypeEditTitle() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clicktitlecolloumn();
    }

    @And("User click publish changes button")
    public void userClickPublishChangesButton() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickpublishchanges();
    }

    @Then("User successfully edit folder name")
    public void userSuccessfullyEditFolderName() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.verifyeditfoldername();
    }

    @And("User click edit button")
    public void userClickEditButton() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickeditbutton();
    }

    @And("User choose doc")
    public void userChooseDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Choosedoc();
    }

    @And("User click three dot button in doc")
    public void userClickThreeDotButtonInDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickthreedotbuttonindoc();
    }

    @And("User click edit in doc")
    public void userClickEditInDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.clickeditbuttonindoc();
    }

    @And("User type title in doc")
    public void userTypeTitleInDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Typetitleindoc();
    }

    @And("User type description in doc")
    public void userTypeDescriptionInDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Typedescriptionindoc();
    }

    @Then("User successfully edit doc")
    public void userSuccessfullyEditDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Verifyeditdoc();
    }

    @And("User click private doc")
    public void userClickPrivateDoc() throws InterruptedException {
        Thread.sleep(2000);
        DocandfilePage.Clickprivatebutton();
    }
}

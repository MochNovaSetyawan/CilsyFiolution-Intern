package MyStepdefs;

import Pages.DocNFilesPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DocNFilesTest {

    DocNFilesPages docNFilesPages = new DocNFilesPages();

    //User create add a new doc
    @And("User click on doc & files menu")
    public void userClickOnDocFilesMenu() throws InterruptedException {
        docNFilesPages.userClickOnDocFilesMenu();
    }

    @And("User click plus button in doc & files")
    public void userClickPlusButtonInDocFiles() throws InterruptedException {
        docNFilesPages.userClickPlusButtonInDocFiles();
    }

    @And("User click add a new doc")
    public void userClickAddANewDoc() throws InterruptedException {
        docNFilesPages.userClickAddANewDoc();
    }

    @And("User type title")
    public void userTypeTitle() throws InterruptedException {
        docNFilesPages.userTypeTitle();
    }

    @And("User type story")
    public void userTypeStory() throws InterruptedException {
        docNFilesPages.userTypeStory();
    }

    @And("User click publish button")
    public void userClickPublishButton() throws InterruptedException {
        docNFilesPages.userClickPublishButton();
    }

    @Then("User successfully create add a new doc")
    public void userSuccessfullyCreateAddANewDoc() throws InterruptedException {
        docNFilesPages.userSuccessfullyCreateAddANewDoc();
    }

    //User create add a new folder
    @And("User click create a new folder")
    public void userClickCreateANewFolder() throws InterruptedException {
        docNFilesPages.userClickCreateANewFolder();
    }

    @And("User type name folder")
    public void userTypeNameFolder() throws InterruptedException {
        docNFilesPages.userTypeNameFolder();
    }

    @And("User click create button")
    public void userClickCreateButton() throws InterruptedException {
        docNFilesPages.userClickCreateButton();
    }

    @Then("User successfully create new folder")
    public void userSuccessfullyCreateNewFolder() throws InterruptedException {
        docNFilesPages.userSuccessfullyCreateNewFolder();
    }

    //User create add new doc on the folder & User create add new folder on the folder
    @And("User choose folder")
    public void userChooseFolder() throws InterruptedException {
        docNFilesPages.userChooseFolder();
    }
    @And("User click plus button in folder")
    public void userClickPlusButtonInFolder() throws InterruptedException {
        docNFilesPages.userClickPlusButtonInFolder();
    }
    //User edit folder name
    @And("User click dot three button in doc and files")
    public void userClickDotThreeButtonInDocAndFiles() throws InterruptedException{
        docNFilesPages.userClickDotThreeButtonInDocAndFiles();
    }

    @And("User click change name")
    public void userClickChangeName() throws InterruptedException{
        docNFilesPages.userClickChangeName();
    }

    @And("User type edit title")
    public void userTypeEditTitle() throws InterruptedException{
        docNFilesPages.userTypeEditTitle();
    }

    @And("User click checklist button in doc and files")
    public void userClickChecklistButtonInDocAndFiles() throws InterruptedException{
        docNFilesPages.userClickChecklistButtonInDocAndFiles();
    }

    @Then("User successfully edit folder name")
    public void userSuccessfullyEditFolderName() throws InterruptedException{
        docNFilesPages.userSuccessfullyEditFolderName();
    }

    //User edit doc
    @And("User choose doc")
    public void userChooseDoc() throws InterruptedException{
        docNFilesPages.userChooseDoc();
    }

    @And("User click three dot button in doc")
    public void userClickThreeDotButtonInDoc() throws InterruptedException{
        docNFilesPages.userClickThreeDotButtonInDoc();
    }

    @And("User click edit in doc")
    public void userClickEditInDoc() throws InterruptedException{
        docNFilesPages.userClickEditInDoc();
    }

    @And("User type title in doc")
    public void userTypeTitleInDoc() throws InterruptedException{
        docNFilesPages.userTypeTitleInDoc();
    }

    @And("User type description in doc")
    public void userTypeDescriptionInDoc() throws InterruptedException{
        docNFilesPages.userTypeDescriptionInDoc();
    }

    @And("User click publish changes button")
    public void userClickPublishChangesButton() throws InterruptedException{
        docNFilesPages.userClickPublishChangesButton();
    }

    @Then("User successfully edit doc")
    public void userSuccessfullyEditDoc() throws InterruptedException{
        docNFilesPages.userSuccessfullyEditDoc();
    }

    //User edit folder name on folder
    @And("User click three dot button in folder")
    public void userClickThreeDotButtonInFolder() throws InterruptedException{
        docNFilesPages.userClickThreeDotButtonInFolder();
    }


    @And("User click private doc")
    public void userClickPrivateDoc() throws InterruptedException{
        docNFilesPages.userClickPrivateDoc();
    }

    //User edit folder Private
    @And("User click private folder")
    public void userClickPrivateFolder() throws InterruptedException{
        docNFilesPages.userClickPrivateFolder();
    }

    @Then("User successfully private folder")
    public void userSuccessfullyPrivateFolder() throws InterruptedException{
        docNFilesPages.userSuccessfullyPrivateFolder();
    }
    //User upload files
    @And("User click upload files")
    public void userClickUploadFiles() throws InterruptedException{
        docNFilesPages.userClickUploadFiles();
    }

    @And("User send files")
    public void userSendFiles() throws InterruptedException{
        docNFilesPages.userSendFiles();
    }

    @And("User successfully upload files")
    public void userSuccessfullyUploadFiles() throws InterruptedException{
        docNFilesPages.userSuccessfullyUploadFiles();
    }
}

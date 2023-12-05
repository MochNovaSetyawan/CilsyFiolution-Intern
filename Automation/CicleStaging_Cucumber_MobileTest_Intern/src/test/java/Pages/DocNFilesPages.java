package Pages;

import Config.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.InvalidSelectorException;


public class DocNFilesPages extends Base {


    //User create add a new doc
    @Test
    public void userClickOnDocFilesMenu() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickOnDocFilesMenu = driver.findElementByAccessibilityId("Docs & Files");
        userClickOnDocFilesMenu.click();
    }
    @Test
    public void userClickPlusButtonInDocFiles() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickPlusButtonInDocFiles = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
        userClickPlusButtonInDocFiles.click();
    }
    @Test
    public void userClickAddANewDoc() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickAddANewDoc = driver.findElementByAccessibilityId("Add a new doc");
        userClickAddANewDoc.click();
    }
    @Test
    public void userTypeTitle() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeTitle = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
        userTypeTitle.click();
        Thread.sleep(2000);
        userTypeTitle.sendKeys("ini title");
        Thread.sleep(2000);
        driver.hideKeyboard();
    }
    @Test
    public void userTypeStory() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeStory = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText");
        userTypeStory.click();
        Thread.sleep(2000);
        userTypeStory.sendKeys("ini story");
        Thread.sleep(2000);
        driver.hideKeyboard();

    }
    @Test
    public void userClickPublishButton() throws InterruptedException {
        Thread.sleep(2000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

        Thread.sleep(7000);
        MobileElement userClickPublishButton = driver.findElementByAccessibilityId("Publish");
        userClickPublishButton.click();

    }
    @Test
    public void userSuccessfullyCreateAddANewDoc() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyCreateAddANewDoc = driver.findElementByAccessibilityId("Create doc successful");
        Assert.assertTrue(userSuccessfullyCreateAddANewDoc.isDisplayed());
    }

    //User create add a new folder
    @Test
    public void userClickCreateANewFolder() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickCreateANewFolder = driver.findElementByAccessibilityId("Create a new folder");
        userClickCreateANewFolder.click();
    }

    @Test
    public void userTypeNameFolder() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeNameFolder = driver.findElementByXPath("*//*[contains(@class,'android.widget.EditText')]");
        userTypeNameFolder.click();
        userTypeNameFolder.sendKeys("ini folder");
        driver.hideKeyboard();
    }

    @Test
    public void userClickCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickCreateANewFolder = driver.findElementByAccessibilityId("Create");
        userClickCreateANewFolder.click();
    }

    @Test
    public void userSuccessfullyCreateNewFolder() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyCreateNewFolder = driver.findElementByAccessibilityId("Create bucket successful");
        Assert.assertTrue(userSuccessfullyCreateNewFolder.isDisplayed());
    }

    //User create add new doc on the folder & User create add new folder on the folder
    @Test
    public void userChooseFolder() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseFolder = driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"folder\"])[1]");
        userChooseFolder.click();
    }

    @Test
    public void userClickPlusButtonInFolder() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickPlusButtonInFolder = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[3]");
        userClickPlusButtonInFolder.click();
    }
    //User edit folder name
    @Test
    public void userClickDotThreeButtonInDocAndFiles() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickDotThreeButtonInDocAndFiles = driver.findElementByAccessibilityId("Show menu");
        userClickDotThreeButtonInDocAndFiles.click();
    }
    @Test
    public void userClickChangeName() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickChangeName = driver.findElementByAccessibilityId("Change name");
        userClickChangeName.click();
    }
    @Test
    public void userTypeEditTitle() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeEditTitle = driver.findElementByXPath("*//*[contains(@class,'android.widget.EditText')]");
        userTypeEditTitle.click();
        userTypeEditTitle.sendKeys("ini edit folder");
        driver.hideKeyboard();
    }
    @Test
    public void userClickChecklistButtonInDocAndFiles() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickChangeName = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
        userClickChangeName.click();
    }
    @Test
    public void userSuccessfullyEditFolderName() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullyCreateNewFolder = driver.findElementByAccessibilityId("Update bucket successful");
        Assert.assertTrue(userSuccessfullyCreateNewFolder.isDisplayed());
    }

    //User edit doc
    @Test
    public void userChooseDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userChooseDoc = driver.findElementByXPath("//android.view.View[@content-desc=\"ini title\"]/android.view.View");
        userChooseDoc.click();
    }

    @Test
    public void userClickThreeDotButtonInDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickThreeDotButtonInDoc = driver.findElementByXPath("*//*[contains(@content-desc,'Who')]/android.widget.Button");
        userClickThreeDotButtonInDoc.click();
    }

    @Test
    public void userClickEditInDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickEditInDoc = driver.findElementByAccessibilityId("Edit");
        userClickEditInDoc.click();
    }

    @Test
    public void userTypeTitleInDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeTitleInDoc = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
        userTypeTitleInDoc.click();
        Thread.sleep(2000);
        userTypeTitleInDoc.sendKeys("ini edit title");
        driver.hideKeyboard();
    }

    @Test
    public void userTypeDescriptionInDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeDescriptionInDoc = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText");
        userTypeDescriptionInDoc.sendKeys("ini edit story");
    }

    @Test
    public void userClickPublishChangesButton() throws InterruptedException{
        Thread.sleep(3000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

        Thread.sleep(7000);
        MobileElement userClickPublishChangesButton = driver.findElementByAccessibilityId("Publish changes");
        userClickPublishChangesButton.click();
    }

    @Test
    public void userSuccessfullyEditDoc() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullyEditDoc = driver.findElementByAccessibilityId("Update doc successful");
        Assert.assertTrue(userSuccessfullyEditDoc.isDisplayed());
    }

    //User edit folder name on folder
    @Test
    public void userClickThreeDotButtonInFolder() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickThreeDotButtonInFolder = driver.findElementByAccessibilityId("Show menu");
        userClickThreeDotButtonInFolder.click();
    }

    //User edit doc Private
    @Test
    public void userClickPrivateDoc() throws InterruptedException{
        Thread.sleep(2000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
        Thread.sleep(7000);
        MobileElement userClickPrivateDoc = driver.findElementByXPath("*//*[contains(@class,'android.widget.Switch')]");
        userClickPrivateDoc.click();
    }

    //User edit folder Private
    @Test
    public void userClickPrivateFolder() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickPrivateFolder = driver.findElementByAccessibilityId("Set to private");
        userClickPrivateFolder.click();

    }

    @Test
    public void userSuccessfullyPrivateFolder() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullyPrivateFolder = driver.findElementByAccessibilityId("Update bucket successful");
        Assert.assertTrue(userSuccessfullyPrivateFolder.isDisplayed());
    }

    //User upload files
    @Test
    public void userClickUploadFiles() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickPrivateFolder = driver.findElementByAccessibilityId("Upload File");
        userClickPrivateFolder.click();
    }

    @Test
    public void userSendFiles() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSendAttachment = driver.findElementByXPath("*//*[contains(@text,'macaca_nigra_self-portrait-3e0070aa19a7fe36e802253048411a38f14a79f8-s1100-c50.jpg')]");
        userSendAttachment.click();
    }

    @Test
    public void userSuccessfullyUploadFiles() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullySendAttachment = driver.findElementByAccessibilityId("Create files successful");
        Assert.assertTrue(userSuccessfullySendAttachment.isDisplayed());
    }
}

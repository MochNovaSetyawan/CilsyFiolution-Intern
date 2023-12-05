package Pages;

import Config.Base;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

public class PrivateChatPages extends Base {


    //User send private chat
    @Test
    public void userClickMenuInHomePage() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickMenuInHomePage = driver.findElementByXPath("*//*[contains(@content-desc,'4 of 4')]");
        userClickMenuInHomePage.click();
    }

    @Test
    public void userClickInbox() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickInbox = driver.findElementByXPath("//android.view.View[@content-desc=\"Inbox\"]");
        userClickInbox.click();
    }

    @Test
    public void userClickContactForSendPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickContactForSendPrivateChat = driver.findElementByXPath("*//*[contains(@content-desc,'Moch Nova Setyawan')]");
        userClickContactForSendPrivateChat.click();
    }

    @Test
    public void userTypeChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeChat = driver.findElementByClassName("android.widget.EditText");
        userTypeChat.click();
        Thread.sleep(2000);
        userTypeChat.sendKeys("halo");
        Thread.sleep(2000);
        driver.hideKeyboard();
    }

    @Test
    public void userClickSend() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickSend = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
        userClickSend.click();
    }

    @Test
    public void userSuccessfullySendPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySendPrivateChat = driver.findElementByXPath("*//*[contains(@content-desc,'halo')]");
        Assert.assertTrue(userSuccessfullySendPrivateChat.isDisplayed());
    }

    //User copy chat
    @Test
    public void userClickMessage() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickMessage = driver.findElementByXPath("*//*[contains(@content-desc,'halo')]");
        userClickMessage.click();
    }

    @Test
    public void userClickCopy() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickInbox = driver.findElementByAccessibilityId("Copy");
        userClickInbox.click();
    }

    @Test
    public void userSuccessfullyCopyChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyCopyChat = driver.findElementByAccessibilityId("copy text to clipboard");
        Assert.assertTrue(userSuccessfullyCopyChat.isDisplayed());
    }

    //User delete chat
    @Test
    public void userSuccessfullyDeleteChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyDeleteChat = driver.findElementByAccessibilityId("Delete chat message success");
        Assert.assertTrue(userSuccessfullyDeleteChat.isDisplayed());
    }

    //User caption private chat
    @Test
    public void userClickCaptionButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeChat = driver.findElementByClassName("android.widget.EditText");
        userTypeChat.click();
        Thread.sleep(2000);
        MobileElement userClickCaptionButton = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
        userClickCaptionButton.click();
    }

    @Test
    public void userChooseContactCaption() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseContactCaption = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Moch Nova Setyawan\"]");
        userChooseContactCaption.click();
    }

    @Test
    public void userSuccessfullySendCaptionInPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySendCaptionInPrivateChat = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Moch Nova Setyawan\"]");
        Assert.assertTrue(userSuccessfullySendCaptionInPrivateChat.isDisplayed());
    }

    //User send attachment in private chat
    @Test
    public void userClickAttachmentButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickAttachmentButton = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
        userClickAttachmentButton.click();
    }

    @Test
    public void userClickImageFromGallery() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickImageFromGallery = driver.findElementByAccessibilityId("Document & Video");
        userClickImageFromGallery.click();
    }
    @Test
    public void userSuccessfullySendAttachmentInPrivateChat(){

    }

}

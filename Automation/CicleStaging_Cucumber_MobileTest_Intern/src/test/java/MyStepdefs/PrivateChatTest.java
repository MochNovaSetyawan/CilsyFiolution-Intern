package MyStepdefs;

import Config.Base;
import Pages.PrivateChatPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrivateChatTest extends Base {

    PrivateChatPages privateChatPages = new PrivateChatPages();

    //User send private chat
    @When("User click menu in home page")
    public void userClickMenuInHomePage() throws InterruptedException {
        privateChatPages.userClickMenuInHomePage();
    }

    @And("User click inbox")
    public void userClickInbox() throws InterruptedException {
        privateChatPages.userClickInbox();
    }

    @And("User click contact for send private chat")
    public void userClickContactForSendPrivateChat() throws InterruptedException {
        privateChatPages.userClickContactForSendPrivateChat();
    }

    @And("User type chat")
    public void userTypeChat() throws InterruptedException {
        privateChatPages.userTypeChat();
    }

    @And("User click send")
    public void userClickSend() throws InterruptedException {
        privateChatPages.userClickSend();
    }

    @Then("User successfully send private chat")
    public void userSuccessfullySendPrivateChat() throws InterruptedException {
        privateChatPages.userSuccessfullySendPrivateChat();
    }

    //User copy chat
    @And("User click message")
    public void userClickMessage() throws InterruptedException {
        privateChatPages.userClickMessage();
    }

    @And("User click copy")
    public void userClickCopy() throws InterruptedException {
        privateChatPages.userClickCopy();
    }

    @Then("User successfully copy chat")
    public void userSuccessfullyCopyChat() throws InterruptedException {
        privateChatPages.userSuccessfullyCopyChat();
    }

    //User delete chat
    @Then("User successfully delete chat")
    public void userSuccessfullyDeleteChat() throws InterruptedException {
        privateChatPages.userSuccessfullyDeleteChat();
    }

    //User caption private chat
    @And("User click caption button")
    public void userClickCaptionButton() throws InterruptedException {
        privateChatPages.userClickCaptionButton();
    }

    @And("User choose contact caption")
    public void userChooseContactCaption() throws InterruptedException {
        privateChatPages.userChooseContactCaption();
    }

    @Then("User successfully send caption in private chat")
    public void userSuccessfullySendCaptionInPrivateChat() throws InterruptedException {
        privateChatPages.userSuccessfullySendCaptionInPrivateChat();
    }

    //User send attachment in private chat
    @And("User click attachment button")
    public void userClickAttachmentButton() throws InterruptedException {
        privateChatPages.userClickAttachmentButton();
    }

    @And("User click Document & Video")
    public void userClickImageFromGallery() throws InterruptedException {
        privateChatPages.userClickImageFromGallery();
    }

    @And("User successfully send attachment in private chat")
    public void userSuccessfullySendAttachmentInPrivateChat() throws InterruptedException {
        privateChatPages.userSuccessfullySendAttachmentInPrivateChat();
    }

}

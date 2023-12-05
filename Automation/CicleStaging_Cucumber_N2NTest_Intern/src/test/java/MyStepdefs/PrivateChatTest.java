package MyStepdefs;

import Page.PrivateChatPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PrivateChatTest {

    public WebDriver driver;
    public PrivateChatTest() {
        super();
        this.driver= Bypass.driver;
    }

    PrivateChatPages privateChatPages  = new PrivateChatPages();

    //SEND PRIVATE CHAT
    @Given("User click Profile")
    public void userClickProfile() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickprofile();
    }

    @When("User click Private chat")
    public void userClickPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickprivatechat();
    }

    @And("User click contact for send private chat")
    public void userClickContactForSendPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickcontact();
    }

    @And("User type chat")
    public void userTypeChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Typechat();
    }

    @And("User click send")
    public void userClickSend() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clicksend();
    }

    @Then("User successfully send private chat")
    public void userSuccessfullySendPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Verifysendprivatechat();
    }

    @And("User click menu message")
    public void userClickMenuMessage() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickmenumessage();
    }

    @And("User click delete message")
    public void userClickDeleteMessage() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Deletemessage();
    }

    @Then("User successfully delete chat")
    public void userSuccessfullyDeleteChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Verifydeletechat();
    }

    @And("User type caption chat")
    public void userTypeCaptionChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Typementionchat();
    }

    @And("User choose contact caption")
    public void userChooseContactCaption() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickmentionuser();
    }

    @Then("User successfully send caption in private chat")
    public void userSuccessfullySendCaptionInPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Verifysendmention();
    }

    @And("User click attachment button in private chat")
    public void userClickAttachmentButtonInPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Clickattachmentbuttoninprivatechat();
    }

    @And("User send Attachment in private chat")
    public void userSendAttachmentInPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Sendattachmentinprivatechat();
    }

    @And("User successfully send attachment in private chat")
    public void userSuccessfullySendAttachmentInPrivateChat() throws InterruptedException {
        Thread.sleep(2000);
        privateChatPages.Verifysendattachmentinprivatechat();
    }

}

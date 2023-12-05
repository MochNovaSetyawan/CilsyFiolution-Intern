package Page;

import MyStepdefs.Bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PrivateChatPages extends Bypass {

    public PrivateChatPages() {

        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    //SEND PRIVATE CHAT
    By clickprofile = By.cssSelector("[class=\"ImageMember_image__x7ApH\"]");
    By clickprivatechat = By.xpath("//*[@class=\"UserMenuContainer_iconSection__item__margin__3uuFg\"]/a");
    By clickcontact = By.xpath("//*[contains(text(),\"Moch Nova Setyawan\")]");
    By typechat = By.xpath("//div[@class='fr-element fr-view']//p");
    By clicksend = By.cssSelector("[class=\"CreateMessage_send__2f1ZQ\"]");
    By verifysendprivatechat = By.xpath("//*[contains(text(),\"hello\")]");

    public void Clickprofile() {
        driver.findElement(clickprofile).click();
    }

    public void Clickprivatechat() {
        driver.findElement(clickprivatechat).click();
    }

    public void Clickcontact() {
        driver.findElement(clickcontact).click();
    }

    public void Typechat() {
        driver.findElement(typechat).sendKeys("hello");
    }

    public void Clicksend() {
        driver.findElement(clicksend).click();
    }

    public void Verifysendprivatechat() {
        WebElement verifySendprivatechat = driver.findElement(verifysendprivatechat);
        Assert.assertTrue(verifySendprivatechat.isDisplayed());
    }

    //USER DELETE CHAT
    By messagehover = By.cssSelector("[class=\"Message_balloon__zRoXK\"]");
    By menumessage = By.cssSelector(".Message_container__3maDl:nth-child(1) [data-testid='ExpandMoreOutlinedIcon']");
    By deletemessage = By.cssSelector(".MessageMenuPopUp_menu__1rkRG");
    By deletebutton = By.cssSelector(".Button_container__1WNuB");
    By verifydeletechat = By.xpath("//*[contains(text(),\"Delete chat message success\")]");

    public void Clickmenumessage() {
        Actions action = new Actions(driver);
        WebElement Messagehover = driver.findElement(messagehover);
        action.moveToElement(Messagehover).perform();
        driver.findElement(menumessage).click();
    }
    public void Deletemessage() {
        driver.findElement(deletemessage).click();
    }
    public void Verifydeletechat() {
        WebElement verifyDelete = driver.findElement(verifydeletechat);
        Assert.assertTrue(verifyDelete.isDisplayed());
    }

    //CAPTION PRIVATE CHAT
    By typementionchat = By.xpath("//div[@class='fr-element fr-view']//p");
    By clickmentionuser = By.xpath("//*[@class=\"highlight\"][last()]/span/a");
    By verifysendmention = By.xpath("//*[@class=\"Message_container__3maDl\"][1]/div/div/div/div/div/p[1]/span/a");

    public void Typementionchat() {
        driver.findElement(typementionchat).sendKeys("@");
    }
    public void Clickmentionuser() {
        driver.findElement(clickmentionuser).click();
    }
    public void Verifysendmention(){
        WebElement sendChatingroupchat = driver.findElement(verifysendmention);
        Assert.assertTrue(sendChatingroupchat.isDisplayed());
    }

    //USER SEND ATTACHMENT
    By clickattachmentbuttoninprivatechat = By.cssSelector("[class=\"CreateMessage_attachment__2Z8Rx\"]");
    By sendattachmentinprivatechat = By.xpath("//*[@class=\"AttachFileContainer_container__3U9Wh\"]/input");
    By verifysendattachmentinprivatechat = By.xpath("//*[contains(text(),'Upload attachments is success')]");

    public void Clickattachmentbuttoninprivatechat() {
        driver.findElement(clickattachmentbuttoninprivatechat).click();
    }
    public void Sendattachmentinprivatechat() {
        WebElement upload_file = driver.findElement(sendattachmentinprivatechat);
        upload_file.sendKeys("C:\\Users\\62812\\OneDrive\\Pictures\\index.png");
    }
    public void Verifysendattachmentinprivatechat(){
        WebElement verifyAttachment = driver.findElement(verifysendattachmentinprivatechat);
        Assert.assertTrue(verifyAttachment.isDisplayed());
    }
}

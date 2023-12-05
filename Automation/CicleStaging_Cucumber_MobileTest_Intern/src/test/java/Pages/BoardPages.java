package Pages;

import Config.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardPages extends Base {

    TouchAction touchAction = new TouchAction(driver);

    //POSITIVE

    //User create new board list
    @Test
    public void userClickOnBoardMenu() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickboardmenu = driver.findElementByAccessibilityId("Board");
        clickboardmenu.click();
    }
    @Test
    public void userClickAddNewList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickaddnewlist = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button\n"));
        clickaddnewlist.click();
    }
    @Test
    public void userTypeListInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typelistinboard = driver.findElement(By.xpath("*//*[contains(@text,'Add new list...')]"));
        typelistinboard.sendKeys("ini name list");
    }
    @Test
    public void userClickSubmitButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clicksubmitbuttoninboard = driver.findElement(By.xpath("*//*[contains(@content-desc,'ubmit')]"));
        clicksubmitbuttoninboard.click();
    }
    @Test
    public void userSuccessfullyCreateNewBoardList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifycreatenewboardlist = driver.findElementByAccessibilityId("ini name list");
        Assert.assertTrue(verifycreatenewboardlist.isDisplayed());
    }

    //User create new card
    @Test
    public void userClickAddCardInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickaddcardinboard = driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Add new card'])[1]"));
        clickaddcardinboard.click();
    }
    @Test
    public void userTypeCardNameInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typecardnameinboard = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText"));
        typecardnameinboard.sendKeys("ini name card");
    }
    @Test
    public void userChecklistButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickchecklistbuttoninboard = driver.findElement(By.xpath("*//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View"));
        clickchecklistbuttoninboard.click();
    }
    @Test
    public void userCanSeeTheResultOfCreateNewCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifycreatenewcard = driver.findElement(By.xpath("*//*[contains(@content-desc,'ini name card')]"));
        Assert.assertTrue(verifycreatenewcard.isDisplayed());
    }

    //User edit board list name
    @Test
    public void userDoubleClickListName() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement doubleclicklistname = driver.findElement(By.xpath("//android.view.View[@content-desc=\"ini name list\"]"));
        doubleclicklistname.click();
    }
    @Test
    public void userTypeEditList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typeeditlist = driver.findElementByClassName("android.widget.EditText");
        typeeditlist.sendKeys("ini edit name list");
    }
    @Test
    public void userClickChecklistButtonInList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickchecklistbuttoninlist = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]"));
        clickchecklistbuttoninlist.click();
    }
    @Test
    public void userSuccessfullyEditBoardListName() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifyeditboardlistname = driver.findElementByAccessibilityId("ini edit name list");
        Assert.assertTrue(verifyeditboardlistname.isDisplayed());
    }

    //User edit card
    @Test
    public void userChooseCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement choosecard = driver.findElement(By.xpath("*//*[contains(@content-desc,'Show menu')]"));
        choosecard.click();
    }
    @Test
    public void userClickEditCardNameButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickeditcardnamebutton = driver.findElement(By.xpath("//android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]"));
        clickeditcardnamebutton.click();
    }
    @Test
    public void userTypeEditCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typeeditcard = driver.findElementByClassName("android.widget.EditText");
        typeeditcard.sendKeys("ini edit card");
    }
    @Test
    public void userClickChecklistButtonInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickchecklistbuttonincard = driver.findElement(By.xpath("*//*[contains(@content-desc,'Testing')]/android.widget.Button"));
        clickchecklistbuttonincard.click();
    }
    @Test
    public void userSuccessfullyEditCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifyeditcard = driver.findElementByAccessibilityId("update title success");
        Assert.assertTrue(verifyeditcard.isDisplayed());
    }

    //User add description in card
    @Test
    public void userClickEditDescriptionCardButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickeditdescriptioncardbutton = driver.findElement(By.xpath("*//*[contains(@content-desc,\"ini\")]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]"));
        clickeditdescriptioncardbutton.click();
    }
    @Test
    public void userTypeDescriptionInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typedescriptionincard = driver.findElementByClassName("android.widget.EditText");
        typedescriptionincard.sendKeys("ini description");
    }
    @Test
    public void userClickPublishInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement clickpublishincard = driver.findElementByAccessibilityId("Publish");
        clickpublishincard.click();

    }
    @Test
    public void userSuccessfullyAddDescriptionInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifyadddescriptionincard = driver.findElementByAccessibilityId("update notes success");
        Assert.assertTrue(verifyadddescriptionincard.isDisplayed());
    }

    //User edit description in card
    @Test
    public void userTypeEditDescriptionInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typedescriptionincard = driver.findElementByClassName("android.widget.EditText");
        typedescriptionincard.sendKeys("ini edit description");
    }
    @Test
    public void userSuccessfullyEditDescriptionInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement verifyeditdescriptionincard = driver.findElementByAccessibilityId("update notes success");
        Assert.assertTrue(verifyeditdescriptionincard.isDisplayed());
    }

    //User add comment in board
    @Test
    public void userClickAddNewComment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement Userclickaddnewcomment = driver.findElementByAccessibilityId("Add new comment...");
        Userclickaddnewcomment.click();
    }
    @Test
    public void userTypeComment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typelistinboard = driver.findElement(By.xpath("*//*[contains(@class,'android.widget.EditText')]"));
        typelistinboard.sendKeys("ini comment");
    }
    @Test
    public void userSuccessfullyAddCommentInBoard() throws InterruptedException{
        Thread.sleep(7000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

        Thread.sleep(7000);
        MobileElement userSuccessfullyAddCommentInBoard = driver.findElementByXPath("*//*[contains(@content-desc,'ini comment')]");
        Assert.assertTrue(userSuccessfullyAddCommentInBoard.isDisplayed());
    }
    //User edit comment in board
    @Test
    public void userClickThreeButtonInComment() throws InterruptedException {
        Thread.sleep(7000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
        Thread.sleep(7000);
        MobileElement userClickThreeButtonInComment = driver.findElementByXPath("*//*[contains(@content-desc,'ini comment')]/android.view.View[1]");
        userClickThreeButtonInComment.click();
    }

    @Test
    public void userEditCommentButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userEditCommentButtonInBoard = driver.findElementByAccessibilityId("Edit Comment");
        userEditCommentButtonInBoard.click();
    }
    @Test
    public void userTypeEditComment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeEditComment = driver.findElement(By.xpath("*//*[contains(@class,'android.widget.EditText')]"));
        userTypeEditComment.clear();
        userTypeEditComment.sendKeys("ini edit comment");
    }
    @Test
    public void userSuccessfullyEditCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyEditCommentInBoard = driver.findElementByXPath("*//*[contains(@content-desc,'ini edit comment')]");
        Assert.assertTrue(userSuccessfullyEditCommentInBoard.isDisplayed());
    }

    //User cheers in board
    @Test
    public void userClickCheersInBoard() throws InterruptedException {
        Thread.sleep(7000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
        Thread.sleep(7000);
        MobileElement userClickCheersInBoard = driver.findElementByXPath("*//*[contains(content-desc,'')]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.ImageView");
        userClickCheersInBoard.click();
    }

    @Test
    public void userTypeCheers() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeCheers = driver.findElementByClassName("android.widget.EditText");
        userTypeCheers.sendKeys("ini cheers");
    }

    @Test
    public void userClickChecklistButtonCheersInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickChecklistButtonCheersInBoard = driver.findElementByXPath("*//*[contains(@content-desc,'ini edit card')]/android.view.View[3]");
        userClickChecklistButtonCheersInBoard.click();
    }
    @Test
    public void userSuccessfullyCheersInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyCheersInBoard = driver.findElementByAccessibilityId("ini cheers");
        Assert.assertTrue(userSuccessfullyCheersInBoard.isDisplayed());
    }

    //User cheers comment in board
    @Test
    public void userClickCheersCommentInBoard() throws InterruptedException {
        Thread.sleep(7000);
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
        } catch (InvalidSelectorException e) {
            // ignore
        }
        Thread.sleep(7000);
        MobileElement userClickCheersCommentInBoard = driver.findElementByXPath("*//*[contains(@content-desc,' ')]/android.widget.ImageView[2]");
        userClickCheersCommentInBoard.click();
    }
    @Test
    public void userClickChecklistButtonCheersCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickChecklistButtonCheersCommentInBoard = driver.findElementByXPath("*//*[contains(@content-desc,'ago')]");
        userClickChecklistButtonCheersCommentInBoard.click();
    }

    @Test
    public void userSuccessfullyCheersCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyCheersInBoard = driver.findElementByAccessibilityId("ini cheers");
        Assert.assertTrue(userSuccessfullyCheersInBoard.isDisplayed());

    }

    //User add subcriber in board
    @Test
    public void userClickPlusButtonInBoard() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userclickplusbuttoninboard = driver.findElementByXPath("//*[contains(@content-desc,'ini')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]");
        userclickplusbuttoninboard.click();
    }
    @Test
    public void userClickMember() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userclickmember = driver.findElementByAccessibilityId("Moch Nova Setyawan");
        userclickmember.click();
    }
    @Test
    public void userClickDoneButtonInCard() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userclickdonebuttonincard = driver.findElementByAccessibilityId("done");
        userclickdonebuttonincard.click();
    }
    @Test
    public void userCanAddSucriberInBoard() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement verifycanaddsubcriberinboard = driver.findElementByXPath("//*[contains(@content-desc,' ')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.ImageView[2]");
        Assert.assertTrue(verifycanaddsubcriberinboard.isDisplayed());
    }

    //User create label
    @Test
    public void userClickLabelButton() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickLabelButton = driver.findElementByXPath("*//*[contains(@content-desc,' ')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");
        userClickLabelButton.click();
    }
    @Test
    public void userClickCreateNewLabelButton() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickCreateNewLabelButton = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Create new label\"]");
        userClickCreateNewLabelButton.click();
    }
    @Test
    public void userTypeNameLabelColoumn() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeNameLabelColoumn = driver.findElement(By.xpath("*//*[contains(@text,'Name your label...')]"));
        userTypeNameLabelColoumn.click();
        userTypeNameLabelColoumn.sendKeys("ini label");
        driver.hideKeyboard();
    }
    @Test
    public void userChooseColorLabel() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userClickLabelButton = driver.findElementByXPath("*//*[contains(@index,'41')]");
        userClickLabelButton.click();

    }
    @Test
    public void userCanAddLabelInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userCanAddLabelInBoard = driver.findElementByAccessibilityId("Creating label for this board is success");
        Assert.assertTrue(userCanAddLabelInBoard.isDisplayed());
    }

    //User add label
    @Test
    public void userChooseLabel() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseLabel = driver.findElementByXPath("(//android.view.View[@content-desc=\"ini label\"])[1]");
        userChooseLabel.click();
    }

    @Test
    public void userSuccessfullyAddLabel() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyAddLabel = driver.findElementByAccessibilityId("toggle label card is success");
        Assert.assertTrue(userSuccessfullyAddLabel.isDisplayed());
    }

    //User remove label
    @Test
    public void userClickDeleteButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickDeleteButtonInBoard = driver.findElementByXPath("(//android.view.View[@content-desc=\"ini label\"])[1]/android.view.View");
        userClickDeleteButtonInBoard.click();
    }

    @Test
    public void userClickDelete() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickDelete = driver.findElementByAccessibilityId("Delete");
        userClickDelete.click();
    }

    @Test
    public void userSuccessfullyDeleteLabel() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyDeleteLabel = driver.findElementByAccessibilityId("Label has been archived");
        Assert.assertTrue(userSuccessfullyDeleteLabel.isDisplayed());
    }

    //User send attachment in board
    @Test
    public void userClickAttachFileButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickAttachFileButton = driver.findElementByAccessibilityId("Attach file");
        userClickAttachFileButton.click();
    }

    @Test
    public void userSendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSendAttachment = driver.findElementByXPath("*//*[contains(@text,'macaca_nigra_self-portrait-3e0070aa19a7fe36e802253048411a38f14a79f8-s1100-c50.jpg')]");
        userSendAttachment.click();
    }

    @Test
    public void userSuccessfullySendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySendAttachment = driver.findElementByAccessibilityId("Upload attachments is success");
        Assert.assertTrue(userSuccessfullySendAttachment.isDisplayed());
    }

    @Test
    public void userClickDotThreeButtonInAttachmentOnCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickDotThreeButtonInAttachmentOnCard = driver.findElementByXPath("(//android.widget.Button[@content-desc=\"Show menu\"])[2]");
        userClickDotThreeButtonInAttachmentOnCard.click();
    }

    @Test
    public void userClickEditTitleButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickEditTitleButton = driver.findElementByAccessibilityId("Edit Title");
        userClickEditTitleButton.click();
    }

    @Test
    public void userTypeEditNameAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeEditNameAttachment = driver.findElementByClassName("android.widget.EditText");
        userTypeEditNameAttachment.clear();
        userTypeEditNameAttachment.sendKeys("ini attachment");
    }

    @Test
    public void userClickUpdate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickUpdate = driver.findElementByAccessibilityId("Update");
        userClickUpdate.click();
    }

    @Test
    public void userSuccessfullyEditNameAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyEditNameAttachment = driver.findElementByAccessibilityId("Update attachment is success");
        Assert.assertTrue(userSuccessfullyEditNameAttachment.isDisplayed());
    }

    //User delete attachment in board
    @Test
    public void userClickRemoveInAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickRemoveInAttachment = driver.findElementByAccessibilityId("Remove");
        userClickRemoveInAttachment.click();
    }

    @Test
    public void userClickOk() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickOk = driver.findElementByAccessibilityId("Ok");
        userClickOk.click();
    }

    @Test
    public void userSuccessfullyDeleteAttachment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyDeleteAttachment = driver.findElementByAccessibilityId("Delete attachment is success");
        Assert.assertTrue(userSuccessfullyDeleteAttachment.isDisplayed());
    }

    //User makes the card private
    @Test
    public void userClickDotButtonInCard() throws InterruptedException {
        Thread.sleep(10000);
        touchAction.tap(PointOption.point(710, 462)).perform();
    }
    @Test
    public void userSetCardToPrivate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetCardToPrivate = driver.findElementByAccessibilityId("Set card to private");
        userSetCardToPrivate.click();
    }
    @Test
    public void userSuccessfullyMakesTheCardPrivate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyMakesTheCardPrivate = driver.findElementByAccessibilityId("Update card is success");
        Assert.assertTrue(userSuccessfullyMakesTheCardPrivate.isDisplayed());
    }

    //User makes the card public
    @Test
    public void userSetCardToPublic() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetCardToPublic = driver.findElementByAccessibilityId("Set card to public");
        userSetCardToPublic.click();
    }

    @Test
    public void userSuccessfullyMakesTheCardPublic() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyMakesTheCardPrivate = driver.findElementByAccessibilityId("Update card is success");
        Assert.assertTrue(userSuccessfullyMakesTheCardPrivate.isDisplayed());
    }

    //User set due date
    @Test
    public void userClickSetDueDateButton() throws InterruptedException {
        Thread.sleep(10000);
        touchAction.tap(PointOption.point(542, 827)).perform();
    }

    @Test
    public void userSetDateInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetDateInCard = driver.findElementByAccessibilityId("Next month");
        userSetDateInCard.click();
        Thread.sleep(2000);
        MobileElement userSetDateInCard2 = driver.findElementByAccessibilityId("19, Thursday, January 19, 2023");
        userSetDateInCard2.click();
    }

    @Test
    public void userClickOkInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickOkInCard = driver.findElementByAccessibilityId("OK");
        userClickOkInCard.click();
    }

    @Test
    public void userSetTimeInCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetTimeInCard = driver.findElementByAccessibilityId("Switch to text input mode");
        userSetTimeInCard.click();
        Thread.sleep(2000);
        MobileElement userSetTimeInCard2 = driver.findElementByXPath("*//*[contains(@class,'android.widget.EditText')][1]");
        userSetTimeInCard2.sendKeys("3");
        Thread.sleep(2000);
        MobileElement userSetTimeInCard3 = driver.findElementByXPath("*//*[contains(@class,'android.widget.EditText')][2]");
        userSetTimeInCard3.sendKeys("33");
        Thread.sleep(2000);
    }
    @Test
    public void userSuccessfullySetDueDate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySetDueDate = driver.findElementByAccessibilityId("update due date success");
        Assert.assertTrue(userSuccessfullySetDueDate.isDisplayed());
    }

    //User remove due date
    @Test
    public void userClickXButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetTimeInCard2 = driver.findElementByXPath("*//*[contains(@class,'android.view.View')]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");
        userSetTimeInCard2.click();
    }

    @Test
    public void userSuccessfullyRemoveDueDate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySetDueDate = driver.findElementByAccessibilityId("remove due date success");
        Assert.assertTrue(userSuccessfullySetDueDate.isDisplayed());
    }

    //User set as a complete list
    @Test
    public void userClickThreeDotButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetTimeInCard2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");
        userSetTimeInCard2.click();
    }

    @Test
    public void userSetAsACompleteList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetAsACompleteList = driver.findElementByAccessibilityId("Set as a Complete List");
        userSetAsACompleteList.click();
    }

    @Test
    public void userSuccessfullySetAsACompleteList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySetDueDate = driver.findElementByAccessibilityId("Set list as Complete is success");
        Assert.assertTrue(userSuccessfullySetDueDate.isDisplayed());
    }

    //User set as a uncomplete list
    @Test
    public void userSetAsAUncompleteList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSetAsAUncompleteList = driver.findElementByAccessibilityId("Set as a Complete List");
        userSetAsAUncompleteList.click();
    }

    @Test
    public void userSuccessfullySetAsAUncompleteList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullySetAsAUncompleteList = driver.findElementByAccessibilityId("Unset list from Complete is success");
        Assert.assertTrue(userSuccessfullySetAsAUncompleteList.isDisplayed());
    }

    //User move card list
    @Test
    public void userClickDotThreeButtonInCardMove() throws InterruptedException {
        Thread.sleep(10000);
        touchAction.tap(PointOption.point(193, 416)).perform();
    }
    @Test
    public void userClickMoveButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickMoveButton = driver.findElementByAccessibilityId("Move card");
        userClickMoveButton.click();
    }

    @Test
    public void userClickMoveList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickMoveList = driver.findElementByXPath("*//*[contains(@content-desc,'edit name list')]");
        userClickMoveList.click();
    }

    @Test
    public void userChooseMoveList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseMoveList = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        userChooseMoveList.click();
    }

    @Test
    public void userClickChecklistButtonInMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickChecklistButtonInMoveCard = driver.findElementByXPath("*//*[contains(@index,'2')][1]");
        userClickChecklistButtonInMoveCard.click();
    }

    @Test
    public void userSuccessfullyMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyMoveCard = driver.findElementByAccessibilityId("ini edit card card has been moved to ini edit name list list");
        Assert.assertTrue(userSuccessfullyMoveCard.isDisplayed());
    }

    @Test
    public void userClickDotThreeButtonInCardMove2() throws InterruptedException {
        Thread.sleep(10000);
        touchAction.tap(PointOption.point(960, 413)).perform();
    }
    @Test
    public void userChooseMoveList2() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseMoveList = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        userChooseMoveList.click();
    }

    //User archive list
    @Test
    public void userClickArchive() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickArchive = driver.findElementByAccessibilityId("Archive this list");
        userClickArchive.click();
    }

    @Test
    public void userSuccessfullyArchiveList() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyMoveCard = driver.findElementByAccessibilityId("List has been moved to archive");
        Assert.assertTrue(userSuccessfullyMoveCard.isDisplayed());
    }


    ////////////////////////////////////////////////////////////NEGATIVE////////////////////////////////////////////////////////////

    //User create new board list without words
    @Test
    public void userTypeWihoutWordsListInBoard()  throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeWihoutWordsListInBoard = driver.findElement(By.xpath("*//*[contains(@text,'Add new list...')]"));
        userTypeWihoutWordsListInBoard.sendKeys("");
    }

    @Test
    public void userUnsuccessfullyCreateNewBoardListWithoutWords()  throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userUnsuccessfullyCreateNewBoardListWithoutWords = driver.findElementByAccessibilityId("Add Board List");
        Assert.assertTrue(userUnsuccessfullyCreateNewBoardListWithoutWords.isDisplayed());
    }

    //User create new board list without words
    @Test
    public void userTypeWithoutWordsCardNameInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeWithoutWordsCardNameInBoard = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText"));
        userTypeWithoutWordsCardNameInBoard.sendKeys("");
    }

    @Test
    public void userCantSeeTheResultOfCreateNewCard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userCantSeeTheResultOfCreateNewCard = driver.findElementByAccessibilityId("Add new card");
        Assert.assertTrue(userCantSeeTheResultOfCreateNewCard.isDisplayed());
    }

    //User create new board list only with space
    @Test
    public void userTypeOnlyWithSpaceListInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeOnlyWithSpaceListInBoard = driver.findElement(By.xpath("*//*[contains(@text,'Add new list...')]"));
        userTypeOnlyWithSpaceListInBoard.sendKeys(" ");
    }

    @Test
    public void userUnsuccessfullyCreateNewBoardListOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userUnsuccessfullyCreateNewBoardListOnlyWithSpace = driver.findElementByXPath("//android.view.View[@content-desc=\" \"]");
        Assert.assertFalse(userUnsuccessfullyCreateNewBoardListOnlyWithSpace.isDisplayed());
    }

    //User create new card only with space
    @Test
    public void userTypeOnlyWithSpaceCardNameInBoard() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeOnlyWithSpaceCardNameInBoard = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText"));
        userTypeOnlyWithSpaceCardNameInBoard.sendKeys(" ");

    }

    @Test
    public void userCantSeeTheResultOfCreateNewCardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userCantSeeTheResultOfCreateNewCardOnlyWithSpace = driver.findElementByXPath("//android.widget.Button[@content-desc=\"Show menu\"]");
        Assert.assertFalse(userCantSeeTheResultOfCreateNewCardOnlyWithSpace.isDisplayed());
    }

    //User add comment in board without words
    @Test
    public void userTypeWithoutWordsComment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typelistinboard = driver.findElement(By.xpath("*//*[contains(@class,'android.widget.EditText')]"));
        typelistinboard.sendKeys("");
    }

    @Test
    public void userUnsuccessfullyAddCommentInBoardWithoutWords() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyAddCommentInBoard = driver.findElementByAccessibilityId("comments can't be empty");
        Assert.assertTrue(userSuccessfullyAddCommentInBoard.isDisplayed());
    }

    //User add comment in board only with space
    @Test
    public void userTypeOnlyWithSpaceComment() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement typelistinboard = driver.findElement(By.xpath("*//*[contains(@class,'android.widget.EditText')]"));
        typelistinboard.sendKeys(" ");
    }

    @Test
    public void userUnsuccessfullyAddCommentInBoardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyAddCommentInBoard = driver.findElementByAccessibilityId("comments can't be empty");
        Assert.assertTrue(userSuccessfullyAddCommentInBoard.isDisplayed());
    }

    //User create label without words
    @Test
    public void userTypeWithoutWordsNameLabelColoumn() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeWithoutWordsNameLabelColoumn = driver.findElement(By.xpath("*//*[contains(@text,'Name your label...')]"));
        userTypeWithoutWordsNameLabelColoumn.click();
        userTypeWithoutWordsNameLabelColoumn.sendKeys("");
        driver.hideKeyboard();
    }

    @Test
    public void userCantAddLabelInBoardWithoutWords() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullyAddCommentInBoard = driver.findElementByAccessibilityId("Add new label");
        Assert.assertTrue(userSuccessfullyAddCommentInBoard.isDisplayed());
    }

    //User create label only with space
    @Test
    public void userTypeOnlyWithSpaceNameLabelColoumn() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userTypeOnlyWithSpaceNameLabelColoumn = driver.findElement(By.xpath("*//*[contains(@text,'Name your label...')]"));
        userTypeOnlyWithSpaceNameLabelColoumn.click();
        userTypeOnlyWithSpaceNameLabelColoumn.sendKeys(" ");
        driver.hideKeyboard();
    }

    @Test
    public void userCantAddLabelInBoardOnlyWithSpace() throws InterruptedException{
        Thread.sleep(2000);
        MobileElement userSuccessfullyAddCommentInBoard = driver.findElementByAccessibilityId("Creating label for this board is success");
        Assert.assertFalse(userSuccessfullyAddCommentInBoard.isDisplayed());
    }

}

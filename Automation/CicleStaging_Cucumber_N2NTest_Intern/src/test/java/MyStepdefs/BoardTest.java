package MyStepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import Page.BoardPages;

public class BoardTest {
    public WebDriver driver;
    public BoardTest() {
        super();
        this.driver= Bypass.driver;
    }
    BoardPages BoardPage = new BoardPages();


    @When("User click board box menu")
    public void userClickBoardBoxMenu() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickboardboxmenu();
    }

    @And("User click add new list")
    public void userClickAddNewList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddnewlist();
    }

    @And("User type list Coloumn")
    public void userTypeListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typelistcoloumn();
    }

    @And("User click create button")
    public void userClickCreateButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcreatebutton();
    }

    @Then("User can see the result of create new board")
    public void userCanSeeTheResultOfCreateNewBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatenewboard();
    }

    @And("User click add card")
    public void userClickAddCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddcard();
    }

    @And("User type card name")
    public void userTypeCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typecardname();
    }

    @And("User click add card button")
    public void userClickAddCardButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddcardbutton();
    }

    @Then("User can see the result of create new card")
    public void userCanSeeTheResultOfCreateNewCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatenewcard();
    }

    @And("User click list name")
    public void userClickListName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklistname();
    }

    @And("User type edit list coloumn")
    public void userTypeEditListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditlistcoloumn();
    }

    @Then("User successfully edit board list")
    public void userSuccessfullyEditBoardList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditlist();
    }

    @And("User choose card")
    public void userChooseCard() throws InterruptedException {
        Thread.sleep(3000);
        BoardPage.Choosecard();
    }

    @And("User click card name")
    public void userClickCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcardname();
    }

    @And("User type edit card coloumn")
    public void userTypeEditCardColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditcardcoloumn();
    }

    @And("User successfully edit card")
    public void userSuccessfullyEditCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditcard();
    }

    @And("User click notes button")
    public void userClickNotesButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicknotesbutton();
    }

    @And("User type edit description")
    public void userTypeEditDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditdescription();
    }

    @And("User click Save button")
    public void userClickSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.ClickSavebutton();
    }

    @Then("User successfully edit description")
    public void userSuccessfullyEditDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditdescription();
    }

    @Then("User successfully add comment in board")
    public void userSuccessfullyAddCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyaddcomment();
    }

    @And("User click plus button in board")
    public void userClickPlusButtonInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickplusbuttoninboard();
    }

    @And("User click apply member button")
    public void userClickApplyMemberButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickapplymemberbutton();
    }

    @Then("User can add sucriber in board")
    public void userCanAddSucriberInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verfyaddsubcriberinboard();
    }

    @And("User click label button")
    public void userClickLabelButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklabelbutton();
    }

    @And("User click add label button")
    public void userClickAddLabelButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickaddlabelbutton();
    }

    @And("User type name label coloumn")
    public void userTypeNameLabelColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typenamelabelcoloumn();
    }

    @And("User choose color label")
    public void userChooseColorLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Choosecolorlabel();
    }

    @Then("User can add label in board")
    public void userCanAddLabelInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycreatelabel();
    }

    @And("User type description")
    public void userTypeDescription() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typedescription();
    }

    @And("User choose label")
    public void userChooseLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Chooselabel();
    }

    @And("User click apply labels")
    public void userClickApplyLabels() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickapplylabels();
    }

    @Then("User successfully add label")
    public void userSuccessfullyAddLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyaddlabel();
    }

    @And("User click edit label button")
    public void userClickEditLabelButton() throws InterruptedException {
        Thread.sleep(10000);
        BoardPage.Clickeditbutton();
    }

    @Then("User successfully delete label")
    public void userSuccessfullyDeleteLabel() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifydeletelabel();
    }

    @And("User click delete button in board")
    public void userClickDeleteButtonInBoard() throws InterruptedException {
        Thread.sleep(5000);
        BoardPage.Clickdeletebuttoninboard();
    }

    @And("User choose move card")
    public void userChooseMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Choosemovecard();
    }

    @And("User click move button")
    public void userClickMoveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickmovebutton();
    }

    @And("User click move list")
    public void userClickMoveList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clicklistbutton();
    }

    @And("User choose move list")
    public void userChooseMoveList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Chooseboardlist();
    }

    @And("User click move")
    public void userClickMove() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickmovebutoon();
    }

    @Then("User successfully move card")
    public void userSuccessfullyMoveCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifymovecard();
        Thread.sleep(2000);
    }

    @And("User card back to normal")
    public void userCardBackToNormal() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Closecard();
        Thread.sleep(2000);
        BoardPage.Choosemovecard2();
        Thread.sleep(2000);
        BoardPage.Clickmovebutton();
        Thread.sleep(2000);
        BoardPage.Clicklistbutton();
        Thread.sleep(2000);
        BoardPage.Chooseboardlist2();
        Thread.sleep(2000);
        BoardPage.Clickmovebutoon();
        Thread.sleep(2000);
    }

    @And("User click attachment button")
    public void userClickAttachmentButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickattachmentbutton();
    }

    @And("User send Attachment")
    public void userSendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Sendattachment();
    }

    @And("User successfully send attachment")
    public void userSuccessfullySendAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyattachment();
    }

    @And("User type link name")
    public void userTypeLinkName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typelinkname();
    }

    @And("User click update")
    public void userClickUpdate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Updatebutton();
    }

    @Then("User successfully edit name attachment")
    public void userSuccessfullyEditNameAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditattachment();
    }

    @And("User click delete in attachment")
    public void userClickDeleteInAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickdeletebuttoninattachment();
    }

    @And("User click delete")
    public void userClickDelete() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickdelete();
    }

    @Then("User successfully delete attachment")
    public void userSuccessfullyDeleteAttachment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifydeleteattachment();
    }

    @And("User click private card")
    public void userClickPrivateCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.clickprivatecard();
    }

    @Then("User successfully makes the card private")
    public void userSuccessfullyMakesTheCardPrivate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyprivatecard();
    }

    @Then("User successfully makes the card public")
    public void userSuccessfullyMakesTheCardPublic() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifypubliccard();
    }

    @And("User click public card")
    public void userClickPublicCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickpubliccard();
    }

    @And("User click due date button")
    public void userClickDueDateButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickduedatebutton();
    }

    @And("User type date")
    public void userTypeDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typedate();
    }

    @And("User type time")
    public void userTypeTime() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typetime();
    }

    @Then("User successfully set due date")
    public void userSuccessfullySetDueDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifysetduedate();
    }

    @And("User click remove button")
    public void userClickRemoveButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickremovebutton();
    }

    @Then("User successfully remove due date")
    public void userSuccessfullyRemoveDueDate() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyremoveduedate();
    }

    @And("User click edit")
    public void userClickEdit() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickedit();
    }

    @And("User type comment")
    public void userTypeComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typecomment();
    }

    @And("User click post button")
    public void Clickpostinblash() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickpost();
    }

    @And("User click archive")
    public void userClickArchive() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickarchive();
    }

    @Then("User successfully archive card")
    public void userSuccessfullyArchiveCard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyarchivecard();
    }

    @And("User click three dot button")
    public void userClickThreeDotButton() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickdothree();
    }

    @And("User set as a complete list")
    public void userSetAsACompleteList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcompletelist();
    }

    @Then("User successfully set as a complete list")
    public void userSuccessfullySetAsACompleteList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycompletelist();
    }

    @And("User set as a uncomplete list")
    public void userSetAsAUncompleteList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickuncompletelist();
    }

    @Then("User successfully set as a uncomplete list")
    public void userSuccessfullySetAsAUncompleteList() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyuncompletelist();
    }

    @And("User click three dot button in comment")
    public void userClickThreeDotButtonInComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickthreebuttonincomment();
    }

    @And("User type edit comment")
    public void userTypeEditComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typeeditcommentinblash();
    }

    @And("User click edit button in comment")
    public void userClickEditButtonInComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickeditbuttonincomment();
    }

    @Then("User successfully edit comment in board")
    public void userSuccessfullyEditCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyeditcomment();
    }
    //User cheers in board
    @And("User click cheers in board")
    public void userClickCheersInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcheersinboard();
    }

    @And("User type cheers")
    public void userTypeCheers() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typecheers();
    }

    @And("User click checklist button cheers in board")
    public void userClickChecklistButtonCheersInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickchecklistbuttoncheersinboard();
    }

    @Then("User successfully cheers in board")
    public void userSuccessfullyCheersInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycheersinboard();
    }

    //User cheers comment in board
    @And("User click cheers comment in board")
    public void userClickCheersCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Clickcheerscommentinboard();
    }

    @Then("User successfully cheers comment in board")
    public void userSuccessfullyCheersCommentInBoard() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycheerscommentinboard();
    }

    //CREATE NEW BOARDLIST WITHOUT WORDS
    @And("User type without words list Coloumn")
    public void userTypeWithoutWordsListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewihoutwordslistcoloumn();
    }

    @Then("User cant see the result of create new board without words")
    public void userCantSeeTheResultOfCreateNewBoardWithoutWords() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatenewboardwithoutword();
    }
    ////////////////////////////////////////////////////////////NEGATIVE////////////////////////////////////////////////////////////

    //CREATE NEW BOARDLIST WITH ONLY SPACE
    @And("User type only with space list Coloumn")
    public void userTypeOnlyWithSpaceListColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewithonlyspacelistcoloumn();
    }

    @Then("User cant see the result of create new board only with space")
    public void userCantSeeTheResultOfCreateNewBoardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatenewboardwithonlyspace();
    }

    //CREATE NEW CARD WITHOUT WORDS
    @And("User type without words card name")
    public void userTypeWithoutWordsCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewihoutwordscardname();
    }

    @Then("User cant see the result of create new card without words")
    public void userCantSeeTheResultOfCreateNewCardWithoutWords() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatenewcardwihoutwords();
    }

    //CREATE NEW CARD WITH ONLY SPACE
    @And("User type only with space card name")
    public void userTypeOnlyWithSpaceCardName() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewithonlyspacescardname();
    }

    @Then("User cant see the result of create new card only with space")
    public void userCantSeeTheResultOfCreateNewCardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatenewcardwithonlyspace();
    }

    //ADD COMMENT WITHOUT WORDS
    @And("User type without words comment")
    public void userTypeWithoutWordsComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewihoutwordscommentinboard();
    }

    @Then("User unsuccessfully add comment in board without words")
    public void userUnsuccessfullyAddCommentInBoardWithoutWords() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifyaddcommentinboardwihoutwords();
    }

    //ADD COMMENT WITH ONLY SPACE
    @And("User type only with space comment")
    public void userTypeOnlyWithSpaceComment() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typecommentinboardwithonlyspace();
    }

    @Then("User unsuccessfully add comment in board only with space")
    public void userUnsuccessfullyAddCommentInBoardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantaddcommentinboardwithonlyspace();
    }

    //CREATE LABEL WITHOUT WORDS
    @And("User type without words name label coloumn")
    public void userTypeWithoutWordsNameLabelColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewihoutwordsnamelabelcoloumn();
    }

    @Then("User cant add label in board without words")
    public void userCantAddLabelInBoardWithoutWords() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatelabelwihoutwords();
    }

    //CREATE LABEL ONLY WITH SPACE
    @And("User type only with space name label coloumn")
    public void userTypeOnlyWithSpaceNameLabelColoumn() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Typewithonlyspacenamelabelcoloumn();
    }

    @Then("User cant add label in board only with space")
    public void userCantAddLabelInBoardOnlyWithSpace() throws InterruptedException {
        Thread.sleep(2000);
        BoardPage.Verifycantcreatelabelwithonlyspace();
    }
}

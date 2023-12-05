package MyStepdefs;


import Config.Base;
import Pages.BoardPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class BoardTest extends Base {

    BoardPages boardPages = new BoardPages();

    //User create new board list
    @And("User click on Board menu")
    public void userClickOnBoardMenu() throws InterruptedException {
        boardPages.userClickOnBoardMenu();
    }

    @And("User click add new list")
    public void userClickAddNewList() throws InterruptedException {
        boardPages.userClickAddNewList();
    }

    @And("User type list in board")
    public void userTypeListInBoard() throws InterruptedException {
        boardPages.userTypeListInBoard();
    }

    @And("User click submit button in board")
    public void userClickSubmitButtonInBoard() throws InterruptedException {
        boardPages.userClickSubmitButtonInBoard();
    }

    @Then("User successfully create new board list")
    public void userSuccessfullyCreateNewBoardList() throws InterruptedException {
        boardPages.userSuccessfullyCreateNewBoardList();
    }

    //User create new card
    @And("User click add card in board")
    public void userClickAddCardInBoard() throws InterruptedException {
        boardPages.userClickAddCardInBoard();

    }

    @And("User type card name in board")
    public void userTypeCardNameInBoard() throws InterruptedException {
        boardPages.userTypeCardNameInBoard();
    }

    @And("User click checklist button in board")
    public void userChecklistButtonInBoard() throws InterruptedException {
        boardPages.userChecklistButtonInBoard();
    }

    @Then("User can see the result of create new card")
    public void userCanSeeTheResultOfCreateNewCard() throws InterruptedException {
        boardPages.userCanSeeTheResultOfCreateNewCard();
    }

    //User edit board list name
    @And("User double click list name")
    public void userDoubleClickListName() throws InterruptedException {
        boardPages.userDoubleClickListName();
    }

    @And("User type edit list")
    public void userTypeEditList() throws InterruptedException {
        boardPages.userTypeEditList();
    }

    @And("User click checklist button in list")
    public void userClickChecklistButtonInList() throws InterruptedException {
        boardPages.userClickChecklistButtonInList();
    }

    @Then("User successfully edit board list name")
    public void userSuccessfullyEditBoardListName() throws InterruptedException {
        boardPages.userSuccessfullyEditBoardListName();
    }

    //User edit card
    @And("User choose card")
    public void userChooseCard() throws InterruptedException {
        boardPages.userChooseCard();
    }

    @And("User click edit card name button")
    public void userClickEditCardNameButton() throws InterruptedException {
        boardPages.userClickEditCardNameButton();
    }

    @And("User type edit card")
    public void userTypeEditCard() throws InterruptedException {
        boardPages.userTypeEditCard();

    }

    @And("User click checklist button in card")
    public void userClickChecklistButtonInCard() throws InterruptedException {
        boardPages.userClickChecklistButtonInCard();

    }

    @Then("User successfully edit card")
    public void userSuccessfullyEditCard() throws InterruptedException {
        boardPages.userSuccessfullyEditCard();
    }

    //User add description in card
    @And("User click edit description card  button")
    public void userClickEditDescriptionCardButton() throws InterruptedException {
        boardPages.userClickEditDescriptionCardButton();
    }

    @And("User type description in card")
    public void userTypeDescriptionInCard() throws InterruptedException {
        boardPages.userTypeDescriptionInCard();
    }

    @And("User click publish in card")
    public void userClickPublishInCard() throws InterruptedException {
        boardPages.userClickPublishInCard();

    }

    @Then("User successfully add description in card")
    public void userSuccessfullyAddDescriptionInCard() throws InterruptedException{
        boardPages.userSuccessfullyAddDescriptionInCard();
    }

    //User edit description in card
    @And("User type edit description in card")
    public void userTypeEditDescriptionInCard() throws InterruptedException {
        boardPages.userTypeEditDescriptionInCard();
    }
    @Then("User successfully edit description in card")
    public void userSuccessfullyEditDescriptionInCard() throws InterruptedException {
        boardPages.userSuccessfullyEditDescriptionInCard();
    }

    //User add comment in board
    @And("User click add new comment")
    public void userClickAddNewComment() throws InterruptedException {
        boardPages.userClickAddNewComment();
    }

    @And("User type comment")
    public void userTypeComment() throws InterruptedException {
        boardPages.userTypeComment();
    }

    @Then("User successfully add comment in board")
    public void userSuccessfullyAddCommentInBoard() throws InterruptedException {
        boardPages.userSuccessfullyAddCommentInBoard();
    }

    //User edit comment in board
    @And("User click three dot button in comment")
    public void userClickThreeButtonInComment() throws InterruptedException {
        boardPages.userClickThreeButtonInComment();
    }

    @And("User click edit comment button in board")
    public void userEditCommentButtonInBoard() throws InterruptedException {
        boardPages.userEditCommentButtonInBoard();
    }
    @And("User type edit comment")
    public void userTypeEditComment() throws InterruptedException {
        boardPages.userTypeEditComment();
    }
    @Then("User successfully edit comment in board")
    public void userSuccessfullyEditCommentInBoard() throws InterruptedException {
        boardPages.userSuccessfullyEditCommentInBoard();
    }

    //User cheers in board
    @And("User click cheers in board")
    public void userClickCheersInBoard() throws InterruptedException {
        boardPages.userClickCheersInBoard();
    }

    @And("User type cheers")
    public void userTypeCheers() throws InterruptedException {
        boardPages.userTypeCheers();
    }

    @And("User click checklist button cheers in board")
    public void userClickChecklistButtonCheersInBoard() throws InterruptedException {
        boardPages.userClickChecklistButtonCheersInBoard();
    }

    @And("User successfully cheers in board")
    public void userSuccessfullyCheersInBoard() throws InterruptedException {
        boardPages.userSuccessfullyCheersInBoard();
    }

    //User cheers comment in board
    @And("User click cheers comment in board")
    public void userClickCheersCommentInBoard() throws InterruptedException {
        boardPages.userClickCheersCommentInBoard();
    }

    @And("User click checklist button cheers comment  in board")
    public void userClickChecklistButtonCheersCommentInBoard() throws InterruptedException {
        boardPages.userClickChecklistButtonCheersCommentInBoard();
    }

    @And("User successfully cheers comment in board")
    public void userSuccessfullyCheersCommentInBoard() throws InterruptedException {
        boardPages.userSuccessfullyCheersCommentInBoard();
    }

    //User add subcriber in board
    @And("User click plus button in board")
    public void userClickPlusButtonInBoard() throws InterruptedException {
        boardPages.userClickPlusButtonInBoard();
    }

    @And("User click member")
    public void userClickMember() throws InterruptedException {
        boardPages.userClickMember();
    }

    @And("User click done button in card")
    public void userClickDoneButtonInCard() throws InterruptedException {
        boardPages.userClickDoneButtonInCard();
    }

    @Then("User can add sucriber in board")
    public void userCanAddSucriberInBoard() throws InterruptedException {
        boardPages.userCanAddSucriberInBoard();
    }

    //User create label
    @And("User click label button")
    public void userClickLabelButton() throws InterruptedException {
        boardPages.userClickLabelButton();
    }
    @And("User click create new label button")
    public void userClickCreateNewLabelButton() throws InterruptedException {
        boardPages.userClickCreateNewLabelButton();
    }
    @And("User type name label coloumn")
    public void userTypeNameLabelColoumn() throws InterruptedException {
        boardPages.userTypeNameLabelColoumn();
    }
    @And("User choose color label")
    public void userChooseColorLabel() throws InterruptedException {
        boardPages.userChooseColorLabel();
    }
    @Then("User can add label in board")
    public void userCanAddLabelInBoard() throws InterruptedException {
        boardPages.userCanAddLabelInBoard();
    }

    //User add label
    @And("User choose label")
    public void userChooseLabel() throws InterruptedException {
        boardPages.userChooseLabel();
    }
    @Then("User successfully add label")
    public void userSuccessfullyAddLabel() throws InterruptedException {
        boardPages.userSuccessfullyAddLabel();
    }

    //User remove label
    @And("User click delete button in board")
    public void userClickDeleteButtonInBoard() throws InterruptedException {
        boardPages.userClickDeleteButtonInBoard();
    }

    @And("User click delete")
    public void userClickDelete() throws InterruptedException {
        boardPages.userClickDelete();
    }

    @Then("User successfully delete label")
    public void userSuccessfullyDeleteLabel() throws InterruptedException {
        boardPages.userSuccessfullyDeleteLabel();
    }

    //send attachment
    @And("User click attach file button")
    public void userClickAttachFileButton() throws InterruptedException {
        boardPages.userClickAttachFileButton();
    }

    @And("User send Attachment")
    public void userSendAttachment() throws InterruptedException {
        boardPages.userSendAttachment();
    }

    @Then("User successfully send attachment")
    public void userSuccessfullySendAttachment() throws InterruptedException {
        boardPages.userSuccessfullySendAttachment();
    }

    //edit attachment name
    @And("User click dot three button in attachment on card")
    public void userClickDotThreeButtonInAttachmentOnCard() throws InterruptedException {
        boardPages.userClickDotThreeButtonInAttachmentOnCard();
    }

    @And("User click edit title button")
    public void userClickEditTitleButton() throws InterruptedException {
        boardPages.userClickEditTitleButton();
    }

    @And("User type edit name attachment")
    public void userTypeEditNameAttachment() throws InterruptedException {
        boardPages.userTypeEditNameAttachment();
    }

    @And("User click update")
    public void userClickUpdate() throws InterruptedException {
        boardPages.userClickUpdate();
    }

    @Then("User successfully edit name attachment")
    public void userSuccessfullyEditNameAttachment() throws InterruptedException {
        boardPages.userSuccessfullyEditNameAttachment();
    }

    //User delete attachment in board
    @And("User click remove in attachment")
    public void userClickRemoveInAttachment() throws InterruptedException {
        boardPages.userClickRemoveInAttachment();
    }

    @And("User click ok")
    public void userClickOk() throws InterruptedException {
        boardPages.userClickOk();
    }

    @Then("User successfully delete attachment")
    public void userSuccessfullyDeleteAttachment() throws InterruptedException {
        boardPages.userSuccessfullyDeleteAttachment();
    }

    //User makes the card private
    @And("User click dot three button in card")
    public void userClickDotButtonInCard() throws InterruptedException {
        boardPages.userClickDotButtonInCard();
    }

    @And("User set card to private")
    public void userSetCardToPrivate() throws InterruptedException {
        boardPages.userSetCardToPrivate();
    }

    @Then("User successfully makes the card private")
    public void userSuccessfullyMakesTheCardPrivate() throws InterruptedException {
        boardPages.userSuccessfullyMakesTheCardPrivate();
    }

    //User makes the card public
    @And("User set card to public")
    public void userSetCardToPublic() throws InterruptedException {
        boardPages.userSetCardToPublic();
    }

    @Then("User successfully makes the card public")
    public void userSuccessfullyMakesTheCardPublic() throws InterruptedException {
        boardPages.userSuccessfullyMakesTheCardPublic();
    }

    //User set due date
    @And("User click set due date button")
    public void userClickSetDueDateButton() throws InterruptedException {
        boardPages.userClickSetDueDateButton();
    }

    @And("User set date in card")
    public void userSetDateInCard() throws InterruptedException {
        boardPages.userSetDateInCard();
    }

    @And("user click ok in card")
    public void userClickOkInCard() throws InterruptedException {
        boardPages.userClickOkInCard();
    }

    @And("User set time in card")
    public void userSetTimeInCard() throws InterruptedException {
        boardPages.userSetTimeInCard();
    }

    @Then("User successfully set due date")
    public void userSuccessfullySetDueDate() throws InterruptedException {
        boardPages.userSuccessfullySetDueDate();
    }

    //User remove due date
    @And("User click x button")
    public void userClickXButton() throws InterruptedException {
        boardPages.userClickXButton();
    }

    @Then("User successfully remove due date")
    public void userSuccessfullyRemoveDueDate() throws InterruptedException {
        boardPages.userSuccessfullyRemoveDueDate();
    }

    //User set as a complete list
    @And("User click three dot button")
    public void userClickThreeDotButton() throws InterruptedException {
        boardPages.userClickThreeDotButton();
    }

    @And("User set as a complete list")
    public void userSetAsACompleteList() throws InterruptedException {
        boardPages.userSetAsACompleteList();
    }

    @Then("User successfully set as a complete list")
    public void userSuccessfullySetAsACompleteList() throws InterruptedException {
        boardPages.userSuccessfullySetAsACompleteList();
    }

    //User set as a uncomplete list
    @And("User set as a uncomplete list")
    public void userSetAsAUncompleteList() throws InterruptedException {
        boardPages.userSetAsAUncompleteList();
    }

    @Then("User successfully set as a uncomplete list")
    public void userSuccessfullySetAsAUncompleteList() throws InterruptedException {
        boardPages.userSuccessfullySetAsAUncompleteList();
    }

    //User move card list
    @And("user create new list for move card")
    public void userCreateNewListForMoveCard() throws InterruptedException {
        boardPages.userClickAddNewList();
        boardPages.userTypeEditList();
        boardPages.userClickSubmitButtonInBoard();
    }
    @And("User click dot three button in card move")
    public void userClickDotThreeButtonInCardMove() throws InterruptedException {
        boardPages.userClickDotThreeButtonInCardMove();
    }
    @And("User click move button")
    public void userClickMoveButton() throws InterruptedException {
        boardPages.userClickMoveButton();
    }

    @And("User click move list")
    public void userClickMoveList() throws InterruptedException {
        boardPages.userClickMoveList();
    }

    @And("User choose move list")
    public void userChooseMoveList() throws InterruptedException {
        boardPages.userChooseMoveList();
    }

    @And("User click checklist button in move card")
    public void userClickChecklistButtonInMoveCard() throws InterruptedException {
        boardPages.userClickChecklistButtonInMoveCard();
    }

    @Then("User successfully move card")
    public void userSuccessfullyMoveCard() throws InterruptedException {
        boardPages.userSuccessfullyMoveCard();
    }
    @And("Card back to normaly")
    public void cardBackToNormaly() throws InterruptedException {
        boardPages.userClickDotThreeButtonInCardMove2();
        boardPages.userClickMoveButton();
        boardPages.userClickMoveList();
        boardPages.userChooseMoveList2();
        boardPages.userClickChecklistButtonInMoveCard();
    }

    //User archive list
    @And("User click archive")
    public void userClickArchive() throws InterruptedException {
        boardPages.userClickArchive();
    }

    @Then("User successfully archive list")
    public void userSuccessfullyArchiveList() throws InterruptedException {
        boardPages.userSuccessfullyArchiveList();
    }

    ////////////////////////////////////////////////////////////NEGATIVE////////////////////////////////////////////////////////////

    //User create new board list without words
    @And("User type wihout words list in board")
    public void userTypeWihoutWordsListInBoard() throws InterruptedException {
        boardPages.userTypeWihoutWordsListInBoard();
    }

    @Then("User unsuccessfully create new board list without words")
    public void userUnsuccessfullyCreateNewBoardListWithoutWords() throws InterruptedException {
        boardPages.userUnsuccessfullyCreateNewBoardListWithoutWords();
    }

    @And("User type without words card name in board")
    public void userTypeWithoutWordsCardNameInBoard() throws InterruptedException {
        boardPages.userTypeWithoutWordsCardNameInBoard();
    }

    @Then("User cant see the result of create new card")
    public void userCantSeeTheResultOfCreateNewCard() throws InterruptedException {
        boardPages.userCantSeeTheResultOfCreateNewCard();
    }

    //User create new board list only with space
    @And("User type only with space list in board")
    public void userTypeOnlyWithSpaceListInBoard() throws InterruptedException {
        boardPages.userTypeOnlyWithSpaceListInBoard();
    }

    @Then("User unsuccessfully create new board list only with space")
    public void userUnsuccessfullyCreateNewBoardListOnlyWithSpace() throws InterruptedException {
        boardPages.userUnsuccessfullyCreateNewBoardListOnlyWithSpace();
    }

    //User create new card only with space
    @And("User type only with space card name in board")
    public void userTypeOnlyWithSpaceCardNameInBoard() throws InterruptedException {
        boardPages.userTypeOnlyWithSpaceCardNameInBoard();
    }

    @Then("User cant see the result of create new card only with space")
    public void userCantSeeTheResultOfCreateNewCardOnlyWithSpace() throws InterruptedException {
        boardPages.userCantSeeTheResultOfCreateNewCardOnlyWithSpace();
    }

    //User add comment in board without words
    @And("User type without words comment")
    public void userTypeWithoutWordsComment() throws InterruptedException {
        boardPages.userTypeWithoutWordsComment();
    }

    @Then("User unsuccessfully add comment in board without words")
    public void userUnsuccessfullyAddCommentInBoardWithoutWords() throws InterruptedException {
        boardPages.userUnsuccessfullyAddCommentInBoardWithoutWords();
    }

    //User add comment in board only with space
    @And("User type only with space comment")
    public void userTypeOnlyWithSpaceComment() throws InterruptedException {
        boardPages.userTypeOnlyWithSpaceComment();
    }

    @Then("User unsuccessfully add comment in board only with space")
    public void userUnsuccessfullyAddCommentInBoardOnlyWithSpace() throws InterruptedException {
        boardPages.userUnsuccessfullyAddCommentInBoardOnlyWithSpace();
    }

    //User create label without words
    @And("User type without words name label coloumn")
    public void userTypeWithoutWordsNameLabelColoumn() throws InterruptedException{
        boardPages.userTypeWithoutWordsNameLabelColoumn();
    }

    @Then("User cant add label in board without words")
    public void userCantAddLabelInBoardWithoutWords() throws InterruptedException{
        boardPages.userCantAddLabelInBoardWithoutWords();
    }

    //User create label only with space
    @And("User type only with space name label coloumn")
    public void userTypeOnlyWithSpaceNameLabelColoumn() throws InterruptedException{
        boardPages.userTypeOnlyWithSpaceNameLabelColoumn();
    }

    @Then("User cant add label in board only with space")
    public void userCantAddLabelInBoardOnlyWithSpace() throws InterruptedException{
        boardPages.userCantAddLabelInBoardOnlyWithSpace();
    }
}

package Page;

import MyStepdefs.Bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class BoardPages extends Bypass {

    public BoardPages() {

        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/6399ea5710c3ea9d8bec1379/boards/6399ea5710c3ea9d8bec13f5");
    }

    //CREATE BOARD
    By clickboardboxmenu = By.xpath("//h1[normalize-space()='Board']");
    By clickaddnewlist = By.cssSelector("[class=\"CreateListButton_buttonBottom__16OpZ\"]");
    By typelistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By clickcreatebutton = By.cssSelector("[class=\"btn btn-success btn-sm\"]");
    By verifycreatenewboard = By.xpath("//*[contains(text(),'Creating list is success')]");

    public void Clickboardboxmenu() {
        driver.findElement(clickboardboxmenu).click();
    }

    public void Clickaddnewlist() {
        driver.findElement(clickaddnewlist).click();
    }

    public void Typelistcoloumn() {
        driver.findElement(typelistcoloumn).sendKeys("ini board");
    }

    public void Clickcreatebutton() {
        driver.findElement(clickcreatebutton).click();
    }

    public void Verifycreatenewboard() {
        WebElement verifyCreatenewboard = driver.findElement(verifycreatenewboard);
        Assert.assertTrue(verifyCreatenewboard.isDisplayed());
    }

    //CREATE CARD
    By clickaddcard = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div[4]");
    By typecardname = By.xpath("//input[@placeholder='Card name']");
    By clickaddcardbutton = By.cssSelector("[class=\"btn btn-success btn-sm\"]");
    By Verifycreatenewcard = By.xpath("//*[contains(text(),'Creating card is success')]");

    public void Clickaddcard() {
        driver.findElement(clickaddcard).click();
    }

    public void Typecardname() {
        driver.findElement(typecardname).sendKeys("ini card");
    }

    public void Clickaddcardbutton() {
        driver.findElement(clickaddcardbutton).click();
    }

    public void Verifycreatenewcard() {
        WebElement verifyCreatenewcard = driver.findElement(Verifycreatenewcard);
        Assert.assertTrue(verifyCreatenewcard.isDisplayed());
    }

    //EDIT LIST
    By clicklistname = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div/div/div");
    By typeeditlistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifyeditlist = By.xpath("//*[contains(text(),'Update list is success')]");

    public void Clicklistname() {
        driver.findElement(clicklistname).click();
    }

    public void Typeeditlistcoloumn() {
        driver.findElement(typeeditlistcoloumn).clear();
        driver.findElement(typeeditlistcoloumn).sendKeys("ini edit list");
        driver.findElement(typeeditlistcoloumn).sendKeys(Keys.ENTER);
    }

    public void Verifyeditlist() {
        WebElement verifyEditlist = driver.findElement(verifyeditlist);
        Assert.assertTrue(verifyEditlist.isDisplayed());
    }

    //EDIT CARD
    By choosecard = By.xpath("//*[@class=\"List_List__30q9z\"][last()]/div/div/div[3]/div/div/div/div/div[1]");
    By clickcardname = By.cssSelector("[class=\"modal-title h4\"]");
    By typeeditcardcoloumn = By.cssSelector("[class=\"ChangeNameForm_teamName__VbXNI form-control\"]");
    By verifyeditcard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Choosecard() {
        driver.findElement(choosecard).click();
    }

    public void Clickcardname() {
        driver.findElement(clickcardname).click();
    }

    public void Typeeditcardcoloumn() {
        driver.findElement(typeeditcardcoloumn).clear();
        driver.findElement(typeeditcardcoloumn).sendKeys("ini edit card");
        driver.findElement(typeeditcardcoloumn).sendKeys(Keys.ENTER);
    }

    public void Verifyeditcard() {
        WebElement verifyEditcard = driver.findElement(verifyeditcard);
        Assert.assertTrue(verifyEditcard.isDisplayed());
    }

    //EDIT DESCRIPTION
    By clicknotesbutton = By.xpath("//div[@class='ManageDesc_editIcon__1I0bY']//*[name()='svg']");
    By typeeditdescription = By.cssSelector("[class=\"fr-element fr-view\"]");
    By clicksavebutton = By.xpath("//*[contains(text(),'Save')]");
    By verifyeditdescription = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clicknotesbutton() {
        driver.findElement(clicknotesbutton).click();
    }

    public void Typeeditdescription() {
        driver.findElement(typeeditdescription).clear();
        driver.findElement(typeeditdescription).sendKeys("ini edit deskripsi");
    }

    public void ClickSavebutton() {
        driver.findElement(clicksavebutton).click();
    }

    public void Verifyeditdescription() {
        WebElement verifyEditdescription = driver.findElement(verifyeditdescription);
        Assert.assertTrue(verifyEditdescription.isDisplayed());
    }

    //ADD COMMENT
    By verifyaddcommentinboard = By.xpath("//*[contains(text(),'Create comment is success')]");
    By typecommentinblash = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By clickpostinblash = By.xpath("//*[contains(text(),'Post')]");
    By clickcommentcoloumninblash = By.xpath("//*[@class=\"Main_input__qq9k9 Main_secondary__2bXP3\"]");

    public void Verifyaddcomment() {
        WebElement verifyAddcommentinboard = driver.findElement(verifyaddcommentinboard);
        Assert.assertTrue(verifyAddcommentinboard.isDisplayed());
    }

    public void Typecomment() {
        driver.findElement(clickcommentcoloumninblash).click();
        driver.findElement(typecommentinblash).sendKeys("ini comment");
    }

    public void Clickpost() {
        driver.findElement(clickpostinblash).click();
    }

    //EDIT COMMENT
    By clickthreebuttonincomment = By.xpath("//*[@class=\"More_container__2VGML\"][1]");
    By typeeditcommentinblash = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By clickeditbuttonincomment = By.cssSelector("[class=\"Item_icon__1ol20 Item_iconDefault__3jBgF\"]");
    By verifyeditcomment = By.xpath("//*[contains(text(),'Update comment is success')]");

    public void Clickthreebuttonincomment() {
        driver.findElement(clickthreebuttonincomment).click();
    }

    public void Clickeditbuttonincomment() {
        driver.findElement(clickeditbuttonincomment).click();
    }

    public void Typeeditcommentinblash() {
        driver.findElement(typeeditcommentinblash).clear();
        driver.findElement(typeeditcommentinblash).sendKeys("ini edit comment");
    }

    public void Verifyeditcomment() {
        WebElement verifyEditcomment = driver.findElement(verifyeditcomment);
        Assert.assertTrue(verifyEditcomment.isDisplayed());
    }

    //ADD ALL SUBCRIBER
    By clickplusbuttoninboard = By.cssSelector("[class=\"Members_plusButton__26WlU\"]");
    By clickapplymemberbutton = By.xpath("//*[contains(text(),'Apply Members')]");
    By verfyaddsubcriberinboard = By.xpath("//*[contains(text(),'Toggle members successful')]");

    public void Clickplusbuttoninboard() {
        driver.findElement(clickplusbuttoninboard).click();
    }

    public void Clickapplymemberbutton() {
        driver.findElement(clickapplymemberbutton).click();
    }

    public void Verfyaddsubcriberinboard() {
        driver.findElement(verfyaddsubcriberinboard).click();
    }

    //CREATE LABEL
    By clicklabelbutton = By.xpath("//div[@class='Button_container__1WNuB'][normalize-space()='Labels']");
    By clickaddlabelbutton = By.cssSelector("[class=\"ToggleLabels_plusButton__3YgnQ\"]");
    By typenamelabelcoloumn = By.cssSelector("[class=\"form-control\"]");
    By choosecolorlabel = By.xpath("//div[13]");
    By verifycreatelabel = By.xpath("//*[contains(text(),'Creating label for this board is success')]");

    public void Clicklabelbutton() {
        driver.findElement(clicklabelbutton).click();
    }

    public void Clickaddlabelbutton() {
        driver.findElement(clickaddlabelbutton).click();
    }

    public void Typenamelabelcoloumn() {
        driver.findElement(typenamelabelcoloumn).sendKeys("label");
    }

    public void Choosecolorlabel() {
        driver.findElement(choosecolorlabel).click();
    }

    public void Verifycreatelabel() {
        WebElement verifyCreatelabel = driver.findElement(verifycreatelabel);
        Assert.assertTrue(verifyCreatelabel.isDisplayed());
    }

    //ADD DESCRIPTION
    By typedescription = By.cssSelector("[class=\"fr-element fr-view\"]");
    By clickdescriptioncolloumn = By.cssSelector("[class=\"ManageDesc_sectionEmptyDesc__md0ll\"]");

    public void Typedescription() {
        driver.findElement(clickdescriptioncolloumn).click();
        driver.findElement(typedescription).sendKeys("ini deskripsi");
    }

    //ADD LABEL
    By chooselabel = By.xpath("//*[@class=\"BoxPopOver_BoxPopOver__1vCj0\"]/div[5]/div[last()]/div");
    By clickapplylabels = By.xpath("//*[@class=\"BoxPopOver_BoxPopOver__1vCj0\"]/div[6]/button/div");
    By verifyaddlabel = By.xpath("//*[contains(text(),'toggle multiple labels card is success')]");

    public void Chooselabel() {
        driver.findElement(chooselabel).click();
    }

    public void Clickapplylabels() {
        driver.findElement(clickapplylabels).click();
    }

    public void Verifyaddlabel() {
        WebElement verifyAddlabel = driver.findElement(verifyaddlabel);
        Assert.assertTrue(verifyAddlabel.isDisplayed());
    }

    //DELETE LABEL
    By clickdeletebuttoninboard = By.xpath("//*[contains(text(),'Delete')]");
    By clickeditbutton = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium ToggleLabels_ToggleLabelsContainer__editIcon__3v47q css-vubbuv\"][1]");
    By verifydeletelabel = By.xpath("//*[contains(text(),'toggle label card is success')]");

    public void Clickeditbutton() {
        driver.findElement(clickeditbutton).click();
    }

    public void Clickdeletebuttoninboard() {
        driver.findElement(clickdeletebuttoninboard).click();
    }

    public void Verifydeletelabel() {
        WebElement verifyDeletelabel = driver.findElement(verifydeletelabel);
        Assert.assertTrue(verifyDeletelabel.isDisplayed());
    }

    //MOVE CARD
    By choosemovecard = By.xpath("//*[@class=\"List_List__30q9z\"][2]/div/div/div[3]/div/div/div/div/div[1]");
    By choosemovecard2 = By.xpath("//*[@class=\"List_List__30q9z\"][1]/div/div/div[3]/div/div/div/div/div[1]");
    By clickmovebutton = By.cssSelector("[data-testid=\"DoubleArrowIcon\"]");
    By clicklistbutton = By.xpath("//*[@class=\"ManageMoveCard_listSection__2sf4E\"]/div[1]");
    By chooseboardlist = By.xpath("//*[@class=\"ListNameOption_listSection__2cM1h\"][1]");
    By chooseboardlist2 = By.xpath("//*[@class=\"ListNameOption_listSection__2cM1h\"][2]");
    By clickmovebutoon = By.xpath("//div[contains(text(),'Move')]");
    By verifymovecard = By.xpath("//div[contains(text(),'Success!')]");
    By closecard = By.cssSelector("[class=\"close\"]");

    public void Choosemovecard() {
        driver.findElement(choosemovecard).click();
    }

    public void Clickmovebutton() {
        driver.findElement(clickmovebutton).click();
    }

    public void Clicklistbutton() {
        driver.findElement(clicklistbutton).click();
    }

    public void Chooseboardlist() {
        driver.findElement(chooseboardlist).click();
    }

    public void Clickmovebutoon() {
        driver.findElement(clickmovebutoon).click();
    }

    public void Verifymovecard() {
        WebElement VerifyMovecard = driver.findElement(verifymovecard);
        Assert.assertTrue(VerifyMovecard.isDisplayed());
    }

    public void Choosemovecard2() {
        driver.findElement(choosemovecard2).click();
    }

    public void Chooseboardlist2() {
        driver.findElement(chooseboardlist2).click();
    }

    public void Closecard() {
        driver.findElement(closecard).click();
    }

    //SEND ATTACHMENT
    By clickattachmentbutton = By.cssSelector(".ManageAttachments_askDropContainer__aTIyn");
    By sendattachment = By.xpath("//div[@class=\"AttachFileContainer_container__3U9Wh\"]/input[1]");
    By verifyattachment = By.xpath("//*[contains(text(),'Upload attachments is success')]");

    public void Clickattachmentbutton() {
        driver.findElement(clickattachmentbutton).click();

    }

    public void Sendattachment() {
        WebElement upload_file = driver.findElement(sendattachment);
        upload_file.sendKeys("C:\\Users\\62812\\OneDrive\\Pictures\\index.png");
    }

    public void Verifyattachment() {
        WebElement verifyAttachment = driver.findElement(verifyattachment);
        Assert.assertTrue(verifyAttachment.isDisplayed());
    }

    //EDIT ATTACHMENT
    By typelinkname = By.cssSelector(".form-control");
    By updatebutton = By.xpath("//*[@class=\"btn btn-success btn-sm\"]");
    By clickedit = By.xpath("//*[contains(text(),'Edit')]");
    By verifyeditattachment = By.xpath("//*[contains(text(),'Update attachment is success')]");

    public void Typelinkname() {
        driver.findElement(typelinkname).click();
        driver.findElement(typelinkname).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typelinkname).sendKeys("INIEDITATTACHMENT.png");
    }
    public void Clickedit() {
        driver.findElement(clickedit).click();
    }
    public void Updatebutton() {
        driver.findElement(updatebutton).click();
    }

    public void Verifyeditattachment() {
        WebElement verifyEditattachment = driver.findElement(verifyeditattachment);
        Assert.assertTrue(verifyEditattachment.isDisplayed());
    }

    //DELETE ATTACHMENT
    By clickdeletebuttoninattachment = By.xpath("//*[contains(text(),'Delete')]");
    By clickdelete = By.xpath("//*[@class=\"btn btn-danger btn-block btn-sm\"]");
    By verifydeleteattachment = By.xpath("//*[contains(text(),'Delete attachment is success')]");

    public void Clickdeletebuttoninattachment() {
        driver.findElement(clickdeletebuttoninattachment).click();
    }

    public void Clickdelete() {
        driver.findElement(clickdelete).click();
    }

    public void Verifydeleteattachment() {
        WebElement verifyDeleteattachment = driver.findElement(verifydeleteattachment);
        Assert.assertTrue(verifyDeleteattachment.isDisplayed());
    }

    //PRIVATE CARD
    By clickprivatecard = By.xpath("//div[@class=\"CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5\"][2]/div[2]");
    By verifyprivatecard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void clickprivatecard() {
        driver.findElement(clickprivatecard).click();
    }

    public void Verifyprivatecard() {
        WebElement verifyPrivatecard = driver.findElement(verifyprivatecard);
        Assert.assertTrue(verifyPrivatecard.isDisplayed());
    }

    //PUBLIC CARD
    By clickpubliccard = By.xpath("//div[@class=\"CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5\"][2]/div[2]");
    By verifypubliccard = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickpubliccard() {
        driver.findElement(clickpubliccard).click();
    }

    public void Verifypubliccard() {
        WebElement verifyPubliccard = driver.findElement(verifypubliccard);
        Assert.assertTrue(verifyPubliccard.isDisplayed());
    }

    //SET DUE DATE
    By clickduedatebutton = By.cssSelector("[data-testid=\"EventIcon\"]");
    By typedate = By.xpath("//*[@class=\"ManageDueDateContainer_datePicker__1LCTx\"]/div/div/input");
    By typetime = By.xpath("//*[@class=\"ManageDueDateContainer_timePicker__3MoTG\"]/div/div/input");
    By verifysetduedate = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickduedatebutton() {
        driver.findElement(clickduedatebutton).click();
    }

    public void Typedate() {
        driver.findElement(typedate).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typedate).sendKeys("2023/12/02");
    }

    public void Typetime() {
        driver.findElement(typetime).sendKeys(Keys.CONTROL + "a");
        driver.findElement(typetime).sendKeys("08:38 AM");
    }

    public void Verifysetduedate() {
        WebElement verifySetduedate = driver.findElement(verifysetduedate);
        Assert.assertTrue(verifySetduedate.isDisplayed());
    }

    //REMOVE DUE DATE
    By clickremovebutton = By.xpath("//*[contains(text(),'Remove')]");
    By verifyremoveduedate = By.xpath("//*[contains(text(),'Update card is success')]");

    public void Clickremovebutton() {
        driver.findElement(clickremovebutton).click();
    }

    public void Verifyremoveduedate() {
        WebElement verifyRemoveduedate = driver.findElement(verifyremoveduedate);
        Assert.assertTrue(verifyRemoveduedate.isDisplayed());
    }

    //ARCHIVE CARD
    By clickarchive = By.xpath("//*[@data-testid=\"ArchiveIcon\"]");
    By verifyarchivecard = By.xpath("//*[contains(text(),'ini edit card card has been moved to archived')]");

    public void Clickarchive() {
        driver.findElement(clickarchive).click();
    }

    public void Verifyarchivecard() {
        WebElement verifyArchivecard = driver.findElement(verifyarchivecard);
        Assert.assertTrue(verifyArchivecard.isDisplayed());
    }

    //SET AS A COMPLETE LIST
    By clickdothree = By.xpath("//div[@class=\"List_List__30q9z\"][last()]/div/div/div/div[2]");
    By clickcompletelist = By.xpath("//*[contains(text(),'Set as a Complete List')]");
    By verifycompletelist = By.xpath("//*[contains(text(),'Set list as Complete is success')]");

    public void Clickdothree() {
        driver.findElement(clickdothree).click();
    }

    public void Clickcompletelist() {
        driver.findElement(clickcompletelist).click();
    }

    public void Verifycompletelist() {
        WebElement verifyCompletelist = driver.findElement(verifycompletelist);
        Assert.assertTrue(verifyCompletelist.isDisplayed());
    }

    //SET AS A UNCOMPLETE LIST
    By clickuncompletelist = By.xpath("//*[contains(text(),'Unset Complete List')]");
    By verifyuncompletelist = By.xpath("//*[contains(text(),'Unset list from Complete is success')]");

    public void Clickuncompletelist() {
        driver.findElement(clickuncompletelist).click();
    }

    public void Verifyuncompletelist() {
        WebElement verifyUncompletelist = driver.findElement(verifyuncompletelist);
        Assert.assertTrue(verifyUncompletelist.isDisplayed());
    }

    //CHEERS IN BOARD
    By clickcheersinboard = By.xpath("//*[@class='CardDetailContainer_cheersSection__2JX7E']/div/div/div/div/img");
    By typecheers = By.xpath("//*[@placeholder=\"Give'em cheers!\"]");
    By clickchecklistbuttoncheersinboard = By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium CheersButton_checkIcon__1ub7w css-vubbuv\"]");
    By verifycheersinboard = By.xpath("//*[@class=\"CardDetailContainer_cheersSection__2JX7E\"]/div/div/div/div/div");

    public void Clickcheersinboard() {
        driver.findElement(clickcheersinboard).click();
    }

    public void Typecheers() {
        driver.findElement(typecheers).sendKeys("ini cheers");
    }

    public void Clickchecklistbuttoncheersinboard() {
        driver.findElement(clickchecklistbuttoncheersinboard).click();
    }

    public void Verifycheersinboard() {
        WebElement verifyCheersinboard = driver.findElement(verifycheersinboard);
        Assert.assertTrue(verifyCheersinboard.isDisplayed());
    }

    //CHEERS COMMENT IN BOARD
    By clickcheerscommentinboard = By.xpath("//*[@class=\"CommentItem_commentHeaderTextActionSection__1KnpG\"]/div[4]/div/div/div");
    By verifycheerscommentinboard = By.xpath("//*[@class=\"CommentItem_commentHeaderTextActionSection__1KnpG\"]/div/div/div/div[1]/div/div/div[2]/p");

    public void Clickcheerscommentinboard() {
        driver.findElement(clickcheerscommentinboard).click();
    }

    public void Verifycheerscommentinboard() {
        WebElement verifyCheerscommentinboard = driver.findElement(verifycheerscommentinboard);
        Assert.assertTrue(verifyCheerscommentinboard.isDisplayed());
    }

    ////////////////////////////////////////////////////////////NEGATIVE////////////////////////////////////////////////////////////

    //CREATE NEW BOARDLIST WITHOUT WORDS
    By typewihoutwordslistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifycantcreatenewboard = By.xpath("//*[contains(text(),'List name cannot be empty')]");

    public void Typewihoutwordslistcoloumn() {
        driver.findElement(typewihoutwordslistcoloumn).sendKeys("");
    }
    public void Verifycantcreatenewboardwithoutword() {
        WebElement verifyCantcreatenewboard = driver.findElement(verifycantcreatenewboard);
        Assert.assertTrue(verifyCantcreatenewboard.isDisplayed());
    }

    //CREATE NEW BOARDLIST WITH ONLY SPACE
    By typewithonlyspacelistcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifycantcreatenewboardwithonlyspace = By.xpath("//*[contains(text(),'List name cannot be empty')]");

    public void Typewithonlyspacelistcoloumn() {
        driver.findElement(typewithonlyspacelistcoloumn).sendKeys(" ");
    }
    public void Verifycantcreatenewboardwithonlyspace() {
        WebElement verifyCantcreatenewboardwithonlyspace = driver.findElement(verifycantcreatenewboardwithonlyspace);
        Assert.assertTrue(verifyCantcreatenewboardwithonlyspace.isDisplayed());
    }

    //CREATE NEW CARD WITHOUT WORDS
    By typewihoutwordscardname = By.xpath("//input[@placeholder='Card name']");
    By verifycantcreatenewcardwihoutwords = By.xpath("//*[contains(text(),'Card name cannot be empty')]");

    public void Typewihoutwordscardname() {
        driver.findElement(typewihoutwordscardname).sendKeys("");
    }
    public void Verifycantcreatenewcardwihoutwords() {
        WebElement verifyCantcreatenewcardwihoutwords = driver.findElement(verifycantcreatenewcardwihoutwords);
        Assert.assertTrue(verifyCantcreatenewcardwihoutwords.isDisplayed());
    }

    //CREATE NEW CARD WITH ONLY SPACE
    By typewithonlyspacecardname = By.xpath("//input[@placeholder='Card name']");
    By verifycantcreatenewcardwithonlyspace = By.xpath("//*[contains(text(),'Card name cannot be empty')]");

    public void Typewithonlyspacescardname() {
        driver.findElement(typewithonlyspacecardname).sendKeys(" ");
    }
    public void Verifycantcreatenewcardwithonlyspace() {
        WebElement verifyCantcreatenewcardwithonlyspace = driver.findElement(verifycantcreatenewcardwithonlyspace);
        Assert.assertTrue(verifyCantcreatenewcardwithonlyspace.isDisplayed());
    }

    //ADD COMMENT WITHOUT WORDS
    By typewihoutwordscommentinboard = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By verifyaddcommentinboardwihoutwords = By.cssSelector("[placeholder=\"Add new comment...\"]");
    By clickcommentcoloumninblash2 = By.xpath("//*[@class=\"Main_input__qq9k9 Main_secondary__2bXP3\"]");

    public void Typewihoutwordscommentinboard() {
        driver.findElement(clickcommentcoloumninblash2).click();
        driver.findElement(typewihoutwordscommentinboard).sendKeys("");
    }
    public void Verifyaddcommentinboardwihoutwords() {
        WebElement verifyCantaddcommentinboardwihoutwords = driver.findElement(verifyaddcommentinboardwihoutwords);
        Assert.assertTrue(verifyCantaddcommentinboardwihoutwords.isDisplayed());
    }

    //ADD COMMENT WITH ONLY SPACE
    By typewithonlyspacecommentinblash = By.xpath("//*[@class=\"fr-element fr-view\"]");
    By verifyaddcommentinboardwithonlyspace = By.xpath("//*[contains(text(),'Comment cannot be empty')]");
    By clickcommentcoloumninblash3 = By.xpath("//*[@class=\"Main_input__qq9k9 Main_secondary__2bXP3\"]");

    public void Typecommentinboardwithonlyspace() {
        driver.findElement(clickcommentcoloumninblash3).click();
        driver.findElement(typewithonlyspacecommentinblash).sendKeys(" ");
    }
    public void Verifycantaddcommentinboardwithonlyspace() {
        WebElement verifyCantaddcommentinboardwithonlyspace = driver.findElement(verifyaddcommentinboardwithonlyspace);
        Assert.assertTrue(verifyCantaddcommentinboardwithonlyspace.isDisplayed());
    }

    //CREATE LABEL WITHOUT WORDS
    By typewihoutwordsnamelabelcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifycantcreatelabelwihoutwords = By.xpath("//*[contains(text(),'Label name cannot be empty!')]");

    public void Typewihoutwordsnamelabelcoloumn() {
        driver.findElement(typewihoutwordsnamelabelcoloumn).sendKeys("");
    }
    public void Verifycantcreatelabelwihoutwords() {
        WebElement verifyCantcreatelabelwihoutwords = driver.findElement(verifycantcreatelabelwihoutwords);
        Assert.assertTrue(verifyCantcreatelabelwihoutwords.isDisplayed());
    }

    //CREATE LABEL ONLY WITH SPACE
    By typewithonlyspacenamelabelcoloumn = By.cssSelector("[class=\"form-control\"]");
    By verifycantcreatelabelwithonlyspace = By.xpath("//*[contains(text(),'Label name cannot be empty!')]");

    public void Typewithonlyspacenamelabelcoloumn() {
        driver.findElement(typewithonlyspacenamelabelcoloumn).sendKeys(" ");
    }
    public void Verifycantcreatelabelwithonlyspace() {
        WebElement verifyCantcreatelabelwithonlyspace = driver.findElement(verifycantcreatelabelwithonlyspace);
        Assert.assertTrue(verifyCantcreatelabelwithonlyspace.isDisplayed());
    }
}

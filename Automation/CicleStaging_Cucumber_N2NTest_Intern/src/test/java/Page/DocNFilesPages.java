package Page;

import MyStepdefs.Bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DocNFilesPages extends Bypass {

    public DocNFilesPages() {

        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/63855485b24aac5c97be3ff2/buckets/63855486b24aac5c97be4073");
    }
    //CREATE ADD A NEW DOC
    By clickdocandfileboxmenu = By.xpath("//h1[contains(text(),'Docs & Files')]");
    By clickadditemherebutton = By.xpath("//p[contains(text(),'Add Item Here')]");
    By clickaddanewdoc = By.cssSelector("[data-testid=\"InsertDriveFileIcon\"]");
    By typetitle = By.cssSelector("[placeholder=\"Type a title...\"]");
    By clickstorycolloumn = By.cssSelector("[class=\"fr-wrapper show-placeholder\"]");
    By typedescription = By.cssSelector("[class=\"fr-element fr-view\"]");
    By clickpublishbutton = By.xpath("//*[contains(text(),'Publish')]");
    By verifyaddanewdoc = By.xpath("//*[@class=\"Doc_Doc__dwRS7\"][last()]");

    public void Clickdocandfileboxmenu() {
        driver.findElement(clickdocandfileboxmenu).click();
    }

    public void Clickadditemherebutton() {
        driver.findElement(clickadditemherebutton).click();
    }

    public void Clickaddanewdoc() {
        driver.findElement(clickaddanewdoc).click();
    }
    public void Typetitle() {
        driver.findElement(typetitle).sendKeys("ini title");
    }
    public void Typestory() {
        driver.findElement(clickstorycolloumn).click();
        driver.findElement(typedescription).sendKeys("ini deskripsi");
    }
    public void Clickpublishbutton() {
        driver.findElement(clickpublishbutton).click();
    }
    public void Verifyaddanewdoc() {
        WebElement verifyAddanewdoc = driver.findElement(verifyaddanewdoc);
        Assert.assertTrue(verifyAddanewdoc.isDisplayed());
    }

    //CREATE ADD A NEW FOLDER
    By clickcreateanewfolder = By.cssSelector("[data-testid=\"CreateNewFolderIcon\"]");
    By typenamefolder = By.cssSelector("[placeholder=\"Input folder name...\"]");
    By verifycreatenewfolder = By.xpath("//*[@class=\"Folder_Folder__KnpzQ\"][last()]");

    public void Clickcreateanewfolser() {
        driver.findElement(clickcreateanewfolder).click();
    }

    public void Typenamefolder() {
        driver.findElement(typenamefolder).sendKeys("ini title");
    }
    public void Verifycreatenewfolder() {
        WebElement verifyCreatenewfolder = driver.findElement(verifycreatenewfolder);
        Assert.assertTrue(verifyCreatenewfolder.isDisplayed());
    }

    //UPLOAD FILES
    By clickuploadfiles = By.cssSelector("[data-testid=\"PublishIcon\"]");
    By sendfiles = By.xpath("[//*[@class=\"LinkNoDecor_Link__3DEkL\"][1]/div/div/img");
    By verifyuploadfiles = By.xpath("//h1[contains(text(),'MANUAL TEST CASE CICLE STAGING.xlsx')]");

    public void clickuploadfiles() {
        driver.findElement(clickuploadfiles).click();
    }

    public void sendfiles() {
        WebElement uploadFile = driver.findElement(sendfiles);
        uploadFile.sendKeys("C:\\Users\\62812\\Documents\\Big Project\\MANUAL TEST CASE CICLE STAGING.xlsx");
    }
    public void verifyuploadfiles() {
        WebElement verifyUploadfiles = driver.findElement(verifyuploadfiles);
        Assert.assertTrue(verifyUploadfiles.isDisplayed());
    }

    //CREATE ADD FOLDER ON THE FOLDER
    By choosefolder = By.xpath("//*[@class=\"Folder_Folder__KnpzQ\"][1]");

    public void Choosefolder() {
        driver.findElement(choosefolder).click();
    }

    //EDIT FOLDER NAME
    By clickeditthisfolderbutton = By.xpath("//p[contains(text(),'Edit This Folder')]");
    By clickeditbuttoninfolder = By.xpath("//*[@class=\"BucketMenu_menu__ZvgGj\"][1]");
    By clicktitlecolloumn = By.cssSelector("[placeholder=\"Type a title...\"]");
    By clickpublishchanges = By.xpath("//*[contains(text(),'Publish Changes')]");
    By verifyeditfoldername = By.xpath("//*[contains(text(),'Update bucket successful')]");

    public void Clickeditthisfolderbutton() {
        driver.findElement(clickeditthisfolderbutton).click();
    }
    public void Clickeditbutton() {
        driver.findElement(clickeditbuttoninfolder).click();
    }
    public void Clicktitlecolloumn() {
        driver.findElement(clicktitlecolloumn).clear();
        driver.findElement(clicktitlecolloumn).sendKeys("ini edit title");
    }
    public void Clickpublishchanges() {
        driver.findElement(clickpublishchanges).click();
    }
    public void verifyeditfoldername() {
        WebElement verifyEditfoldername = driver.findElement(verifyeditfoldername);
        Assert.assertTrue(verifyEditfoldername.isDisplayed());
    }

    //EDIT DOC
    By choosedoc = By.xpath("//*[@class=\"Doc_Doc__dwRS7\"][1]");
    By clickthreedotbuttonindoc = By.cssSelector("[data-testid=\"MoreHorizIcon\"]");
    By clickeditbuttonindoc = By.cssSelector("[class=\"DocMenu_menu__1VkGo\"]");
    By typetitleindoc = By.cssSelector("[placeholder=\"Type a title...\"]");
    By typedescriptionindoc = By.cssSelector("[class=\"fr-element fr-view\"]");
    By verifyeditdoc = By.xpath("//*[contains(text(),'Update doc successful')]");

    public void Choosedoc() {
        driver.findElement(choosedoc).click();
    }
    public void Clickthreedotbuttonindoc() {
        driver.findElement(clickthreedotbuttonindoc).click();
    }
    public void clickeditbuttonindoc() {
        driver.findElement(clickeditbuttonindoc).click();
    }
    public void Typetitleindoc() {
        driver.findElement(typetitleindoc).clear();
        driver.findElement(typetitleindoc).sendKeys("ini edit title");
    }
    public void Typedescriptionindoc() {
        driver.findElement(typedescriptionindoc).clear();
        driver.findElement(typedescriptionindoc).sendKeys("ini edit description");
    }
    public void Verifyeditdoc() {
        WebElement verifyEditdoc = driver.findElement(verifyeditdoc);
        Assert.assertTrue(verifyEditdoc.isDisplayed());
        }

    //EDIT DOC PRIVATE
    By clickprivatebutton = By.cssSelector("[class=\"MuiSwitch-root MuiSwitch-sizeMedium css-ecvcn9\"]");

    public void Clickprivatebutton() {
        driver.findElement(clickprivatebutton).click();
    }

}

package Page;

import MyStepdefs.Bypass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchPages extends Bypass {

    public SearchPages() {

        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    //JUMP TO SEARCH TEAM
    By clicksearchcolloumn = By.xpath("//*[@class=\"General_input__i_E5P\"]");
    By chooseteam = By.xpath("//*[@class=\"ResultItem_container__1NyH3\"][1]");
    By verifyteam = By.xpath("//h1[contains(text(),'Search')]");

    public void Clicksearchcolloumn() {
        driver.findElement(clicksearchcolloumn).click();
    }
    public void Typesearch() {
        driver.findElement(clicksearchcolloumn).click();
        driver.findElement(clicksearchcolloumn).sendKeys("Search");
    }
    public void Chooseteam() throws InterruptedException {
        driver.findElement(chooseteam).click();
    }
    public void Verifyteam() {
        WebElement verifyTeam = driver.findElement(verifyteam);
        Assert.assertTrue(verifyTeam.isDisplayed());
    }

    //JUMP TO SEARCH KANBAN
    By choosekanban = By.cssSelector("[data-testid=\"DashboardOutlinedIcon\"]");
    By verifychoosekanban = By.xpath("//h1[contains(text(),'Board - Search')]");


    public void Choosekanban() throws InterruptedException {
        driver.findElement(choosekanban).click();
    }
    public void Verifykanban() {
        WebElement verifyKanban = driver.findElement(verifychoosekanban);
        Assert.assertTrue(verifyKanban.isDisplayed());
    }

    //JUMP TO SEARCH BLASH
    By chooseblast = By.cssSelector("[data-testid=\"MessageOutlinedIcon\"]");
    By verifychooseblast = By.xpath("//h1[contains(text(),'Blast')]");


    public void Chooseblast() throws InterruptedException {
        driver.findElement(chooseblast).click();
    }
    public void Verifyblast() {
        WebElement verifyBlast = driver.findElement(verifychooseblast);
        Assert.assertTrue(verifyBlast.isDisplayed());
    }

    //JUMP TO SEARCH SCHEDULES
    By chooseschedules = By.cssSelector("[data-testid=\"CalendarMonthOutlinedIcon\"]");
    By verifychooseschedules = By.xpath("//h1[contains(text(),'Schedules')]");


    public void Chooseschedules() throws InterruptedException {
        driver.findElement(chooseschedules).click();
    }
    public void Verifyschedules() {
        WebElement verifySchedules = driver.findElement(verifychooseschedules);
        Assert.assertTrue(verifySchedules.isDisplayed());
    }

    //JUMP TO SEARCH CHECKIN
    By choosecheckin = By.cssSelector("[data-testid=\"BusinessCenterOutlinedIcon\"]");
    By verifychoosecheckin = By.xpath("//h1[contains(text(),'Check-ins')]");


    public void Choosecheckin() throws InterruptedException {
        driver.findElement(choosecheckin).click();
    }
    public void Verifycheckin() {
        WebElement verifyCheckin = driver.findElement(verifychoosecheckin);
        Assert.assertTrue(verifyCheckin.isDisplayed());
    }

    //JUMP TO SEARCH GROUPCHAT
    By choosegroupchat = By.cssSelector("[data-testid=\"ForumOutlinedIcon\"]");
    By verifychoosegroupchat = By.xpath("//h1[contains(text(),'Group Chat - Search')]");


    public void Choosegroupchat() throws InterruptedException {
        driver.findElement(choosegroupchat).click();
    }
    public void Verifygroupchat() {
        WebElement verifyGroupchat = driver.findElement(verifychoosegroupchat);
        Assert.assertTrue(verifyGroupchat.isDisplayed());
    }

    //JUMP TO SEARCH DOC & FILES
    By choosedocandfile = By.cssSelector("[data-testid=\"SnippetFolderOutlinedIcon\"]");
    By verifychoosedocandfile = By.xpath("//h1[contains(text(),'Docs & Files')]");


    public void Choosedocandfile() throws InterruptedException {
        driver.findElement(choosedocandfile).click();
    }
    public void Verifydocandfile() {
        WebElement verifyDocandfile = driver.findElement(verifychoosedocandfile);
        Assert.assertTrue(verifyDocandfile.isDisplayed());
    }
}

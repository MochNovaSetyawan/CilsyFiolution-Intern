package Pages;

import Config.Base;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

public class SearchPages extends Base {

    //User search jump to Search team
    @Test
    public void userClickSearchMenu() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userClickSearchMenu = driver.findElementByXPath("*//*[contains(@content-desc,'Tab 3 of 4')]");
        userClickSearchMenu.click();
    }
    @Test
    public void userTypeSearch() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userTypeSearch = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        userTypeSearch.click();
        Thread.sleep(2000);
        MobileElement userTypeSearch2 = driver.findElementByXPath("*//*[contains(@class,'android.widget.EditText')]");
        userTypeSearch2.sendKeys("web");
        driver.hideKeyboard();
    }
    @Test
    public void userChooseTeam() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseTeam = driver.findElementByAccessibilityId("web\n" +
                "Home  >  web");
        userChooseTeam.click();
    }
    @Test
    public void userSuccessfullyJumpToSearchTeam() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchTeam = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchTeam.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchTeam2 = driver.findElementByAccessibilityId("Overview");
        Assert.assertTrue(userSuccessfullyJumpToSearchTeam2.isDisplayed());
    }

    //User search jump to Search kanban (web team)
    @Test
    public void userChooseKanban() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseKanban = driver.findElementByAccessibilityId("Kanban Board: web\n" +
                "Home  >  web  >  Kanban Board");
        userChooseKanban.click();
    }

    @Test
    public void userSuccessfullyJumpToSearchKanban() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchKanban = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchKanban.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchKanban2 = driver.findElementByAccessibilityId("Board");
        Assert.assertTrue(userSuccessfullyJumpToSearchKanban2.isDisplayed());
    }

    //User search jump to Search blast (web team)
    @Test
    public void userChooseBlast() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseBlast = driver.findElementByAccessibilityId("Blast: web\n" +
                "Home  >  web  >  Blast");
        userChooseBlast.click();
    }

    @Test
    public void userSuccessfullyJumpToSearchBlast() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchBlast = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchBlast.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchBlast2 = driver.findElementByAccessibilityId("Blast");
        Assert.assertTrue(userSuccessfullyJumpToSearchBlast2.isDisplayed());
    }

    //User search jump to Search schedules (web team)
    @Test
    public void userChooseSchedules() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseSchedules = driver.findElementByAccessibilityId("Schedule: web\n" +
                "Home  >  web  >  Schedule");
        userChooseSchedules.click();
    }
    @Test
    public void userSuccessfullyJumpToSearchSchedules() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchSchedules = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchSchedules.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchSchedules2 = driver.findElementByAccessibilityId("Schedule");
        Assert.assertTrue(userSuccessfullyJumpToSearchSchedules2.isDisplayed());
    }

    //User search jump to Search checkin (web team)
    @Test
    public void userChooseCheckin() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseCheckin = driver.findElementByAccessibilityId("Check In: web\n" +
                "Home  >  web  >  Check In");
        userChooseCheckin.click();
    }

    @Test
    public void userSuccessfullyJumpToSearchCheckin() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchCheckin = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchCheckin.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchCheckin2 = driver.findElementByAccessibilityId("Check-Ins");
        Assert.assertTrue(userSuccessfullyJumpToSearchCheckin2.isDisplayed());
    }

    //User search jump to Search groupchat web team)
    @Test
    public void userChooseGroupchat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseGroupchat = driver.findElementByAccessibilityId("Group Chat: web\n" +
                "Home  >  web  >  Group Chat");
        userChooseGroupchat.click();
    }

    @Test
    public void userSuccessfullyJumpToSearchGroupchat() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchGroupchat = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchGroupchat.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchGroupchat2 = driver.findElementByAccessibilityId("Group Chat");
        Assert.assertTrue(userSuccessfullyJumpToSearchGroupchat2.isDisplayed());
    }

    //User search jump to Search doc and file
    @Test
    public void userChooseDocAndFile() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userChooseDocAndFile = driver.findElementByAccessibilityId("Docs & Files: web\n" +
                "Home  >  web  >  Docs & Files");
        userChooseDocAndFile.click();
    }

    @Test
    public void userSuccessfullyJumpToSearchDocAndFile() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchDocAndFile = driver.findElementByAccessibilityId("web");
        Assert.assertTrue(userSuccessfullyJumpToSearchDocAndFile.isDisplayed());
        Thread.sleep(2000);
        MobileElement userSuccessfullyJumpToSearchDocAndFile2 = driver.findElementByAccessibilityId("Doc & Files");
        Assert.assertTrue(userSuccessfullyJumpToSearchDocAndFile2.isDisplayed());
    }
}

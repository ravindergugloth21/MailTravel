package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import uipages.HomePage;

public class HomePageStep  {
   private HomePage homePage;
    @Step
    public void openBrowser()
    {
        homePage.open();
    }
    public void searchPlace()
    {
        homePage.search();
    }
    public void titleVerification()
    {
       // Assert.assertTrue(homePage.verifyHomePageTitle().equals("Home Page | Mail Travel"));
       // homePage.verifyHomePageTitle();
    }

}

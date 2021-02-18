package appTest;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageStep;

@RunWith(SerenityRunner.class)

public class Runner {
    @Steps
    HomePageStep homePageStep;
    @Managed(driver = "Chrome")

    WebDriver driver;

    @Test
    public void searchTest()
    {
        homePageStep.openBrowser();
        homePageStep.searchPlace();
        homePageStep.titleVerification();

    }

}

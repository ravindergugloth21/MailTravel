package uipages;
import lombok.Builder;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("https://www.mailtravel.co.uk/")

public class HomePage extends PageObject{
    public void search()  {
        $("Button[title='Accept Cookies']").click();
        //Thread.sleep(5000);
        $("button[class='sailthru-overlay-close']").click();
        $("input[name='searchtext']").sendKeys("India");
        $("div[class='nbf_button']").click();
    }
public String verifyHomePageTitle()
{

    return $("img[id='site-logo']").getText();

}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Util {

    private By _registerbutton = By.linkText("Register"); //Variable to store XPATH of registration button

    public void VerifyTextofHomePage() { //Method to Assert homepage text
        String expectedTitle = "Welcome to our store";
        String actualText1 = getTextfromElement(By.xpath("//h2[text() ='Welcome to our store']"));
        Assert.assertEquals(actualText1, expectedTitle);
    }
    public void clickregistration() {
        clickElement(_registerbutton, 20); } //Method to click registration link
}






import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSubmitPageVerify extends Util {

    public void VerifyRegistrationButtonPage() {

        String expectedText = "Your registration completed";
        String actualText = getTextfromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualText, expectedText);

    }
}
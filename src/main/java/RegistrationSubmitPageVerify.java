import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSubmitPageVerify extends Util {

    public void VerifyRegistrationButtonPage() { //Method to verify user is on Registration successful page

        String expectedText = "Your registration completed"; //Expected Text on successful registration page
        String actualText = getTextfromElement(By.xpath("//div[@class=\"result\"]"));//Get text from aActual result
        Assert.assertEquals(actualText, expectedText); //Assert to verify the text rof actual with expected result

    }
}
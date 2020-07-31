import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {

    public static void typeText(By by, String text, int time) { //Reusable method to enter text in input box
        driver.findElement(by).sendKeys(text);
    }

    public static void clickElement(By by, int time) { //Reusable method to enter click on element
        driver.findElement(by).click();
    }

    public static long timestamp() { //Resuable method for timestamp
        return (System.currentTimeMillis());
    }

    public static String getTextfromElement(By by) { //Reusable method to get text from element
        return driver.findElement(by).getText();
    }
    //Reusable method to select element by value from drop down menu
    public static void selectFromDropDownByValue(By by, String n, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(n);
    }
    //Reusable method to select element by index from drop down menu
    public static void selectFromDropDownByindex(By by, String text, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //Reusable method to select element by visible text from drop down menu
    public static void selectFromDropDownByVisibleText(By by, String text, int time) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //Reusable method to capture screenshot for failed test cases
    public static void ScreenShotCapture(String NameofScreenshot) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot
        try {

            FileUtils.copyFile(scrFile, new File(("src\\main\\ScreenShot" + NameofScreenshot + ".png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


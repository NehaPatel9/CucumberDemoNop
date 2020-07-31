import org.openqa.selenium.By;

public class RegistrationPage extends Util {
    LoadProp loadProp = new LoadProp(); //Object created for LoadProp Class

    private By _EnterName = By.id("FirstName");
    private By _EnterLastName = By.xpath("//input[@id=\"LastName\"]");
    private By _selectFromDropDownByValue = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _selectFromDropDownByindex = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _selectFrmDropDownByVisibleText = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _Email = By.name("Email");
    private By _Company = By.id("Company");
    private By _Newsletter = By.xpath("//input[@id=\"Newsletter\"]");
    private By _Password = By.xpath("//input[@name=\"Password\"]");
    private By _ConfirmPassword = By.xpath("//input[@name=\"ConfirmPassword\"]");
    private By _registerButton = By.name("register-button");

    public void registrtionDetailFill (){ //Method to fill details of the Registration Page

        typeText(_EnterName, loadProp.getProperty("FirstName"), 20);
        //enter first name
        typeText(_EnterLastName, loadProp.getProperty("LastName"), 20);
        //enter Last name
        selectFromDropDownByValue(_selectFromDropDownByValue, loadProp.getProperty("DateofBirth"), 20);
        //select day from list
        selectFromDropDownByindex(_selectFromDropDownByindex, loadProp.getProperty("MonthofBirth"), 20);
        //select month from list
        selectFromDropDownByVisibleText(_selectFrmDropDownByVisibleText, loadProp.getProperty("YearofBirth"), 20);
        //select Year from list
        typeText(_Email,loadProp.getProperty("EmailAddress")+timestamp()+loadProp.getProperty("DomainName"),40);
        //enter email
        typeText(_Company, loadProp.getProperty("CompanyName"), 40);
        //Enter Company Name
        clickElement(_Newsletter, 20);
        //click Newsletter
        typeText(_Password, loadProp.getProperty("Password"), 20);
        //enter password
        typeText(_ConfirmPassword, loadProp.getProperty("ConfirmPassword"), 20);
        //enter confirm password
    }
    public void clickonRegistrationButton(){ //Method to click on Registration Button

        clickElement(_registerButton, 20);
    }
}

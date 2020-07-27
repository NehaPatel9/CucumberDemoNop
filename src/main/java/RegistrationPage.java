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

    public void RegistrtionDetailFill (){ //Method to fill details of the Registration Page

        TypeText(_EnterName, loadProp.getProperty("FirstName"), 20);
        TypeText(_EnterLastName, loadProp.getProperty("LastName"), 20);
        selectFromDropDownByValue(_selectFromDropDownByValue, loadProp.getProperty("DateofBirth"), 20);
        selectFromDropDownByindex(_selectFromDropDownByindex, loadProp.getProperty("MonthofBirth"), 20);
        selectFromDropDownByVisibleText(_selectFrmDropDownByVisibleText, loadProp.getProperty("YearofBirth"), 20);
        TypeText(_Email,loadProp.getProperty("EmailAddress")+timestamp()+loadProp.getProperty("DomainName"),40);
        TypeText(_Company, loadProp.getProperty("CompanyName"), 40);
        clickElement(_Newsletter, 20);
        TypeText(_Password, loadProp.getProperty("Password"), 20);
        TypeText(_ConfirmPassword, loadProp.getProperty("ConfirmPassword"), 20);
    }
    public void ClickonRegistrationButton(){ //Method to click on Registration Button

        clickElement(_registerButton, 20);
    }
}

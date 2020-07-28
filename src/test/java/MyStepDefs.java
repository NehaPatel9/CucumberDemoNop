import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs { //Class to link Gherkin steps
    // A Step Definition is a Java method with an expression that links it to one or more Gherkin steps.
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSubmitPageVerify registrationSubmitPageVerify = new RegistrationSubmitPageVerify();
    // Suggested snippets  used for Gherkin steps
    //Inoked a Method to assert text of homepage to verify user is on homepage
    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homePage.VerifyTextofHomePage();
    }
    //Invoked a Method to click on registration button
    @When("^User clicks on register button$")
        public void user_clicks_on_register_button(){
        homePage.clickregistration();
    }
    //Invoked a Method to fill deatils on registration page
    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
        registrationPage.RegistrtionDetailFill();
    }
    //InvoMethod to Click on registration submit button
    @When("^user enters all required -submit button$")
    public void user_enters_all_required_submit_button()  {
        registrationPage.ClickonRegistrationButton();
    }
    //Invoked a method to assert text of register successfully page
    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        registrationSubmitPageVerify.VerifyRegistrationButtonPage();
    }
}

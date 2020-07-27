import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSubmitPageVerify registrationSubmitPageVerify = new RegistrationSubmitPageVerify();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        homePage.VerifyTextofHomePage();
    }

    @When("^User clicks on register button$")
        public void user_clicks_on_register_button(){
        homePage.clickregistration();
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
        registrationPage.RegistrtionDetailFill();
    }

    @When("^user enters all required -submit button$")
    public void user_enters_all_required_submit_button()  {

        registrationPage.ClickonRegistrationButton();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        registrationSubmitPageVerify.VerifyRegistrationButtonPage();
    }
}

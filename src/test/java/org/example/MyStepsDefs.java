package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDefs {
    HomePage homePage = new HomePage();
    Registration registration = new Registration();
    RegistrationSuccessful registrationSuccessful=new RegistrationSuccessful();
    LoadProperty loadProperty = new LoadProperty();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registration.userEnterDetailsOnRegistrationPageSuccessfully();
    }

    @When("I click on register submit button")
    public void i_click_on_register_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        registration.clickOnRegisterButton();
    }
    @Then("I should be able to registered successfully")
    public void i_should_be_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registrationSuccessful.userShouldVerifyThatRegistrationSuccessful();
    }
    @Given("User is on homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentURL(  "https://demo.nopcommerce.com/");
    }
    @When("User clicks on {string} link from top header menu")
    public void user_clicks_on_link_from_top_header_menu(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryName(category_name  );
    }
    @Then("User should be able to navigate successfully to {string} page")
    public void user_should_be_able_to_navigate_successfully_to_page(String category_url) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentURL( category_url );
    }
}

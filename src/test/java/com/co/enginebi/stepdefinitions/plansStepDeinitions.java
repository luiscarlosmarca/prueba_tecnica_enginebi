package com.co.enginebi.stepdefinitions;
import com.co.enginebi.question.VerifySubscriptionFailed;
import com.co.enginebi.question.VerifySubscriptionMonthly;
import com.co.enginebi.task.PaymentMethod;
import net.serenitybdd.screenplay.waits.Wait;

import com.co.enginebi.question.VerifySubscriptionFree;
import com.co.enginebi.task.BasicInformation;
import com.co.enginebi.task.CompanyInformation;
import com.co.enginebi.task.SelectPlan;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.enginebi.stepdefinitions.setupConfiguration.User;
import static com.co.enginebi.task.OpenPage.openPage;

public class plansStepDeinitions {
    @Given("the user navigates to the plans page")
    public void that_the_user_is_in_the_application() {
        String url = "https://app-qa.enginebi.net/subscription/0-plans";
        User.attemptsTo(openPage(url));

    }

    @And("he enter their basic information with the following details:")
    public void heEnterTheirBasicInformationWithTheFollowingDetails(DataTable basicInformation) {
        User.attemptsTo(BasicInformation.next(basicInformation));
    }

    @When("he complete the company information")
    public void heCompleteTheCompanyInformation() {
        User.attemptsTo(CompanyInformation.next());

    }

    @When("he provide the credit card details with a valid card")
    public void heProvideTheCreditCardDetailsWithAValidCard() {
        User.attemptsTo(PaymentMethod.creditCard().creditCardEnable());

    }

    @When("he provide the credit card details with a declined card")
    public void heProvideTheCreditCardDetailsWithADeclinedCard() {
        // Write code here that turns the phrase above into concrete actions
        User.attemptsTo(PaymentMethod.creditCard().creditCarddisable());
    }
    @Then("he should see an error message indicating that the card was declined")
    public void heShouldSeeAnErrorMessageIndicatingThatTheCardWasDeclined() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(4000);
        User.should(
                GivenWhenThen.seeThat(
                        VerifySubscriptionFailed.isVisible(),
                        Matchers.is(true)
                )
        );
    }




}

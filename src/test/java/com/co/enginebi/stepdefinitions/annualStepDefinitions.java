package com.co.enginebi.stepdefinitions;

import com.co.enginebi.question.VerifySubscriptionAnnual;
import com.co.enginebi.question.VerifySubscriptionMonthly;
import com.co.enginebi.task.SelectPlan;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.enginebi.stepdefinitions.setupConfiguration.User;

public class annualStepDefinitions {
    @When("he select the Annual plan")
    public void heSelectTheAnnualPlan() {
        User.attemptsTo(SelectPlan.next("Annual"));
    }

    @Then("he confirm the subscription Annual plan")
    public void heConfirmTheSubscription() throws InterruptedException {
        Thread.sleep(10000);
        User.should(
                GivenWhenThen.seeThat(
                        VerifySubscriptionAnnual.isVisible(),
                        Matchers.is(true)
                )
        );
    }
}

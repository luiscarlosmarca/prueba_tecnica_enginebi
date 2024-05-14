package com.co.enginebi.stepdefinitions;

import com.co.enginebi.question.VerifySubscriptionAnnual;
import com.co.enginebi.question.VerifySubscriptionPlatinum;
import com.co.enginebi.task.SelectPlan;
import com.co.enginebi.task.SelectPlanPlatinum;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.enginebi.stepdefinitions.setupConfiguration.User;

public class platinumStepDefinitions {
    @When("he select the Platinium plan")
    public void heSelectTheAnnualPlan() {
        User.attemptsTo(SelectPlan.next("Platinum"));
    }

    @Then("he confirm the subscription Platinum plan")
    public void heConfirmTheSubscription() throws InterruptedException {
        Thread.sleep(10000);
        User.should(
                GivenWhenThen.seeThat(
                        VerifySubscriptionPlatinum.isVisible(),
                        Matchers.is(true)
                )
        );
    }

    @When("he chosen paid up front")
    public void heChosenPaidUpFront() {
        User.attemptsTo(SelectPlanPlatinum.next());
    }

    @When("he chosen per month")
    public void heChosenPerMonth() {
        User.attemptsTo(SelectPlanPlatinum.next().perMonth());
    }


}

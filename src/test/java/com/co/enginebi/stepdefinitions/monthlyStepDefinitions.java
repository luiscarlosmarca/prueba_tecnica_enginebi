package com.co.enginebi.stepdefinitions;

import com.co.enginebi.question.VerifySubscriptionFree;
import com.co.enginebi.question.VerifySubscriptionMonthly;
import com.co.enginebi.task.SelectPlan;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.enginebi.stepdefinitions.setupConfiguration.User;

public class monthlyStepDefinitions {
    @When("he select the Monthly plan")
    public void heSelectTheMonthlyPlan() {
        User.attemptsTo(SelectPlan.next("Monthly"));
    }

    @Then("he confirm the subscription Monthly plan")
    public void heConfirmTheSubscription() throws InterruptedException {
        Thread.sleep(10000);
        User.should(
                GivenWhenThen.seeThat(
                        VerifySubscriptionMonthly.isVisible(),
                        Matchers.is(true)
                )
        );
    }
}

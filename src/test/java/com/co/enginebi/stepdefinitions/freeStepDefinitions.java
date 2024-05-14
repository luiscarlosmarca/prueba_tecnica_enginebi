package com.co.enginebi.stepdefinitions;

import com.co.enginebi.question.VerifySubscriptionFree;
import com.co.enginebi.task.SelectPlan;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.co.enginebi.stepdefinitions.setupConfiguration.User;

public class freeStepDefinitions {

    @When("he select the Free Trial plan")
    public void the_user_logs_in_successfully() {
        User.attemptsTo(SelectPlan.next("Free"));
    }


    @Then("he confirm the subscription Free Trial plan")
    public void heConfirmTheSubscription() throws InterruptedException {
        Thread.sleep(10000);
        User.should(
                GivenWhenThen.seeThat(
                        VerifySubscriptionFree.isVisible(),
                        Matchers.is(true)
                )
        );
    }

}

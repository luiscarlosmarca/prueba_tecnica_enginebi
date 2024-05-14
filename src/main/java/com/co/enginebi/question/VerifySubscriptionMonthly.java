package com.co.enginebi.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_MONTHLY;

public class VerifySubscriptionMonthly implements Question<Boolean> {


    public static VerifySubscriptionMonthly isVisible() {
        return new VerifySubscriptionMonthly();
    }
    @Override
    public Boolean  answeredBy(Actor actor) {
        return LBL_MESSAGE_MONTHLY.resolveFor(actor).isVisible();
    }


}

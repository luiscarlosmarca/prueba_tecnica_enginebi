package com.co.enginebi.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_FAILED;
import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_MONTHLY;

public class VerifySubscriptionFailed implements Question<Boolean> {


    public static VerifySubscriptionFailed isVisible() {
        return new VerifySubscriptionFailed();
    }
    @Override
    public Boolean  answeredBy(Actor actor) {
        return LBL_MESSAGE_FAILED.resolveFor(actor).isVisible();
    }


}

package com.co.enginebi.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_ANNUAL;

public class VerifySubscriptionAnnual implements Question<Boolean> {


    public static VerifySubscriptionAnnual isVisible() {
        return new VerifySubscriptionAnnual();
    }
    @Override
    public Boolean  answeredBy(Actor actor) {
        return LBL_MESSAGE_ANNUAL.resolveFor(actor).isVisible();
    }


}

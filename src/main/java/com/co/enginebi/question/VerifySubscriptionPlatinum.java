package com.co.enginebi.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_PLATINUM;

public class VerifySubscriptionPlatinum implements Question<Boolean> {


    public static VerifySubscriptionPlatinum isVisible() {
        return new VerifySubscriptionPlatinum();
    }
    @Override
    public Boolean  answeredBy(Actor actor) {
        return LBL_MESSAGE_PLATINUM.resolveFor(actor).isVisible();
    }


}

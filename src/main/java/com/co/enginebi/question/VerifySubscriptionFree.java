package com.co.enginebi.question;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.enginebi.ui.ConfirmationPage.LBL_MESSAGE_FREE;

public class VerifySubscriptionFree implements Question<Boolean> {


    public static VerifySubscriptionFree isVisible() {
        return new VerifySubscriptionFree();
    }
    @Override
    public Boolean  answeredBy(Actor actor) {
        return LBL_MESSAGE_FREE.resolveFor(actor).isVisible();
    }


}

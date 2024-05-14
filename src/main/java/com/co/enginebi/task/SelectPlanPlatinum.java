package com.co.enginebi.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.enginebi.ui.PlanPatinumPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPlanPlatinum implements Task {
    Boolean paidUpFront = true;
    public SelectPlanPlatinum() {
    }

    public SelectPlanPlatinum perMonth(){
        this.paidUpFront=false;
        return this;
    }

    public static SelectPlanPlatinum next() {
        return instrumented(SelectPlanPlatinum.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (paidUpFront){
            actor.attemptsTo(Click.on(SPN_PAID_UP_FRONT));
        }else {
            actor.attemptsTo(Click.on(SPN_PER_MONTH));

        }
        actor.attemptsTo(Click.on(BTN_SUBSCRIBE));

    }


}

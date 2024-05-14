package com.co.enginebi.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.enginebi.ui.PlansPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPlan implements Task {
    private final String plan;

    public SelectPlan(String plan) {
        this.plan = plan;
    }

    public static SelectPlan next(String plan) {
        return instrumented(SelectPlan.class, plan);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (plan) {
            case "Free":
                actor.attemptsTo(Click.on(BTN_PLAN_FREE));
                break;
            case "Monthly":
                actor.attemptsTo(Click.on(BTN_PLAN_MONTHLY));
                break;
            case "Annual":
                actor.attemptsTo(Click.on(BTN_PLAN_ANNUAL));
                break;
            case "Platinum":
                actor.attemptsTo(Click.on(BTN_PLAN_PLANTINUM));
                break;
        }


    }
}

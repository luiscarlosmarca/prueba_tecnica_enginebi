package com.co.enginebi.task;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.co.enginebi.ui.BasicInformationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.Random;

public class BasicInformation implements Task {
    DataTable informationBasic;
    private String[] basicInformation = new String[4];
    public BasicInformation(DataTable informationBasic) {
        this.informationBasic = informationBasic;
    }

    public static BasicInformation next(DataTable informationBasic) {
        return instrumented(BasicInformation.class, informationBasic);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < informationBasic.height(); i++) {
            String value = informationBasic.cell(i, 1);
            basicInformation[i] = value;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;
        randomNumber = random.nextInt(1000) - randomNumber+100;
        actor.attemptsTo(Enter.theValue(basicInformation[0]).into(TXT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(basicInformation[1]).into(TXT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(randomNumber+basicInformation[2]).into(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(basicInformation[3]).into(TXT_PHONE));
        actor.attemptsTo(Click.on(BTN_NEXT));
    }
}

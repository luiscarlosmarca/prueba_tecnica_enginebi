package com.co.enginebi.task;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import javax.swing.event.CaretListener;

import static com.co.enginebi.ui.CompanyInformationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompanyInformation implements Task {
    Faker faker = new Faker();

    public CompanyInformation() {
    }

    public static CompanyInformation next() {
        return instrumented(CompanyInformation.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(faker.company().name()).into(TXT_COMPANY_NAME));

        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(TXT_COUNTRY));
         actor.attemptsTo(Hit.the(Keys.ENTER).into(TXT_COUNTRY));
        actor.attemptsTo(
                WaitUntil.the(TXT_STATE, isEnabled()).forNoMoreThan(10).seconds()
        );

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(TXT_STATE));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(TXT_STATE));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue("Los Angeles").into(TXT_CITY));
        actor.attemptsTo(Click.on(CHK_AGREED));
        actor.attemptsTo(Click.on(BTN_NEXT));
    }
}

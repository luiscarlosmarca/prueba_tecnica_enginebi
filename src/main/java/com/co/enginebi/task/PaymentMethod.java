package com.co.enginebi.task;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.co.enginebi.ui.PaymentMethodPage.*;

public class PaymentMethod implements Task {
    String creditCard_enable= "4242424242424242";
    String creditCard_disable= "4012000000003028";
    String creditCard="";
    public PaymentMethod() {
    }

    public static PaymentMethod creditCard() {
        return instrumented(PaymentMethod.class);
    }

    public  PaymentMethod creditCardEnable(){
        this.creditCard=this.creditCard_enable;
        return this;
    }
    public  PaymentMethod creditCarddisable(){
        this.creditCard=this.creditCard_disable;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement iframeElement = driver.findElement(By.xpath("//form[@id='payment-form']/child::div[@id='payment-element']/child::div/child::*"));
        driver.switchTo().frame(iframeElement);
        actor.attemptsTo(Enter.theValue("1130").into(TXT_EXPIRY_NUM_CARD));
        actor.attemptsTo(Enter.theValue("123").into(TXT_CVC_NUM_CARD));
        actor.attemptsTo(Enter.theValue(creditCard).into(TXT_NUM_CARD));
        driver.switchTo().defaultContent();
        actor.attemptsTo(Click.on(BTN_SBUSCRIBE));

    }
}

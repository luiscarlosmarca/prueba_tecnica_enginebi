package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanPatinumPage {



    public static final Target SPN_PAID_UP_FRONT = Target
            .the("plan paid front platinum")
            .located(By.xpath("(//span[contains(text(),' paid up front')])[1]"));

    public static final Target BTN_SUBSCRIBE = Target
            .the("Button subscribe platinum")
            .located(By.xpath("//button[@nztype='primary']"));

    public static final Target SPN_PER_MONTH = Target
            .the("plan per month platinum")
            .located(By.xpath("(//span[contains(text(),' per month')])[2]"));

}

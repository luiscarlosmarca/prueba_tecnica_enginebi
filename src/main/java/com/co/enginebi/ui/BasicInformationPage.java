package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasicInformationPage {

    public static final Target TXT_FIRST_NAME = Target
            .the("input text information basic first name")
            .located(By.xpath("//input[@id='name']"));


    public static final Target TXT_LAST_NAME = Target
            .the("input text information basic last name")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target TXT_EMAIL = Target
            .the("input text information basic email")
            .located(By.xpath("//input[@id='email']"));

    public static final Target TXT_PHONE = Target
            .the("input text information basic phone")
            .located(By.xpath("//input[@id='phone']"));

    public static final Target BTN_NEXT = Target
            .the("button next information basic ")
            .located(By.xpath("(//button[@nztype='primary'])[1]"));

}

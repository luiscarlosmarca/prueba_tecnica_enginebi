package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentMethodPage {

    public static final Target TXT_NUM_CARD = Target
            .the("input text number card")
            .located(By.xpath("//input[@id='Field-numberInput']"));


     public static final Target TXT_EXPIRY_NUM_CARD = Target
            .the("input text expiry number card")
            .located(By.xpath("//input[@id='Field-expiryInput']"));



     public static final Target TXT_CVC_NUM_CARD = Target
            .the("input text expiry number card")
            .located(By.xpath("//input[@id='Field-cvcInput']"));


     public static final Target BTN_SBUSCRIBE = Target
            .the("input text expiry number card")
            .located(By.xpath("//button[@id='submit']"));



}

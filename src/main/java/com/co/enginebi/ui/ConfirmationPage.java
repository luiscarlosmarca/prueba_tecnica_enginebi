package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {

    public static final Target LBL_MESSAGE_FREE = Target
            .the("Message confirmation subscription free trial")
            .located(By.xpath("//div[contains(text(), 'Your 30 Day Free Trial subscription has been successfully completed!')]"));

    public static final Target LBL_MESSAGE_MONTHLY = Target
            .the("Message confirmation subscription monthly")
            .located(By.xpath("//div[contains(text(), 'Your Monthly subscription has been successfully completed!')]"));

    public static final Target LBL_MESSAGE_ANNUAL = Target
            .the("Message confirmation subscription annual")
            .located(By.xpath("//div[contains(text(), 'Your Annual subscription has been successfully completed!')]"));

    public static final Target LBL_MESSAGE_PLATINUM = Target
            .the("Message confirmation subscription platinum")
            .located(By.xpath("//div[contains(text(), 'Your Engine Platinum subscription has been successfully completed!')]"));

    public static final Target LBL_MESSAGE_FAILED = Target
            .the("Message confirmation subscription failed")
            .located(By.xpath("//nz-alert[@nztype='warning']"));



}

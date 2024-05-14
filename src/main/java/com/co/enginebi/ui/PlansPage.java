package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlansPage {
    public static final Target BTN_PLAN_FREE = Target
            .the("Subscribe Free 30 days")
            .located(By.xpath("//div[contains(text(),'30 Day Free Trial')]/ancestor::div[@class='ant-card-meta-detail']//button"));

    public static final Target BTN_PLAN_MONTHLY = Target
            .the("Subscribe Monthly")
            .located(By.xpath("//div[contains(text(),'Monthly')]/ancestor::div[@class='ant-card-meta-detail']//button"));


    public static final Target BTN_PLAN_ANNUAL = Target
            .the("Subscribe annual")
            .located(By.xpath("//div[contains(text(),'Annual')]/ancestor::div[@class='ant-card-meta-detail']//button"));


    public static final Target BTN_PLAN_PLANTINUM = Target
            .the("Subscribe PLANTINUM")
            .located(By.xpath("//div[contains(text(),'Engine Platinum')]/ancestor::div[@class='ant-card-meta-detail']//button"));



}


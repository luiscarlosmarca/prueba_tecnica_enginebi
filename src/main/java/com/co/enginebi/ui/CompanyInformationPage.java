package com.co.enginebi.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompanyInformationPage {

    public static final Target TXT_COMPANY_NAME = Target
            .the("input text of company name")
            .located(By.xpath("//input[@id='customerName']"));

    public static final Target TXT_COUNTRY = Target
            .the("input text country")
            .located(By.xpath("//input[@id='countryId']"));


    public static final Target TXT_STATE = Target
            .the("input text state")
            .located(By.xpath("//input[@id='stateId']"));


    public static final Target TXT_CITY = Target
            .the("input text city")
            .located(By.xpath("//input[@id='city']"));



    public static final Target CHK_AGREED = Target
            .the("Check box agreed")
            .located(By.xpath("//input[@type='checkbox']"));


    public static final Target BTN_NEXT = Target
            .the("button next information basic ")
            .located(By.xpath("(//button[@nztype='primary'])[2]"));

}

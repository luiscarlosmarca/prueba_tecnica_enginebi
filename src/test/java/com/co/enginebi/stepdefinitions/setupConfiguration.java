package com.co.enginebi.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class setupConfiguration {

    public static Actor User = Actor.named("User");


    public WebDriver hisBrowser;

    @Before
    public void setUp() {
        User= Actor.named("User").can(BrowseTheWeb.with(hisBrowser));
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public  void tearDown(){
        WebDriver driver = BrowseTheWeb.as(User).getDriver();
        driver.quit();
    }
}

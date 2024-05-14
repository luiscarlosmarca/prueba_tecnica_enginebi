package com.co.enginebi.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/testingPlans_Platinum.feature",
        glue = "com.co.enginebi.stepdefinitions",
        tags = "@TC02",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class Test_Plan_Platinum_Runner {
}

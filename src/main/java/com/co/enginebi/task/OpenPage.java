package com.co.enginebi.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class OpenPage implements Task {
    WebDriver myWebDriver;
    String url;
    public OpenPage(String url) {
        this.url = url;
    }
    public static OpenPage openPage(String url) {
        return instrumented(OpenPage.class, url);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chropts=new ChromeOptions();
        chropts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chropts.addArguments("--remote-allow-origins=*");
        myWebDriver = new ChromeDriver(chropts);
        myWebDriver.get(url);
        myWebDriver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(myWebDriver));
    }
}

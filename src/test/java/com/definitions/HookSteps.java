package com.definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.HelpDriverClass;

import java.net.MalformedURLException;

public class HookSteps {

    @Before
    public static void before_setUp() throws MalformedURLException {
        HelpDriverClass.setUpDriver("local");
    }

    @After
    public static void after_tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) HelpDriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        HelpDriverClass.tearDown();
    }
}

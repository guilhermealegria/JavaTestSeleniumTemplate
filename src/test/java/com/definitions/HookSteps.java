package com.definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.HelpDriverClass;

import java.net.MalformedURLException;

public class HookSteps {

    @Before
    public static void setUp() throws MalformedURLException {
        HelpDriverClass.setUpDriver();
    }

    @After
    public static void tearDown() {
        HelpDriverClass.tearDown();
    }
}

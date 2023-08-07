package com.definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.HelpDriverClass;

public class HookSteps {

    @Before
    public static void setUp() {
        HelpDriverClass.setUpDriver();
    }

    @After
    public static void tearDown() {
        HelpDriverClass.tearDown();
    }
}

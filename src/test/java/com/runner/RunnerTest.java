package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@execution", features = "src/test/resources/features", glue = "com.definitions", plugin = {})
public class RunnerTest {

}

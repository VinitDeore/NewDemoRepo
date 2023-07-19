package com.qmetry.qaf.example;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(feature = "scenarios/suite1.feature", glue ="com.qmetry.qaf.example.steps", plugin ={
    "com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin", "pretty", "html:target/reports",
    "json:target/reports/cucumber.json"
} )
public class RunCucumberTest {
    
}
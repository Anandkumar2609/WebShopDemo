package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anand.kumar\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\WebShop.feature",
glue="com.stepDef",stepNotifications =true ,dryRun = false,monochrome = true,tags = "@CompareProduct")
public class Runner {

}

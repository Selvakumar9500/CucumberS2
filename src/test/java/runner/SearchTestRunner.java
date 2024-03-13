package runner;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //Used to report as Cucumber
@CucumberOptions(features="C:\\Users\\selva\\OneDrive\\Desktop\\SeleniumS2\\CucumberS2\\src\\test\\java\\feature\\Search.feature", 
glue= {"stepDefintion"},
plugin= {"html:target/cucumberreportSearch.html",
		"json:target/cucumber.json"	
})


public class SearchTestRunner {



}

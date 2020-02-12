package hdc2runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Hdc2Democucumber",glue="CucumberDemos",tags= {"@Regression or @Sanity"})
public class Runner {

}

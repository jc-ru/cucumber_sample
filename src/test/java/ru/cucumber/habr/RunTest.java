package ru.cucumber.habr;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"ru.cucumber.habr.steps"},
        tags = {"@test"}
)
public class RunTest {

}

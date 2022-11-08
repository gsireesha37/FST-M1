package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\002F5Z744\\IdeaProjects\\FST_Training\\src\\test\\java\\features",
        glue = {"stepDefinitions"},
        //tags = "@activity1"
        //tags = "@activity2"
        //tags = "@activity3"
        //tags = "@activity4"
        tags = "@activity5"
)

public class ActivitiesRunner {
    //empty
}
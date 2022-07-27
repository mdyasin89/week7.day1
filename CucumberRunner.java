package week7.day1.assignment.runner;

import io.cucumber.testng.CucumberOptions;
import week7.day1.assignment.steps.BaseClass;
                           
@CucumberOptions(features= {"src/test/java/week7.day1.assignment.features/F01_CreateLead.feature"}, glue="week7.day1.assignment.steps",monochrome=true,publish=true)
public class CucumberRunner extends BaseClass{

}

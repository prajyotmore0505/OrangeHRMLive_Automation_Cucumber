package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

@RunWith(Cucumber.class)		//to run file
@Cucumber.Options(features={"Featurefile"},glue={"Steps"})    		//file loaction, glue will search for coded file where u have coded
public class TestRunner 
{
	
	
	
}

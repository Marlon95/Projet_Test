package sqli.df.tp.tp_test;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InitTestSteps {
	private InitTest initTest;
	private Bar bar;
	private String result;
	
	@Given("^I want to configure my firefox browser$")
	public void i_want_to_configure_my_firefow_browser() throws Throwable {
		initTest = new InitTest();
		initTest.configureFirefoxBrowser();
	}
	
	@When("^I navigate to Google$")
	public void i_navigate_to_google() throws Throwable {
		initTest.navigateToGoogle();
	}
	
	@Then("^the title of the web page is Google$")
	public void the_title_of_the_web_page_is_google() throws Throwable {
		Assert.assertTrue("Title does match", initTest.getDriver().getTitle().equals("Google"));
	}
	
	@And("^I want to close my browser$")
	public void i_want_to_close_my_browser() throws Throwable {
		initTest.closeBrowser();
	}
	

	@Given("^Il y a (\\d+) sur (\\d+) dans le bar$")
	public void il_y_a_sur_dans_le_bar(int arg1, int arg2) throws Throwable {
	    bar = new Bar(arg2);
	    bar.setPeople(arg1);
	}

	@When("^(\\d+) sont arrives$")
	public void sont_arrives(int arg1) throws Throwable {
	    bar.add(arg1);
	}

	@Then("^le bar est complet : \"([^\"]*)\"$")
	public void le_bar_est_complet(String arg1) throws Throwable {
		
	    Assert.assertEquals(bar.isFull(), arg1 );
	}
}

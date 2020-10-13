package cuke.stepdefs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class IsItFriday {
	private String today;
	private String actualAnswer;
	
	@Given("today is \\\"([^\\\"]*)\\\"")
	public void today_is(String today) {
	    // Write code here that turns the phrase above into concrete actions
	    this.today = today;
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
	    // Write code here that turns the phrase above into concrete actions
	    actualAnswer = this.isItFriday(today);
	}

	@Then("I should be told \\\"([^\\\"]*)\\\"")
	public void i_should_be_told(String expectedAnswer) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(expectedAnswer, actualAnswer);
	}
	
	String isItFriday(String today) {
		return "Friday".equals(today) ? "TGIF" : "Nope";
	}
	
	

}

package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }
    
    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }
    
    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
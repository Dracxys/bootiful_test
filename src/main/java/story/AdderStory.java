package story;

import net.thucydides.core.annotations.Steps;
import steps.AdderRestSteps;

public class AdderStory {
    @Steps
    AdderRestSteps restSteps;

    @Given("a number")
    public void givenANumber() throws Exception{
        restSteps.givenCurrentNumber();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num){
        restSteps.whenAddNumber(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum(){
        restSteps.thenSummedUp();
    }
}

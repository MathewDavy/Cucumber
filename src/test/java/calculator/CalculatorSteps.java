package calculator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int result;

    @When("I calculate {int} + {int}")
    public void iCalculate(int arg0, int arg1) {
        result = arg0 + arg1;
    }

    @Then("the answer is {int}")
    public void theAnswerIs(int arg0) {
        assertEquals(arg0, result);
    }


    @When("I subtract {int} - {int}")
    public void iSubtract(int arg0, int arg1) {
        result = arg0 - arg1;
    }

    @Then("the answer is_ {int}")
    public void theAnswerIs_(int arg0) {
        assertEquals(arg0, result);
    }


    @When("I multiply {int} * {int}")
    public void iMultiply(int arg0, int arg1) {
        result = arg0 * arg1;
    }

    @Then("the answer is__ {int}")
    public void theAnswerIs__(int arg0) {
        assertEquals(arg0, result);
    }


}

package test;

import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import steps.AdderSteps;

@RunWith(SpringIntegrationSerenityRunner.class)
@ContextConfiguration(locations = "classpath:adder-beans.xml")
public class AdderSpringSerenityRunnerIntegrationTest {

    @Steps
    private AdderSteps adderSteps;
    @Value("#{props['adder']}") private int adder;
    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenBaseAndAdder(adder);
        adderSteps.whenAdd();
        adderSteps.summedUp();
    }
}
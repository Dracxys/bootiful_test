package fr.univ.lorraine.bootifultest;

import fr.univ.lorraine.bootifultest.steps.AdderServiceSteps;
import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringIntegrationSerenityRunner.class)
@ContextConfiguration(locations = "classpath:adder-beans.xml")
public class AdderSpringSerenityRunnerIntegrationIT {

    @Steps
    private AdderServiceSteps adderSteps;

    @Value("#{props['adder']}") private int adder;

    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenBaseAndAdder(adder);
        adderSteps.whenAdd();
        adderSteps.summedUp();
    }
}


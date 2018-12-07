package test;

import controller.AdderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import service.AdderService;

@ContextConfiguration(classes = {
        AdderController.class, AdderService.class })
public class AdderIntegrationTest extends SerenityStory {
    @Autowired
    private AdderService adderService;
    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new AdderController(adderService));
    }
}

package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/Features"},
        tags = "@mantis1",
        glue = {"Steps"}
)
public class RunCucumberTest extends RunnerBase {

    @BeforeClass
    public static void setUp() {
        // Inicializa o driver chamando o método da classe base
        getDriver();
    }

    @AfterClass
    public static void stop() {
        // Finaliza o driver chamando o método da classe base
        quitDriver();
    }
}


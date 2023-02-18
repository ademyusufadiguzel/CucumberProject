package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinition"//stepdefinitions path
)
public class Runner {



}

//Bu sinif Test caseleri Run etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir

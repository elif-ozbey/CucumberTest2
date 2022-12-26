package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;

import java.util.List;

public class w3SchoolsSD {
    @Given("kullanici w3 sayfasina gider")
    public void kullanici_w3_sayfasina_gider() {
        ReusableMethods.w3schoolTable();
    }
    @Then("kullanici ulke isimlerini alir")
    public void kullanici_ulke_isimlerini_alir() {
        List<WebElement> elements = ReusableMethods.getsutunelement(3);
        for (WebElement element: elements
             ) {
            System.out.println(element.getText());
        }

    }

}

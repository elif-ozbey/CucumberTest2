package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;


public class AmazonAramaSD {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getdriver().get("https://www.amazon.com/");
    }



    @Given("kullanici arama kutusuna iphone yazar")
    public void kullanici_arama_kutusuna_iphone_yazar() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }
    @Then("sayisini ekrana yazar")
    public void sayisini_ekrana_yazar() {
        // Write code here that turns the phrase above into concrete actions
        String sonucSayisi = amazonPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
}

package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {
        LoginPage loginPage = new LoginPage();
//1. List<String> olarak datalari depolayabiliriz
//        List<String> musteriBilgisi = dataTable.row(1);
//        System.out.println(musteriBilgisi.get(0));
//        System.out.println(musteriBilgisi.get(1));
//        loginPage.emailBox.sendKeys(musteriBilgisi.get(0));
//        loginPage.passwordBox.sendKeys(musteriBilgisi.get(1));
//        loginPage.loginLoginPage.click();
//2.      Datatable da datalari List<Map<String,String>> de depolayabiliriz
          List<Map<String,String>> musteriBilgisi = dataTable.asMaps(String.class, String.class);
        System.out.println(musteriBilgisi);
        for (Map<String,String> w : musteriBilgisi){
            loginPage.emailBox.sendKeys(w.get("email"));
            loginPage.passwordBox.sendKeys(w.get("sifre"));
            loginPage.loginLoginPage.click();
        }
    }

}

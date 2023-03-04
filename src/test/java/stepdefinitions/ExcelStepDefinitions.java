package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
//    Page Objelerini Olustur
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelDatalari;

    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {
        String path = ".\\src\\test\\resources\\testdata\\mysmoketestdata.xlsx";
//        String sayfa = "customer_info";
        excelUtils= new ExcelUtils(path,sayfaAdi);
        excelDatalari=excelUtils.getDataList();
//        NOTE Loop kodunu tamamla
        for(Map<String,String> w : excelDatalari){
            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
            loginPage = new LoginPage();
            loginPage.loginHomePage.click();
            loginPage.emailBox.sendKeys(w.get("username"));
            loginPage.passwordBox.sendKeys(w.get("password"));
            loginPage.loginLoginPage.click();
            assert loginPage.profileButton.isDisplayed();
            ReusableMethods.getScreenshot("Login_Goruntusu");
            loginPage.profileButton.click();
            loginPage.logOut.click();
            loginPage.logOutOK.click();
        }
        Driver.closeDriver();

    }

}

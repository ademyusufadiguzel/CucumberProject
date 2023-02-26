package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DataTablePage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        dataTablePage.newButton.click();
    }

    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
        dataTablePage.firstName.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        dataTablePage.lastName.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTablePage.position.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTablePage.office.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTablePage.extension.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        dataTablePage.start_date.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        dataTablePage.salary.sendKeys(string, Keys.ENTER);
    }

    @When("kullanici create butonuna basar")
    public void kullanici_create_butonuna_basar() {
        dataTablePage.createButton.click();
    }

    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        dataTablePage.searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Assert.assertTrue(dataTablePage.name.getText().contains(string));
    }


}

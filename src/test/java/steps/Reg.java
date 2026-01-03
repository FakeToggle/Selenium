package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Reg {
    WebDriver driver;

    @Given("i am on the website")
    public void iAmOnTheWebsite() {
        driver = new FirefoxDriver();
        driver.get("C:\\Users\\drimz\\Downloads\\Register\\Register.html");
    }

    @When("i enter date {string}")
    public void iEnterDate(String arg0) {
        WebElement text = driver.findElement(By.id("dp"));
        text.sendKeys(arg0);


    }

    @And("i enter first name {string}")
    public void iEnterFirstName(String arg0) {
        WebElement text = driver.findElement(By.id("member_firstname"));
        text.sendKeys(arg0);
    }

    @And("i enter last name {string}")
    public void iEnterLastName(String arg0) {
        WebElement text = driver.findElement(By.id("member_lastname"));
        text.sendKeys(arg0);
    }

    @And("i enter mail {string}")
    public void iEnterMail(String arg0) {
        WebElement text = driver.findElement(By.id("member_emailaddress"));
        text.sendKeys(arg0);
    }

    @And("i confirm mail {string}")
    public void iConfirmMail(String arg0) {
        WebElement text = driver.findElement(By.id("member_confirmemailaddress"));
        text.sendKeys(arg0);
    }

    @And("i enter pass {string}")
    public void iEnterPass(String arg0) {
        WebElement text = driver.findElement(By.id("signupunlicenced_password"));
        text.sendKeys(arg0);
    }

    @And("i confirm pass {string}")
    public void iConfirmPass(String arg0) {
        WebElement text = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        text.sendKeys(arg0);
    }

    @And("i accept tos")
    public void iAcceptTos() {
        driver.findElement(By.cssSelector("label[for='sign_up_25']")).click();
    }

    @And("i accept that im above {int} years")
    public void iAcceptThatImAboveYears(int arg0) {
        driver.findElement(By.cssSelector("label[for='sign_up_26']")).click();
    }

    @And("i press register button")
    public void iPressRegisterButton() {
        driver.findElement(By.name("join")).click();
    }

    @Then("registration passed")
    public void registrationPassed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("Success"));
        assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains("Success"));

    }



    @And("i accept the ethics")
    public void iAcceptTheEthics() {
        driver.findElement(By.cssSelector("label[for='fanmembersignup_agreetocodeofethicsandconduct']")).click();
    }

    @Then("account isnt created")
    public void accountIsntCreated() {
        assertFalse(Objects.requireNonNull(driver.getCurrentUrl()).contains("Success"));

    }
}

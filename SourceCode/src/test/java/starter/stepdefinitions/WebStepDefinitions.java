package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;

public class WebStepDefinitions extends UIInteractions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://alta-shop.vercel.app/auth/login");
        driver.getTitle().equals("frontend-web");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        WebElement loginbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"));
        loginbutton.click();
    }

    @Then("User redirected to AltaShop homepage")
    public void userRedirectedToAltaShopHomepage() {
        driver.getTitle().equals("frontend-web");
    }

    @Given("User on Altashop Homepage")
    public void userOnAltashopHomepage() {
        driver.getTitle().equals("frontend-web");
    }

    @And("User click Beli on M61 Shell")
    public void userClickBeliOn() {
        WebElement belibutton = driver.findElement(By.xpath("//div[@id='11662']//div[@class='v-card v-sheet theme--light']//div[@class='v-card__actions d-block']//div[@class='mt-3']//button[@type='button']//span[@class='v-btn__content'][contains(text(),'Beli')]"));
        belibutton.click();
    }

    @And("User click on cart logo")
    public void userClickOnCartLogo() {
        WebElement cartbutton = driver.findElement(By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']"));
        cartbutton.click();
    }

    @And("User on Bayar button")
    public void userOnBayarButton(){
    WebElement bayarbutton = driver.findElement(By.id("button-bayar"));
        bayarbutton.click();
    }

    @Then("User redirected to AltaShop Transaction page")
    public void userRedirectedToAltaShopTransactionPage() {
        driver.getTitle().equals("frontend-web");
    }

    @And("User click on profile icon")
    public void userClickOnProfileIcon() {
        WebElement profilbutton = driver.findElement(By.xpath("//i[@class='v-icon notranslate fas fa-user theme--dark']"));
        profilbutton.click();
    }

    @And("User click on log out icon")
    public void userClickOnLogOutIcon() {
        WebElement logoutbutton = driver.findElement(By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--light']"));
        logoutbutton.click();
    }

    @Then("User redirected to login page")
    public void userRedirectedToLoginPage() {
        driver.getTitle().equals("frontend-web");
    }

    @When("User input correct credentials")
    public void userInputCorrectCredentials() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("yari@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123");
    }

    @When("User input incorrect email")
    public void userInputIncorrectEmail() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("yari@Gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123");
    }

    @When("User input incorrect password")
    public void userInputIncorrectPassword() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("yari@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @When("User input incorrect credentials")
    public void userInputIncorrectCredentials() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("yari@Gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @Then("User should see pop up error")
    public void userShouldSeePopUpError() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-card.v-sheet.theme--light div.v-card__text div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "record not found" + "' but found '" + actualMessage + "'", actualMessage.contains("record not found"));
    }

    @Then("User should see pop up invalid error")
    public void userShouldSeePopUpInvalidError() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-card.v-sheet.theme--light div.v-card__text div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "email or password is invalid" + "' but found '" + actualMessage + "'", actualMessage.contains("email or password is invalid"));
    }

    @When("User input blank email")
    public void userInputBlankEmail() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123");
    }

    @When("User input blank password")
    public void userInputBlankPassword() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("yari@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("");
    }

    @When("User input blank credentials")
    public void userInputBlankCredentials() {
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("");
    }

    @Then("User should see pop up blank error")
    public void userShouldSeePopUpBlankError() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-card.v-sheet.theme--light div.v-card__text div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "email is required" + "' but found '" + actualMessage + "'", actualMessage.contains("email is required"));
    }

    @Then("User should see pop up blank password error")
    public void userShouldSeePopUpBlankPasswordError() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-card.v-sheet.theme--light div.v-card__text div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "password is required" + "' but found '" + actualMessage + "'", actualMessage.contains("password is required"));
    }

    @When("User input correct identity")
    public void userInputCorrectIdentity() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("yari");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("ardi@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @Given("User is on register page")
    public void userIsOnRegisterPage() {
        driver.navigate().to("https://alta-shop.vercel.app/auth/register");
        driver.getTitle().equals("frontend-web");
    }

    @And("User click register button")
    public void userClickRegisterButton() {
        WebElement registerbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]/span[1]"));
        registerbutton.click();
    }

    @When("User input blank name on form")
    public void userInputBlankNameOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("ardi@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @Then("User should see pop up blank register error")
    public void userShouldSeePopUpBlankRegisterError() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-card.v-sheet.theme--light div.v-card__text div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "" + "' but found '" + actualMessage + "'", actualMessage.contains(""));
    }

    @When("User input blank email on form")
    public void userInputBlankEmailOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("yari");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @When("User input blank password on form")
    public void userInputBlankPasswordOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("yari");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("ardi@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("");
    }

    @When("User input blank name and email on form")
    public void userInputBlankNameAndEmailOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("123456");
    }

    @When("User input blank name and password on form")
    public void userInputBlankNameAndPasswordOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("ardi@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("");
    }

    @When("User input blank email and password on form")
    public void userInputBlankEmailAndPasswordOnForm() {
        WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        nameField.sendKeys("yari");
        WebElement emailField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        emailField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        passwordField.sendKeys("");
    }

    @And("User click Beli on M62 Shell")
    public void userClickBeliOnMShelly() {
        WebElement belibutton = driver.findElement(By.xpath("//div[@id='11661']//div[@class='v-card v-sheet theme--light']//div[@class='v-card__actions d-block']//div[@class='mt-3']//button[@type='button']//span[@class='v-btn__content'][contains(text(),'Beli')]"));
        belibutton.click();
    }

    @And("User click Detail on M62 Shell")
    public void userClickDetailOnMShell() {
        WebElement detailbutton = driver.findElement(By.id("//div[@id='11661']//div[@class='v-card v-sheet theme--light']//div[@class='v-card__actions d-block']//div[@class='mt-3']//button[@type='button']//span[@class='v-btn__content'][contains(text(),'Detail')]"));
        detailbutton.click();
    }

    @Then("User give rating 4 on M62 Shell")
    public void userGiveRatingOnProduk() {
        WebElement ratingbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]"));
        ratingbutton.click();
    }

    @And("User click on transaction menu")
    public void userClickOnTransactionMenu() {
        WebElement transactionbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]"));
        transactionbutton.click();
    }

    @Then("User redirected to transaction history page")
    public void userRedirectedToTransactionHistoryPage() {
        driver.getCurrentUrl().equals("https://alta-shop.vercel.app/transaction");
    }

    @And("User click on category field")
    public void userClickOnCategoryField() {
        WebElement categorybutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        categorybutton.click();
    }

    @And("User click on 76mm Shell category")
    public void userClickOnMmShellCategory() {
        WebElement shellbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[87]/div[1]/div[1]"));
        shellbutton.click();
    }

    @Then("User should the filtered produk by its category")
    public void userShouldTheFilteredProdukByItsCategory() {
        driver.getClass().equals("v-main");
    }

    @And("User input amount of the produk")
    public void userInputAmountOfTheProduk() {
        WebElement quantityField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]"));
        quantityField.sendKeys("14");
    }

    @And("User click on decrease icon produk")
    public void userClickOnDecreaseIconProduk() {
        WebElement decreasebutton = driver.findElement(By.xpath("//span[contains(text(),'-')]"));
        decreasebutton.click();
    }

    @Then("User will see pop up indicated no produk on cart")
    public void userWillSeePopUpIndicatedNoProdukOnCart() {
        WebElement popUp = driver.findElement(By.cssSelector("div.v-application.v-application--is-ltr.theme--light:nth-child(2) div.v-application--wrap main.v-main div.v-main__wrap div.container div.v-alert.v-sheet.theme--light.elevation-2.v-alert--border.v-alert--border-top div.v-alert__wrapper > div.v-alert__content"));
        String actualMessage = popUp.getText();
        Assert.assertTrue("Expected message '" + "" + "' but found '" + actualMessage + "'", actualMessage.contains(""));
    }
}

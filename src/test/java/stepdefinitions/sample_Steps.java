package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sample_Steps {
    public static WebDriver driver;
    @Given("User is on Vahan Page")
    public void user_is_on_vahan_page() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
driver = new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
        System.out.println("Navigate to URL...");
    }
    @When("User Enter state and rto")
    public void user_enter_state_and_rto() {
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
    }

    @Then("Message displayed")
    public void message_displayed() {
        System.out.println("LogOut Successfully");
    }


}

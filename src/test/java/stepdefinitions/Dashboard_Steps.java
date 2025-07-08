package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
//
//import static pages.Dashboard_Page.driver;
//import static pages.Dashboard_Page.navigateToUrl;

public class Dashboard_Steps {
WebDriver driver = null;
    public ChromeOptions options;
    @Given("^User is on Home Page$")
    public void user_is_on_home_Page() throws Throwable {
//        navigateToUrl();
         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");


//        options.addArguments("y--headless");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
        System.out.println("Navigate to URL...");
    }
    @When("^User Enter Assam\\((\\d+)\\) and BARPETA - AS(\\d+)\\( (\\d+)-DEC-(\\d+) \\)$")
    public void user_Enter_Assam_and_BARPETA_AS_DEC(int arg1, int arg2, int arg3, int arg4) throws Throwable {

    }

    @When("^User select Y_Axis and X_Axis and Click Refresh$")
    public void user_select_Y_Axis_and_X_Axis_and_Click_Refresh() throws Throwable {

    }

    @When("^User select Month and Year$")
    public void user_select_Month_and_Year() throws Throwable {

    }

    @When("^User select Vehicle Category and Click Refresh$")
    public void user_select_Vehicle_Category_and_Click_Refresh() throws Throwable {
    }

    @Then("^Message displayed Maker Wise Fuel Data of RTO, State \\(Month,Year\\)$")
    public void message_displayed_Maker_Wise_Fuel_Data_of_RTO_State_Month_Year() throws Throwable {

    }




}

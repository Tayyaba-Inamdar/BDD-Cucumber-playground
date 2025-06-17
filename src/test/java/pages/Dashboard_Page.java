package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.time.Duration;

public class Dashboard_Page extends BrowserDriver {
  public static String label_State =  "//label[contains(text(),'All Vahan4 Running States')]";
  public static String label_rto = "//label[contains(text(),'All Vahan4 Running Office')]";
  static WebElement li_state =  driver.findElement(By.xpath("//li[text()='Assam(36)']"));

   static WebElement li_rto = driver.findElement(By.xpath("//li[text()='BARPETA - AS15( 29-DEC-2016 )']"));

  public static void navigateToUrl() throws Throwable {
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
      driver.get("https://vahan.parivahan.gov.in/vahan4dashboard/vahan/vahan/view/reportview.xhtml");
      System.out.println("Navigate to URL...");
  }
  public static void set_State()throws InterruptedException{
      Thread.sleep(2000);
      driver.findElement(By.xpath(label_State)).click();
      actions.moveToElement(li_state).click().build().perform();
      Thread.sleep(2000);
  }

    public static void set_Rto()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(label_rto)).click();
        actions.moveToElement(li_rto).click().build().perform();
        Thread.sleep(2000);
    }

}

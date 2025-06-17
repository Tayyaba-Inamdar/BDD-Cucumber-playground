package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class BrowserDriver {
    public static WebDriver driver;
    public static Actions actions;
    public ChromeOptions options;

    public BrowserDriver(){
        String DOWNLOAD_FOLDER_PATH =  ((System.getProperty("user.dir") + File.separator) + "Data Files") + File.separator;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");

        Map<String,Object> preferences= new HashMap<>();
        preferences.put("profile.default_content_settings.popups", 0);
        preferences.put("download.default_directory",DOWNLOAD_FOLDER_PATH);

//        options.addArguments("y--headless");
        options.setExperimentalOption("prefs",preferences);

        this.driver = new ChromeDriver(options);
        this.actions = new Actions(driver);
     }
     public void close(){
        this.driver.close();
     }


}




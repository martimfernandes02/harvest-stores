package harvestdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TommyHarvestDefinition {

    public void TommyDetectionDefinition() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/marti/Desktop/project-clothes/harvest-stores/harvester/src/main/java/harvestdef/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pt.tommy.com/mens-clothes");
    }
}

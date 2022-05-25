package autoapp.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;



public class Waits {


    public static FluentWait setFluentWait(WebDriver driver) {
        FluentWait wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofMillis(250));
        return wait;
    }

}

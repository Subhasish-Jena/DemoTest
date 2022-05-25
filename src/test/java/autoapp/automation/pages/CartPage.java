package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;

import static autoapp.automation.utility.Waits.setFluentWait;

public class CartPage extends BasePage{

    public static String cart_Xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b";
    public static String table_Xpath = "//*[@id=\"cart_summary\"]";



    public CartPage(BrowserDriver driver) {
        super(driver);
    }



    public static void clickOnCartOption(){
        driver.findElement(By.xpath(cart_Xpath)).click();
    }

    public static void waitForTableToLoad() {
        FluentWait wait = setFluentWait(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(table_Xpath)));
    }

    public static void verifyRowDetails() {
        List<WebElement>rows = driver.findElements(By.xpath(table_Xpath + "/tbody/tr"));
        Assert.assertTrue("Expected rows mismatch", rows.size() == 1);

        List<WebElement> cols = rows.get(0).findElements(By.tagName("td"));
        List<WebElement> desc = cols.get(1).findElements(By.tagName("small"));
        String colorOnTable = desc.get(1).getText();

        Assert.assertTrue("Expected colour was blue",colorOnTable.toLowerCase().contains("blue"));
    }

}

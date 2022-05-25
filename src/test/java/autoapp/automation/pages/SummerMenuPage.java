package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class SummerMenuPage extends BasePage{

    public static String dresses_Xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";
    public static String summerDresses_Xpath = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a";
    public static String summerDressesPageMsg_Xpath = "//*[@id=\"center_column\"]/div[1]/div/div/span";


    public static String hover_Xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img";
    public static String blueColor_Xpath = "//*[@id=\"color_14\"]";


    public SummerMenuPage(BrowserDriver driver) {
        super(driver);
    }

    public static void clickDresses(){
        driver.findElement(By.xpath(dresses_Xpath)).click();
    }

    public static void clickSummerDresses(){
        driver.findElement(By.xpath(summerDresses_Xpath)).click();
    }

    public static void checkSummerPageMessage(){
        Assert.assertTrue(driver.findElement(By.xpath(summerDressesPageMsg_Xpath)).getText().contains("Summer Dresses"));
    }

    public static void hoverAndClickElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(hover_Xpath)));
        driver.findElement(By.xpath(hover_Xpath)).click();
    }

    public static void switchFrame() {
        driver.switchTo().frame(0);
    }

    public static void selectColor() {
        driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/div/fieldset[2]/div/ul/li[3]/a")).click();
    }

    public static void addToCart() {
        driver.findElement(By.id("add_to_cart")).click();
    }

    public static void backToHomePage() throws InterruptedException {
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
    }
}

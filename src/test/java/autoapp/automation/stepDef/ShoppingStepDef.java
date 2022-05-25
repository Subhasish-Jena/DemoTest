package autoapp.automation.stepDef;

import autoapp.automation.pages.CartPage;
import autoapp.automation.pages.SummerMenuPage;
import cucumber.api.java.en.When;

public class ShoppingStepDef {

    @When("^I click on Dresses menu option$")
    public void i_click_dresses_option(){
        SummerMenuPage.clickDresses();
    }

    @When("^I click on Summer Dresses sub menu option$")
    public void i_click_summer_dresses_option(){
        SummerMenuPage.clickSummerDresses();
    }

    @When("^I should see Summer Dresses page loaded$")
    public void i_check_text_on_summer_dresses_page(){
        SummerMenuPage.checkSummerPageMessage();

    }

    @When("^I select dress and colour$")
    public void i_select_dress_color() {
        SummerMenuPage.hoverAndClickElement();
        SummerMenuPage.switchFrame();
        SummerMenuPage.selectColor();
    }

    @When("^I add item to Cart$")
    public void i_add_item_to_Cart(){
        SummerMenuPage.addToCart();
    }

    @When("^I navigate back to Summer Dresses Page$")
    public void i_navigate_back_to_main_page() throws InterruptedException {
        SummerMenuPage.backToHomePage();
    }

    @When("^I verify contents of the cart has selected colour$")
    public void i_view_cart_summary(){
        CartPage.clickOnCartOption();
        CartPage.waitForTableToLoad();
        CartPage.verifyRowDetails();
    }

}

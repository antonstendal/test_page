package testQaToolsElementsCheckBox.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsCheckBox extends PageObject {
    public final By elementCheckbox = By.cssSelector("li[id='item-1']");
    public final By selectElementCheckboxDesktop = By.xpath("//span[text()='Desktop']");
    public final By clickCollapseCheckbox = By.xpath("//button[@class='rct-collapse rct-collapse-btn']");


    public void openQaToolElements() {
        WebDriver driver = getDriver();
        driver.navigate().to("https://demoqa.com/elements");
    }

    public void choseElementCheckBox() {
        find(elementCheckbox).click();
    }

    public void collapseCheckBox() {
        find(clickCollapseCheckbox).click();
    }

    public void elementDesktop() {
        find(selectElementCheckboxDesktop).click();
    }
}

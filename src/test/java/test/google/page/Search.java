package test.google.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class Search extends PageObject {
    private final By textArea = By.cssSelector("textarea[role='combobox']");
    private final By acceptCookiesButton = By.cssSelector("button[id='L2AGLb']");

    public void openGoogleSearch() {
        WebDriver driver = getDriver();
        driver.navigate().to("https://www.google.com/");
    }

    public void typeIntoSearchTextarea(String text) {
        find(textArea).isPresent();
        find(textArea).typeAndEnter(text);
    }

    public void acceptCookies() {
        find(acceptCookiesButton).click();
    }

    public void temperatureIsUnder(int maxValue) {
        String text = find(By.cssSelector("span[id='wob_tm']")).getText();
        assertThat(Integer.valueOf(text)).isLessThan(maxValue);
    }
}

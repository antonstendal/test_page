package test.google.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class Search extends PageObject {
    //private final By textArea = By.cssSelector("textarea[role='combobox']");
    private final By textArea = By.cssSelector("input[id='search-field']");
    //private final By acceptCookiesButton = By.cssSelector("button[id='L2AGLb']");
    private final By enterTheNameMovie = By.cssSelector("input[id='search-field']");
    private final By enterMadMax = By.cssSelector("a[href='https://hdrezka.ag/films/fiction/9340-bezumnyy-maks-doroga-yarosti-2015.html']");
    private final By playMovieMadMax = By.cssSelector("div[id='cdnplayer']");

    public void openGoogleSearch() {
        WebDriver driver = getDriver();
        driver.navigate().to("https://hdrezka.ag/");
    }

    public void enterValue() {
        find(enterTheNameMovie).click();
    }

    public void enterSearchNameMovie(String text) {
        find(textArea).isPresent();
        find(textArea).typeAndEnter(text);
    }

    public void enterMadMaxMovie() {
        find(enterMadMax).click();
    }

    public void clickPlayMadMaxMovie() {
        find(playMovieMadMax).click();
    }


   /* public void typeIntoSearchTextarea(String text) {
        find(textArea).isPresent();
        find(textArea).typeAndEnter(text);
    }

    public void acceptCookies() {
        find(acceptCookiesButton).click();
    }

    public void temperatureIsUnder(int maxValue) {
        String text = find(By.cssSelector("span[id='wob_tm']")).getText();
        assertThat(Integer.valueOf(text)).isLessThan(maxValue);
    }*/
}

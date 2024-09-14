package test.google;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import test.google.page.Search;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleSearchTest {
    Search search = new Search();

    @Test
    public void itIsPossibleToFindWeatherUsingSearch() {
        search.openGoogleSearch();
        search.enterValue();
        search.enterSearchNameMovie("Mad max");
        search.enterMadMaxMovie();
        search.clickPlayMadMaxMovie();
        /*search.acceptCookies();
        search.typeIntoSearchTextarea("Weather Łódz");
        search.temperatureIsUnder(30);*/

    }
}

package starter.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://unsplash.com/")
public class TestPage extends PageObject {
    private By btnLogin = By.xpath("//*[@id=\"app\"]/div/div/header/nav/div[2]/div[2]/div[5]/a");
    private By inputEmail = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/label[1]/input");
    private By inputPassword = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/label[2]/input");
    private By btnLoginInForm = By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/button");

    public TestPage clickBtnLogin () {
        find(btnLogin).click(); //иетодп назодит элемент и повесили на нешл оюраюоьчкт click
        return this;
    }
}

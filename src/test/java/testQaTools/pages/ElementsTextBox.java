package testQaTools.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class ElementsTextBox extends PageObject {
    private final By choseElementsTextBox = By.cssSelector("li[id='item-0']");
    private final By textAreaInputName = By.cssSelector("input[id='userName']");
    private final By textAreaInputEmail = By.cssSelector("input[id='userEmail']");
    private final By textAreaInputCurrentAddress = By.cssSelector("textarea[id='currentAddress']");
    private final By textAreaInputPermanentAddress = By.cssSelector("textarea[id='permanentAddress']");
    private final By choseButtonSubmit = By.cssSelector("button[id='submit']");
    private final By inputResult = By.cssSelector("div[class='border col-md-12 col-sm-12']");

    public void elementsTextBox() {
        find(choseElementsTextBox).click();
    }

    public void inputName(String userName) {
         find(textAreaInputName).click();
         find(textAreaInputName).typeAndEnter(userName);
    }
    public void inputEmail(String userEmail) {
        find(textAreaInputEmail).click();
        find(textAreaInputEmail).typeAndEnter(userEmail);
    }
    public void inputTextAreaCurrentAddress(String userCurrentAddress) {
        find(textAreaInputCurrentAddress).click();
        find(textAreaInputCurrentAddress).typeAndEnter(userCurrentAddress);
    }
    public void inputTextAreaPermanentAddress(String userPermanentAddress) {
        find(textAreaInputPermanentAddress).click();
        find(textAreaInputPermanentAddress).typeAndEnter(userPermanentAddress);
    }
    public void buttonSubmit() {
        find(choseButtonSubmit).click();
    }

    public void checkInputResult(String name, String email, String currentAddress, String permanentAddress) {
        String valueInput = find(By.cssSelector("div[class='border col-md-12 col-sm-12']")).getText();
        assertThat(valueInput).isEqualTo(name,email,currentAddress,permanentAddress);
    }

}

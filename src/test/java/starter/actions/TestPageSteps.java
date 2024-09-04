package starter.actions;

import net.serenitybdd.annotations.Step;
import starter.page.TestPage;

public class TestPageSteps {

    TestPage testPage;

    @Step
    public void openPage() {
        testPage.open();
    }

    @Step
    public void clickBtnLogin () {
        testPage.clickBtnLogin();
    }

    @Step
    public void writeEmailInInput (String email) {
        testPage.writeEmail(email);
    }

    @Step
    public void writePasswordInInput (String password) {
        testPage.writePassword(password);
    }

    @Step
    public void clicklInButtonLogin () {
        testPage.clickBtnLoginInForm();
    }
}

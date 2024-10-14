package testQaToolsElementsTextBox;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testQaToolsElementsTextBox.pages.ElementsTextBox;
import testQaToolsElementsTextBox.pages.ElementsTestPageMain;

@ExtendWith(SerenityJUnit5Extension.class)
public class QaToolsTestTextBox {
    ElementsTestPageMain elementsTest = new ElementsTestPageMain();
    ElementsTextBox elementsTextBox = new ElementsTextBox();

    @Test
    public void testingElementsQaTool() {
        elementsTest.openWebAppQaTool();
        elementsTest.clickButtonElements();
        elementsTextBox.elementsTextBox();
        elementsTextBox.inputName("Anton");
        elementsTextBox.inputEmail("anton@gmail.com");
        elementsTextBox.inputTextAreaCurrentAddress("London");
        elementsTextBox.inputTextAreaPermanentAddress("Paris");
        elementsTextBox.buttonSubmit();
    }
}

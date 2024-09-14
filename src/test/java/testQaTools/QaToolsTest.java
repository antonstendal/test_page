package testQaTools;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testQaTools.pages.ElementsTextBox;
import testQaTools.pages.ElementsTestPageMain;

@ExtendWith(SerenityJUnit5Extension.class)
public class QaToolsTest {
    ElementsTestPageMain elementsTest = new ElementsTestPageMain();
    ElementsTextBox elementsTestPage2 = new ElementsTextBox();

    @Test
    public void testingElementsQaTool() {
        elementsTest.openWebAppQaTool();
        elementsTest.clickButtonElements();
        elementsTestPage2.elementsTextBox();
        elementsTestPage2.inputName("Anton");
        elementsTestPage2.inputEmail("anton@gmail.com");
        elementsTestPage2.inputTextAreaCurrentAddress("London");
        elementsTestPage2.inputTextAreaPermanentAddress("Paris");
        elementsTestPage2.buttonSubmit();
    }
}

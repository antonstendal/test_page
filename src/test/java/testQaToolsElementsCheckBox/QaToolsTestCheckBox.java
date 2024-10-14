package testQaToolsElementsCheckBox;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testQaToolsElementsCheckBox.pages.ElementsCheckBox;

@ExtendWith(SerenityJUnit5Extension.class)

public class QaToolsTestCheckBox {
    ElementsCheckBox elementsCheckBox = new ElementsCheckBox();

    @Test
    public void testingElementsCheckBox() {
        elementsCheckBox.openQaToolElements();
        elementsCheckBox.choseElementCheckBox();
        elementsCheckBox.collapseCheckBox();
        elementsCheckBox.elementDesktop();

    }
}

package starter.ui.Registration;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static Target LABEL_NAME = Target.the("Label Name").locatedBy("//strong[contains(text(), 'Nombre')]/parent::p");
    public static Target LABEL_LAST_NAME = Target.the("Label Name").locatedBy("//strong[contains(text(), 'Apellido')]/parent::p");
}

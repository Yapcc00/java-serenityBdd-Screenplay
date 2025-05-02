package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.Registration.RegisterForm;

public class ShouldSeeAllFieldsAreRequiered implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(RegisterForm.ALERT_ALL_REQUIERED_FIELDS).text().contains("Por favor diligencie todos los campos")
        );
    }
}

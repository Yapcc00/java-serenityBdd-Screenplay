package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.Registration.RegisterForm;

import java.net.URISyntaxException;

public class RegisterUser implements Task {

  private final  String expectedName ;
  private final String ExpectedLastName;
  private final String ExpectedEmail;
  private final String ExpectedAge;
  private final String ExpectedCountry;

    public RegisterUser (String expectedName,String ExpectedLastName,String ExpectedEmail,String ExpectedAge,  String ExpectedCountry ){
        this.expectedName = expectedName;
        this.ExpectedLastName = ExpectedLastName;
        this.ExpectedEmail = ExpectedEmail;
        this.ExpectedAge = ExpectedAge;
        this.ExpectedCountry = ExpectedCountry;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(expectedName).into(RegisterForm.INPUT_NAME),

                    Enter.theValue(ExpectedLastName).into(RegisterForm.INPUT_LAST_NAME),

                    Enter.theValue(ExpectedAge).into(RegisterForm.INPUT_AGE),

                    // dropdown
                    SelectFromOptions.byVisibleText(ExpectedCountry).from(RegisterForm.SELECT_COUNTRY),

                    Click.on(RegisterForm.INPUT_GENDER),

                    Enter.theValue(ExpectedEmail).into(RegisterForm.INPUT_EMAIL),

                    Click.on(RegisterForm.INPUT_DAY),

                    //subir archivo
                    Upload.theClasspathResource("pictures/foto.jpg").
                            to(RegisterForm.INPUT_FILE_UPLOAD),

                    Click.on(RegisterForm.INPUT_BTN_SAVE));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}

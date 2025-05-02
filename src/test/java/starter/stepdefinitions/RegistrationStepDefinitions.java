package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.task.registration.CheckNewAccountCreated;
import starter.task.registration.DoNotSendAllRequieredInformation;
import starter.task.registration.RegisterUser;
import starter.task.registration.ShouldSeeAllFieldsAreRequiered;

import java.net.URISyntaxException;


public class RegistrationStepDefinitions {

    String expectedName = "Yeison";
    String ExpectedLastName = "Parra";
    String ExpectedEmail = "y@gmail.com";
    String ExpectedAge = "26";
    String ExpectedCountry = "Colombia";

    @Given("{actor} wants to sing up in the aplication")
    public void wantsToSingUpInTheAplication(Actor actor) {
    //abrir navegador
        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/registration/register.html"));
    }

    @When("{actor} sends the requieres information to song up")
    public void pepitoSendsTheRequieresInformationToSongUp(Actor actor) throws URISyntaxException {
      actor.attemptsTo(
              new RegisterUser("Yeison","Parra","yeison@gmail.com","24","Colombia"));
    }

    @Then("{actor} should have a new account created")
    public void pepitoShouldHaveANewAccountCreated(Actor actor) {
    actor.attemptsTo(
            new CheckNewAccountCreated("Yeison","Parra")
    );
    }

    @When("{actor} does not send the requiere the information")
    public void pepitoDoesNotSendTheRequiereTheInformation(Actor actor) {
    actor.attemptsTo(
            new DoNotSendAllRequieredInformation("Yeison","Parra")
    );

    }

    @Then("{actor} should be told all fields are requiered")
    public void pepitoShouldBeToldAllFieldsAreRequiered(Actor actor) {
    actor.attemptsTo(
     new ShouldSeeAllFieldsAreRequiered()
    );
    }

}

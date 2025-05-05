package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.task.registration.CheckNewAccountCreated;
import starter.task.registration.DoNotSendAllRequieredInformation;
import starter.task.registration.RegisterUser;
import starter.task.registration.ShouldSeeAllFieldsAreRequiered;
import starter.ui.Registration.RegisterPage;

import java.net.URISyntaxException;
import java.util.List;


public class RegistrationStepDefinitions {
    String expectedName = "";
    String expectedLastName = "";
    String expectedEmail ="";
    String expectedAge ="";
    String expectedCountry =" ";

    @Given("{actor} wants to sing up in the aplication")
    public void wantsToSingUpInTheAplication(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new RegisterPage()));
    }

    @When("{actor} sends the requieres information to song up")
    public void pepitoSendsTheRequieresInformationToSongUp(Actor actor, DataTable dataTable) throws URISyntaxException {

        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> colums: rows){
        expectedName = colums.get(0);
        expectedLastName = colums.get(1);
        expectedAge = colums.get(2);
        expectedEmail = colums.get(3);
        expectedCountry = colums.get(4);
        }

      actor.attemptsTo(
              new RegisterUser(expectedName,expectedLastName,expectedEmail,expectedAge,expectedCountry));
    }

    @Then("{actor} should have a new account created")
    public void pepitoShouldHaveANewAccountCreated(Actor actor) {
    }

    @When("{actor} does not send the requiere the information")
    public void pepitoDoesNotSendTheRequiereTheInformation(Actor actor) {
    actor.attemptsTo(
            new DoNotSendAllRequieredInformation(expectedName,expectedLastName)
    );

    }

    @Then("{actor} should be told all fields are requiered")
    public void pepitoShouldBeToldAllFieldsAreRequiered(Actor actor) {
    actor.attemptsTo(
     new ShouldSeeAllFieldsAreRequiered()
    );
    }

}

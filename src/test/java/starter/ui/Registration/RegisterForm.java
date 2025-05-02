package starter.ui.Registration;

import net.serenitybdd.screenplay.targets.Target;


public class RegisterForm {

    public static Target INPUT_NAME = Target.the("input name").locatedBy("//input[@id='name']");
    public static Target INPUT_LAST_NAME = Target.the("input name").locatedBy("//input[@id='last-name']");
    public static Target INPUT_AGE = Target.the("input name").locatedBy("//input[@id='age']");
    public static Target SELECT_COUNTRY = Target.the("input name").locatedBy("//select[@id='country']");
    public static Target INPUT_GENDER = Target.the("input name").locatedBy("//input[@id='sex-m']");
    public static Target INPUT_EMAIL = Target.the("input name").locatedBy("//input[@id='email']");
    public static Target INPUT_DAY = Target.the("input name").locatedBy("//input[@id='thursday']");
    public static Target INPUT_FILE_UPLOAD = Target.the("input name").locatedBy("//input[@id='picture']");
    public static Target INPUT_BTN_SAVE = Target.the("input name").locatedBy("//button[@id='save-btn']");


    public static Target ALERT_ALL_REQUIERED_FIELDS = Target.the("alert").locatedBy("//div[@class='alert alert-danger']");

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_layer.Validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Pawel
 */
@FacesValidator("ibanValidator")
public class IbanValidator implements Validator {

    private final String ibanValidatioRegex = "^[0-9]*$";
    
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String model = (String) value;

        if (!model.matches(ibanValidatioRegex)) {
            FacesMessage msg = new FacesMessage(
                    "To nie jest poprawny numer Iban");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);

            throw new ValidatorException(msg);
        }
    }
}
